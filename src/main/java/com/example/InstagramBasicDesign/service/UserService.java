package com.example.InstagramBasicDesign.service;

import com.example.InstagramBasicDesign.model.User;
import com.example.InstagramBasicDesign.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public User signIn(String email) {
        // Implement sign-in logic here
        User user = userRepository.findByEmail(email);
        if (user != null) {
            return user;
        }
        return null;
    }
}
