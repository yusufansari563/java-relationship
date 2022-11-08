package com.example.springecommerce.controller;

import com.example.springecommerce.model.ItemModel;
import com.example.springecommerce.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping("/items")
    public List<ItemModel> getItem(){
        return itemService.getItem();
    }
}
