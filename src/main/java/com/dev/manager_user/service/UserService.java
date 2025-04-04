package com.dev.manager_user.service;

import com.dev.manager_user.model.User;
import com.dev.manager_user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Create a new user
    public User createUser(User user){
        if (userRepository.findByEmail(user.getEmail()).isPresent()){
            throw new RuntimeException("Email already exist");
        }
        return userRepository.save(user);
    }

    // Find user from id
    public Optional<User> findByID(Long id){
        return userRepository.findById(id);
    }

    // List all the users
    public List<User> listUsers(){
        return userRepository.findAll();
    }

    // Delete users from id
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
