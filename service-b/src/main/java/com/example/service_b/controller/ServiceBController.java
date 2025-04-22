package com.example.service_b.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServiceBController {
    @GetMapping("/data")
    public ResponseEntity<String> getData() {
        if (Math.random() < 0.5) {  // 50% chance to fail
            throw new RuntimeException("Service B failure!");
        }
        return ResponseEntity.ok("Data from Service B");
    }
}
