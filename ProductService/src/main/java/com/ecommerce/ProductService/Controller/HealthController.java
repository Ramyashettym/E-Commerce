package com.ecommerce.ProductService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String HealthCheck(){

        return "Product Service is healthy!";

    }
}
