package com.example.InstagramBasicDesign.service;

import com.example.InstagramBasicDesign.repository.AuthenticationTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationTokenService {

    @Autowired
    AuthenticationTokenRepository authenticationTokenRepository;
}
