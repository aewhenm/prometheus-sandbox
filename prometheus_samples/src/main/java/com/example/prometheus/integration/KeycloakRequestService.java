package com.example.prometheus.integration;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class KeycloakRequestService {

    private final WebClient logicWebClient;

    public String sync(Long id) {
        return logicWebClient.get()
            .uri("/sync/{id}", uriBuilder -> uriBuilder.build(id))
            .retrieve()
            .bodyToMono(String.class)
            .block();
    }

    private String getDetails() {
        return logicWebClient.get()
            .uri("/authorize")
            .retrieve()
            .bodyToMono(String.class)
            .block();
    }

}
