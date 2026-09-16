package com.example.app.service;

import com.example.app.model.Food;
import com.example.app.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Marks this class as a Spring Bean containing business logic
public class FoodService {

    private final FoodRepository foodRepository;

    // Constructor Injection: Spring automatically provides FoodRepository here
    @Autowired
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    // Business method to add a food item
    public Food addFood(Food food) {
        // Here you can add business validation (e.g. price must be > 0)
        return foodRepository.save(food);
    }

    // Business method to get all food items
    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }
}