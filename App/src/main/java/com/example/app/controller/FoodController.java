package com.example.app.controller;

import com.example.app.model.Food;
import com.example.app.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Tells Spring this class responds to HTTP requests with JSON data
@RequestMapping("/api/foods") // Base URL for all endpoints in this controller
public class FoodController {

    private final FoodService foodService;

    // Constructor Injection: Spring injects the FoodService instance
    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    // 1. POST Endpoint: Add a new food item
    // URL: POST http://localhost:8080/api/foods
    @PostMapping
    public Food addFoodItem(@RequestBody Food food) {
        // @RequestBody converts the incoming JSON from the request into a Food Java
        // object
        return foodService.addFood(food);
    }

    // 2. GET Endpoint: Retrieve all food items
    // URL: GET http://localhost:8080/api/foods
    @GetMapping
    public List<Food> getAllFoodItems() {
        return foodService.getAllFoods();
    }
}