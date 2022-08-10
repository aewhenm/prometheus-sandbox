package com.example.prometheus.system.integration;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class LogicRequestService {

    private final WebClient logicWebClient;

    public String getSomeInfoById(Long id) {
        return logicWebClient.get()
            .uri("/{id}", uriBuilder -> uriBuilder.build(id))
            .retrieve()
            .bodyToMono(String.class)
            .block();
    }

    public String getDetails(Long id) {
        return logicWebClient.get()
            .uri("/details")
            .retrieve()
            .bodyToMono(String.class)
            .block();
    }

}
