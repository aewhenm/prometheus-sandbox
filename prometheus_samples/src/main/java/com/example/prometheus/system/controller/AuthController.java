package com.example.prometheus.system.controller;

import com.example.prometheus.system.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping(value = "/login")
    public ResponseEntity login(@RequestParam(value = "account") String account,
                                @RequestParam(value = "otp") String otp) {
        return authService.login(account, otp);
    }

    @PostMapping(value = "/logout")
    public ResponseEntity logout() {
        return authService.logout();
    }

    @PostMapping(value = "/token")
    public ResponseEntity refreshToken() {
        return authService.refreshToken();
    }

}
