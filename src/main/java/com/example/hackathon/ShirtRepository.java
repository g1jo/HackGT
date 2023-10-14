package com.example.hackathon;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShirtRepository extends JpaRepository<Clothing.Shirt, Long> {


}
