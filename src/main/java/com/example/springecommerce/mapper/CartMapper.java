package com.example.springecommerce.mapper;

import com.example.springecommerce.entity.CartEntity;
import com.example.springecommerce.model.CartModel;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartModel entityToModel(CartEntity entity);
    public default List<CartModel> entityToModelList(List<CartEntity> entityList){
        System.out.println("###################################################");
        System.out.println("###################################################");
        System.out.println("###################################################");
        System.out.println("###################################################");
        System.out.println("###################################################");
        System.out.println(entityList);
        return entityList.stream().map(item->entityToModel(item)).collect(Collectors.toList());
    }
    CartEntity modelToEntity(CartModel entity);
//    List<CartEntity> modelToEntityList(List<CartEntity> entity);
}
