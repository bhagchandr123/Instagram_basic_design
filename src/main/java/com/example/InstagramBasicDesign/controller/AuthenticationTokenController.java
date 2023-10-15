package com.example.InstagramBasicDesign.controller;

import com.example.InstagramBasicDesign.service.AuthenticationTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authentication")
public class AuthenticationTokenController {

    @Autowired
    AuthenticationTokenService authenticationTokenService;

}
