package com.github.action;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/health_check")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("OK");
    }
}
