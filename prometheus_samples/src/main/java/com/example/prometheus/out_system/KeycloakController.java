package com.example.prometheus.out_system;

import com.example.prometheus.util.RandomUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/out/api/keycloak")
public class KeycloakController {

    @PostMapping(value = "/sync/{id}")
    public ResponseEntity syncInfo(@PathVariable Long userId) {

        RandomUtils.imitateFakeProcess();

        return new ResponseEntity(HttpStatus.valueOf(RandomUtils.generateHttpStatus()));
    }

    @PostMapping(value = "/authorize")
    public ResponseEntity getDetails(@RequestBody AuthCreds creds) {

        RandomUtils.imitateFakeProcess();

        return new ResponseEntity(HttpStatus.valueOf(RandomUtils.generateHttpStatus()));
    }

}
