package com.example.hackathon;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shirt")
public class ShirtController {
    private final ShirtRepository repo;

    public ShirtController(ShirtRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public ResponseEntity getAllShirts() {
        return ResponseEntity.ok(this.repo.findAll());
    }

}
