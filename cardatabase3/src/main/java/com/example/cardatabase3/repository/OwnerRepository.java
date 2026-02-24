package com.example.cardatabase3.repository;


import org.example.cardatabase3.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
