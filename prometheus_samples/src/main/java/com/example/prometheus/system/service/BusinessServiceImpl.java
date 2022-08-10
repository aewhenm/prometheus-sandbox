package com.example.prometheus.system.service;

import com.example.prometheus.system.integration.LogicRequestService;
import com.example.prometheus.util.RandomUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BusinessServiceImpl implements BusinessService {

    private final LogicRequestService logicRequestService;

    @Override
    public ResponseEntity createNew() {
        return new ResponseEntity(HttpStatus.valueOf(RandomUtils.generateHttpStatus()));
    }

    @Override
    public ResponseEntity getInfo(Long id) {

        logicRequestService.getSomeInfoById(id);

        return new ResponseEntity(HttpStatus.valueOf(RandomUtils.generateHttpStatus()));
    }

    @Override
    public ResponseEntity getDetails() {

        logicRequestService.getDetails(123L);

        return new ResponseEntity(HttpStatus.valueOf(RandomUtils.generateHttpStatus()));
    }

}
