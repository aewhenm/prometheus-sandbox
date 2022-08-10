package com.example.prometheus.service;

import org.springframework.http.ResponseEntity;

public interface BusinessService {

    ResponseEntity createNew();

    ResponseEntity getInfo(Long id);

    ResponseEntity getDetails();

}
