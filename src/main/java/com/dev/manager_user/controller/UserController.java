package com.dev.manager_user.controller;

import com.dev.manager_user.model.User;
import com.dev.manager_user.repository.UserRepository;
import com.dev.manager_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    // POST /users -> Create a new User
    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user){
        try {
            User newUser = userService.createUser(user);
            return ResponseEntity.ok(newUser);
        } catch (RuntimeException e){
            return ResponseEntity.badRequest().build();
        }
    }

    // GET /users -> List all users
    @GetMapping
    public ResponseEntity<List<User>> listUsers(){
        List<User> users = userService.listUsers();
        return ResponseEntity.ok(users);
    }

    // GET /users/{id} -> Find user form id
    @GetMapping("/{id}")
    public ResponseEntity<User> findByID(@PathVariable Long id){
        return userService.findByID(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE /users/{id} -> Delete user from id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        if (userService.findByID(id).isPresent()){
            userService.deleteUser(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
