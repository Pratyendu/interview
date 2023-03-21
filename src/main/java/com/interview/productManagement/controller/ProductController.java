package com.interview.productManagement.controller;

import com.interview.productManagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/product")
public class ProductController {
    @Autowired
    ProductService productService;
//This is a get call 
    @GetMapping(value = "create-product")
    public ResponseEntity<String> createProduct(@RequestBody String requestData){

    }
}
