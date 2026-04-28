package com.toll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/toll")
public class TollController {

    @Autowired
    private TollService tollService;

    @PostMapping("/calculate")
    public ResponseEntity<Double> calculateToll(@RequestBody Vehicle vehicle) {
        double amount = tollService.calculate(vehicle);
        return ResponseEntity.ok(amount);
    }
}