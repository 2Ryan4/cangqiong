package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishFlavorMapper {


    void insertBatch(List<DishFlavor> flavors);

    @Delete("DELETE FROM dish_flavor WHERE dish_id = #{dishId}}")
    void deleteByDishId(Long dishId);

    void deleteByDishIds(List<Long> DishIds);

    @Select("SELECT * FROM dish_flavor WHERE dish_id = #{dishId}}")
    List<DishFlavor> getByDishId(Long dishId);
}
