package com.example.prometheus.controller;

import com.example.prometheus.service.BusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/business")
@RequiredArgsConstructor
public class BusinessController {

    private final BusinessService businessService;

    @PostMapping
    public ResponseEntity createNew() {
        return businessService.createNew();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity getInfo(@PathVariable Long id) {
        return businessService.getInfo(id);
    }

    @GetMapping(value = "/details")
    public ResponseEntity getDetails() {
        return businessService.getDetails();
    }

}
