package com.etiya.ecommerceDemo.api.controllers;

import com.etiya.ecommerceDemo.business.abstracts.CategoryService;
import com.etiya.ecommerceDemo.business.dtos.requests.AddCategoryRequest;
import com.etiya.ecommerceDemo.business.dtos.responses.AddCategoryResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.ListCategoryResponse;
import com.etiya.ecommerceDemo.entities.concretes.Category;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categories")
@AllArgsConstructor
public class CategoriesController {

    private CategoryService categoryService;

    @GetMapping
    public List<ListCategoryResponse> getAll() {
        return categoryService.getAll();
    }
    // No need to fetch CategoryById, I guess?
    @PostMapping("")
    public AddCategoryResponse add(AddCategoryRequest addCategoryRequest) throws Exception{
        return categoryService.add(addCategoryRequest);
    }
}
