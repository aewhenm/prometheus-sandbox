package com.example.prometheus.system.config;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

public class WebClientBeanFactory {

    @Value(value = "integration.keycloak.url")
    private String keycloakUrl;

    @Value(value = "integration.logic.url")
    private String logicUrl;

    @Bean
    public WebClient keycloakWebClient(@Autowired HttpClient customHttpClient) {
        return WebClient.builder()
            .baseUrl(keycloakUrl)
            .clientConnector(new ReactorClientHttpConnector(customHttpClient))
            .build();
    }

    @Bean
    public WebClient logicWebClient(@Autowired HttpClient customHttpClient) {
        return WebClient.builder()
            .baseUrl(logicUrl)
            .clientConnector(new ReactorClientHttpConnector(customHttpClient))
            .build();
    }

    @Bean
    public HttpClient customHttpClient() {
        return HttpClient.create()
            .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 5000)
            .responseTimeout(Duration.ofMillis(5000))
            .doOnConnected(conn ->
                               conn.addHandlerLast(new ReadTimeoutHandler(5000, TimeUnit.MILLISECONDS))
                                   .addHandlerLast(new WriteTimeoutHandler(5000, TimeUnit.MILLISECONDS)));
    }

}
