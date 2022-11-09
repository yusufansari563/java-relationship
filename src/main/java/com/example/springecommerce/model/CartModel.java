package com.example.springecommerce.model;

import com.example.springecommerce.entity.ItemEntity;
import lombok.Data;

import java.util.List;

@Data
public class CartModel {
    private int id;
    private String owner;
    private int productCount;
    private List<ItemEntity> item;
}
