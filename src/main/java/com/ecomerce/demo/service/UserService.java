package com.ecomerce.demo.service;

import com.ecomerce.demo.dto.UserRequestDTO;
import com.ecomerce.demo.dto.UserResponseDTO;
import com.ecomerce.demo.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {

    private final List<UserResponseDTO> users = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong(1);

    public UserResponseDTO createUser(UserRequestDTO userRequestDTO) {
        UserResponseDTO responseDTO = new UserResponseDTO(
                counter.getAndIncrement(),
                userRequestDTO.getUsername(),
                userRequestDTO.getEmail()
        );
        users.add(responseDTO);
        return responseDTO;
    }

    public List<UserResponseDTO> getAllUsers() {
        return users;
    }

    public UserResponseDTO getUserById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
    }
}
