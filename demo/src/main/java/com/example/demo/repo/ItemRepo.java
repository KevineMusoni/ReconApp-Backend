package com.example.demo.repo;

import com.example.demo.model.Items;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepo  extends JpaRepository<Items, Long> {
    List<Items> findAll();
}
