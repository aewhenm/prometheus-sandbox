package com.example.prometheus.system.controller;

import com.example.prometheus.util.RandomUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/auth")
public class AuthController {

    @PostMapping(value = "/login")
    public ResponseEntity login(@RequestParam(value = "account") String account,
                                @RequestParam(value = "otp") String otp) {

        RandomUtils.imitateFakeProcess();

        return new ResponseEntity(HttpStatus.valueOf(RandomUtils.generateHttpStatus()));
    }

    @PostMapping(value = "/logout")
    public ResponseEntity logout() {

        RandomUtils.imitateFakeProcess(100, 200);

        return new ResponseEntity(HttpStatus.valueOf(RandomUtils.generateHttpStatus()));
    }

    @PostMapping(value = "/token")
    public ResponseEntity refreshToken() {

        RandomUtils.imitateFakeProcess();

        return new ResponseEntity(HttpStatus.valueOf(RandomUtils.generateHttpStatus()));
    }

}
