package com.example.springecommerce.service;

import com.example.springecommerce.entity.ItemEntity;
import com.example.springecommerce.mapper.ItemMapper;
import com.example.springecommerce.model.ItemModel;
import com.example.springecommerce.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    ItemMapper itemMapper;

    public Optional<List<ItemEntity>> getItem() {
        List<ItemEntity> entityList = itemRepository.findAll();
        Optional<List<ItemEntity>> otp = Optional.of(entityList);
        return otp;
    }
}
