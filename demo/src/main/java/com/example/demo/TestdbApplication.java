package com.example.demo;

import com.example.demo.domain.Car;
import com.example.demo.domain.CarRepository;
import com.example.demo.domain.Owner;
import com.example.demo.domain.OwnerRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@SpringBootApplication

public class TestdbApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(TestdbApplication.class);
    private final CarRepository carRepository;
    private final OwnerRepository ownerRepository;

	public static void main(String[] args) {
        SpringApplication.run(TestdbApplication.class, args);
        logger.info("애플리케이션 실행됨.");
	}

    public TestdbApplication(CarRepository carRepository, OwnerRepository ownerRepository) {
        this.carRepository = carRepository;
        this.ownerRepository = ownerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner("Homer", "Simpson");
        Owner owner2 = new Owner("Marge", "Simpson");
        ownerRepository.saveAll(Arrays.asList(owner1, owner2));
        carRepository.save(new Car("A","스타렉스","검정","12가3456",2020,20000000));
        carRepository.save(new Car("B","그랜저","하양","34나5678",2023,50000000));
        carRepository.save(new Car("C","람보르기니","노랑","56다7890",2025,250000000));
    }
}
