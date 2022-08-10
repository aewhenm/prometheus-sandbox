package com.example.prometheus.out_system;

import com.example.prometheus.util.RandomUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/out/api/logic")
public class LogicController {

    @GetMapping(value = "/{id}")
    public ResponseEntity getInfo(@PathVariable Long id) {

        RandomUtils.imitateFakeProcess();

        return new ResponseEntity(HttpStatus.valueOf(RandomUtils.generateHttpStatus()));
    }

    @GetMapping(value = "/details")
    public ResponseEntity getDetails() {

        RandomUtils.imitateFakeProcess();

        return new ResponseEntity(HttpStatus.valueOf(RandomUtils.generateHttpStatus()));
    }

}
