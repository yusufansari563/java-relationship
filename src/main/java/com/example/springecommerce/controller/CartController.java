package com.example.springecommerce.controller;

import com.example.springecommerce.entity.CartEntity;
import com.example.springecommerce.model.CartModel;
import com.example.springecommerce.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CartController {

    @Autowired
    CartService cartService;

    @GetMapping("/carts")
    public Optional<List<CartEntity>> getCart() {
        return cartService.getCart();
    }

    @PostMapping("/cart")
    public CartEntity postCart(@RequestBody CartModel cart) {
        return cartService.postCart(cart);
    }
}
