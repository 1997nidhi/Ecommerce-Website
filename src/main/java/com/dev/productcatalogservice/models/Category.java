package com.dev.productcatalogservice.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Category extends BaseModel{
    private String categoryName;
    private String description;
    private Set<Product> products;
}
