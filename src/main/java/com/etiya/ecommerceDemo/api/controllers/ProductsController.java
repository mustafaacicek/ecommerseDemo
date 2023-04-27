package com.etiya.ecommerceDemo.api.controllers;

import com.etiya.ecommerceDemo.business.abstracts.ProductService;
import com.etiya.ecommerceDemo.business.dtos.requests.AddProductRequest;
import com.etiya.ecommerceDemo.business.dtos.responses.AddProductResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.ListProductResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.ProductDetailResponse;
import com.etiya.ecommerceDemo.entities.concretes.Product;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
@AllArgsConstructor
public class ProductsController {

    private ProductService productService;

    @GetMapping("")
    public List<ListProductResponse> getAll() {
        return productService.getAll();
    }

    @GetMapping("{id}")
    public ProductDetailResponse getById(@PathVariable int id) {
        return productService.getById(id);
    }

    @PostMapping("")
    public AddProductResponse add(@Valid AddProductRequest addProductRequest) {
        return productService.add(addProductRequest);
    }
}
