package com.example.service_a.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class ServiceAController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String SERVICE_B_URL = "http://localhost:8081/api/data";

    @CircuitBreaker(name = "serviceB", fallbackMethod = "fallbackResponse")
    @GetMapping("/fetch-data")
    public String fetchDataFromServiceB() {
        return restTemplate.getForObject(SERVICE_B_URL, String.class);
    }

    public String fallbackResponse(Throwable ex) {
        System.out.println(" Fallback method triggered due to: " + ex.getMessage());
        return " Fallback: Service B is unavailable. Please try again later.";
    }

}


