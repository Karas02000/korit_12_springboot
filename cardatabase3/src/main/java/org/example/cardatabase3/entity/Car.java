package org.example.cardatabase3.entity;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;
import lombok.*;

@Entity
@Getter
@Data
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    @Setter
    private String brand, model, color, registrationNumber;
    @NonNull
    @Setter
    private int modelYear, price;

    @ManyToOne
    @JoinColumn(name="owner")
    @NonNull
    @Setter
    private Owner owner;

    public Car(String brand, String model, String color, String registrationNumber, int modelYear, int price, Owner owner) {
        this.price = price;
        this.modelYear = modelYear;
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.owner = owner;
    }
}
