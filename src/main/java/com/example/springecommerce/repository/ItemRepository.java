package com.example.springecommerce.repository;

import com.example.springecommerce.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemEntity,Integer> {
}
