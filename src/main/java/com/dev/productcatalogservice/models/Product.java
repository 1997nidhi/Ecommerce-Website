package com.dev.productcatalogservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel{
    private String product_name;
    private int product_price;
    private String product_description;
    private String product_imageUrl;
    private Category category;
}
