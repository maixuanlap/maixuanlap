package com.example.maixuanlap.repository;

import com.example.maixuanlap.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity,Integer> {
}
