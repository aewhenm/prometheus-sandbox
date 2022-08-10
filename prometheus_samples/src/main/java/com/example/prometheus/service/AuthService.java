package com.example.prometheus.service;

import org.springframework.http.ResponseEntity;

public interface AuthService {
    
    ResponseEntity login(String account, String otp);

    ResponseEntity logout();

    ResponseEntity refreshToken();

}
