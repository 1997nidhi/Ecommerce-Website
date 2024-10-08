package com.dev.productcatalogservice;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
@Service
public class serviceClass {

    public String serviceMethod(){
        return "Hello guys";
    }
}
