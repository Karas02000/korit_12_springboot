package com.example.demo.controller;

import com.example.demo.domain.Car;
import com.example.demo.domain.CarRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    private final CarRepository carRepository;
    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    @GetMapping("/cars")
    public List<Car> findAll() {
        return carRepository.findAll();
    }
}
