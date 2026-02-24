package org.example.cardatabase3.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Getter

@NoArgsConstructor
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ownerId;
    @Setter
    @NonNull
    private String firstName, lastName;

    public Owner(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    @Setter
    private List<Car> cars;
}
