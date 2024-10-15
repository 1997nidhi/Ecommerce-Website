package com.dev.productcatalogservice.controllers;

import com.dev.productcatalogservice.dtos.ProductDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class Product {

    @GetMapping()
    public String getAllProducts() {
        return "All Product List";
    }

    @PostMapping()
    public String addNewProduct(@RequestBody ProductDTO productDTO) {
        return "Product added " + productDTO;
    }

    @GetMapping("/{product_id}")
    public String getSingleProduct(@PathVariable("product_id") long product_id) {
        return "Single Product added at product id: "+product_id;
    }

    @PutMapping("/{product_id}")
    public String updateProduct(@PathVariable("product_id") long product_id) {
        return "Product updated at product id: "+product_id;
    }

    @DeleteMapping("/{product_id}")
    public String deleteProduct(@PathVariable("product_id") long product_id) {
        return "Product updated at product id: "+product_id;
    }
}
