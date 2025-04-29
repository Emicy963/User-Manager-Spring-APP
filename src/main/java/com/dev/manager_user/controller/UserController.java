package com.dev.manager_user.con            user.setName(userDTO.getName());
            user.setEmail(userDTO.getEmail());
            user.setPassword(userDTO.getPassword());

            User newUser = userService.createUser(user);
            return ResponseEntity.ok(newUser);
        } catch (RuntimeException e){
            return ResponseEntity.badRequest().body(null);
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
