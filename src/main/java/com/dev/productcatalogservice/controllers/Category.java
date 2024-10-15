package com.dev.productcatalogservice.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products/categories")

public class Category {
    @GetMapping()
    public String getAllCategories() {
        return "All categories";
    }

    @GetMapping("/{category_name}")
    public String getProductFromCategories(@PathVariable("category_name") String category_name) {
        return "Getting product from specific categories " + category_name;
    }
}
