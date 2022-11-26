package com.jesusenoc.apimundial.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

public abstract class AbstracCliente {

    @Value("${worldcup.base-url}")
    protected String baseUrl;

    protected final RestTemplate restTemplate;

    protected AbstracCliente(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    protected HttpHeaders buildAuthToken(String token) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.set("Authorization", "Bearer " + token);
        return headers;
    }
}
