package com.example.springecommerce.service;

import com.example.springecommerce.entity.CartEntity;
import com.example.springecommerce.mapper.CartMapper;
import com.example.springecommerce.model.CartModel;
import com.example.springecommerce.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CartService {
    @Autowired
    CartRepository cartRepository;

    CartMapper cartMapper;

    public Optional<List<CartEntity>> getCart(){
        List<CartEntity> entityList = cartRepository.findAll();
        Optional<List<CartEntity>> otp = Optional.of(entityList);
        return otp;
    }

    public CartEntity postCart(CartModel cart) {
        CartEntity cartEntity = cartMapper.modelToEntity(cart);
        return cartRepository.save(cartEntity);
    }
}
