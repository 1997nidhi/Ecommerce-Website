package com.dev.productcatalogservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerClass {
    @GetMapping("/welcome")
    public String controllerMethod(){
       return "Welcome guys";
    }
}
