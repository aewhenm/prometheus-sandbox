package com.example.prometheus;

import java.util.Random;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/business")
public class BusinessController {

    private static final Random RND = new Random();

    private static final int[] HTTP_STATUSES = new int[]{300, 400, 401, 404};

    @GetMapping(value = "/details")
    public ResponseEntity getDetails() {
        return new ResponseEntity(HttpStatus.valueOf(getResponseCode()));
    }

    private int getResponseCode() {
        int rand = RND.nextInt(1000);
        if (rand <= 700) {
            return 200;
        }
        if (rand > 900) {
            return 500;
        }

        return HTTP_STATUSES[rand % HTTP_STATUSES.length];
    }

}
