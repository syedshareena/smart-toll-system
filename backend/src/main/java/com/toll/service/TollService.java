package com.toll.service;

import org.springframework.stereotype.Service;

@Service
public class TollService {

    public double calculate(Vehicle vehicle) {
        if ("CAR".equals(vehicle.getType())) return 50;
        if ("TRUCK".equals(vehicle.getType())) return 100;
        return 30;
    }
}