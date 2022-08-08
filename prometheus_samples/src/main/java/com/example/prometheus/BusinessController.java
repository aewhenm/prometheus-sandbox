package com.example.prometheus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/business")
public class BusinessController {

    @GetMapping(value = "/details")
    public ResponseEntity getDetails() {
        return ResponseEntity.ok().build();
    }

}
