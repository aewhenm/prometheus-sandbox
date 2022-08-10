package com.example.prometheus.system.service;

import com.example.prometheus.util.RandomUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public ResponseEntity login(String account, String otp) {

        RandomUtils.imitateFakeProcess();

        return new ResponseEntity(HttpStatus.valueOf(RandomUtils.generateHttpStatus()));
    }

    @Override
    public ResponseEntity logout() {

        RandomUtils.imitateFakeProcess();

        return new ResponseEntity(HttpStatus.valueOf(RandomUtils.generateHttpStatus()));
    }

    @Override
    public ResponseEntity refreshToken() {

        RandomUtils.imitateFakeProcess();

        return new ResponseEntity(HttpStatus.valueOf(RandomUtils.generateHttpStatus()));
    }

}
