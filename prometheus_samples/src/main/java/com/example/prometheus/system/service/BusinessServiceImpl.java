package com.example.prometheus.system.service;

import com.example.prometheus.util.RandomUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Override
    public ResponseEntity createNew() {
        return new ResponseEntity(HttpStatus.valueOf(RandomUtils.generateHttpStatus()));
    }

    @Override
    public ResponseEntity getInfo(Long id) {
        return new ResponseEntity(HttpStatus.valueOf(RandomUtils.generateHttpStatus()));
    }

    @Override
    public ResponseEntity getDetails() {
        return new ResponseEntity(HttpStatus.valueOf(RandomUtils.generateHttpStatus()));
    }

}