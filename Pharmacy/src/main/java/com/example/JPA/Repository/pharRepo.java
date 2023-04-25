package com.example.JPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JPA.Model.pharMod;
@Repository
public interface pharRepo extends JpaRepository<pharMod, Integer> {

}
