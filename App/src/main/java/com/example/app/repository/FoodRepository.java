package com.example.app.repository;

import com.example.app.model.Food;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // Marks this class as a Spring Bean for data access
public class FoodRepository {

    // In-memory list simulating a database table
    private final List<Food> foodList = new ArrayList<>();

    // Save a new food item into the list
    public Food save(Food food) {
        foodList.add(food);
        return food;
    }

    // Return all food items currently in memory
    public List<Food> findAll() {
        return foodList;
    }
}
