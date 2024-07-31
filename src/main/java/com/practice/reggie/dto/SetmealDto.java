package com.practice.reggie.dto;


import com.practice.reggie.entity.Setmeal;
import com.practice.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
