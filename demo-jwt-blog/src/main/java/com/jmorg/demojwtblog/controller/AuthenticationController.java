package com.jmorg.demojwtblog.controller;


import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jmorg.demojwtblog.model.TokenRequest;
import com.jmorg.demojwtblog.service.TokenService;

@RestController
public class AuthenticationController {

    private final TokenService tokenService;
    private final AuthenticationManager authenticationManager;


    public AuthenticationController(TokenService tokenService, AuthenticationManager authenticationManager) {
        this.tokenService = tokenService;
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/token")
    public String token(@RequestBody TokenRequest userDetails){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userDetails.username(), userDetails.password()));
        return tokenService.generateToken(authentication);
        
    }
    
}
 