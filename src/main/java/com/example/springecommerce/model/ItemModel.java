package com.example.springecommerce.model;

import com.example.springecommerce.entity.ItemEntity;
import lombok.Data;

import java.util.List;

@Data
public class ItemModel {
    private int id;
    private String prodName;
    private int prodPrice;
    private String prodDesc;
    private List<ItemEntity> cart;
}
