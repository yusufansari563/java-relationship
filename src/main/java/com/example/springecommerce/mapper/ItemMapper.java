package com.example.springecommerce.mapper;

import com.example.springecommerce.entity.ItemEntity;
import com.example.springecommerce.model.ItemModel;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    ItemModel entityToModel(ItemEntity entity);
    public default List<ItemModel> entityToModelList(List<ItemEntity> entityList){
        return entityList.stream().map(this::entityToModel).collect(Collectors.toList());
    }
//    ItemEntity modelToEntity(ItemEntity entity);
//    List<ItemEntity> modelToEntityList(List<ItemEntity> entity);
}
