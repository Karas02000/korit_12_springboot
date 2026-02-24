package com.example.demo.domain;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NonNull
    private String brand, model, color, registrationNumber;
    @NonNull
    private int modelYear, price;
    @ManyToOne
    @JoinColumn(name="owner")
    @NonNull
    private Owner owner;

    public Car() {
    }

    public Car(@NonNull String brand, @NonNull String model, @NonNull String color, @NonNull String registrationNumber, int modelYear, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.modelYear = modelYear;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    @NonNull
    public String getBrand() {
        return brand;
    }

    @NonNull
    public String getModel() {
        return model;
    }

    @NonNull
    public String getColor() {
        return color;
    }

    @NonNull
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getModelYear() {
        return modelYear;
    }

    public int getPrice() {
        return price;
    }

    @NonNull
    public Owner getOwner() {
        return owner;
    }

    public void setBrand(@NonNull String brand) {
        this.brand = brand;
    }

    public void setModel(@NonNull String model) {
        this.model = model;
    }

    public void setColor(@NonNull String color) {
        this.color = color;
    }

    public void setRegistrationNumber(@NonNull String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
