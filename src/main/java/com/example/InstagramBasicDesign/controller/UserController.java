package com.example.InstagramBasicDesign.controller;

import com.example.InstagramBasicDesign.service.UserService;
import com.example.InstagramBasicDesign.model.AuthenticationToken;
import com.example.InstagramBasicDesign.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<User> signUp(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return ResponseEntity.ok(createdUser);

    }

    @PostMapping("/signin")
    public ResponseEntity<String> signIn(@RequestBody User user) {
        User users = userService.signIn(user.getEmail());
        if (users != null) {
            // Implement JWT token generation and return it here
            String jwtToken = generateJwtToken(users);
            return ResponseEntity.ok(jwtToken);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed");
        }
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User updatedUser = userService.updateUser(user);
        return ResponseEntity.ok(updatedUser);
    }

    private String generateJwtToken(User user) {
        // Implement JWT token generation here
        return "YOUR_JWT_TOKEN";
    }
}

