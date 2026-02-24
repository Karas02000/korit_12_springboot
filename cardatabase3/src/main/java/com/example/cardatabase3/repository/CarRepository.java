package com.example.cardatabase3.repository;

import org.example.cardatabase3.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "cars")
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByBrand(@Param("brand")String brand);
    List<Car> findByColor(@Param("color")String color);
}
