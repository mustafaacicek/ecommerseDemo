package com.etiya.ecommerceDemo.api.controllers;

import com.etiya.ecommerceDemo.business.abstracts.CategoryService;
import com.etiya.ecommerceDemo.business.dtos.requests.category.AddCategoryRequest;
import com.etiya.ecommerceDemo.business.dtos.responses.category.AddCategoryResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.category.CategoryDetailResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.category.ListCategoryResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
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

    @GetMapping("/{id}")
    public CategoryDetailResponse getById(@PathVariable Long id) {
        return categoryService.getById(id);
    }

    @PostMapping
    public AddCategoryResponse addCategory(@RequestBody @Valid AddCategoryRequest addCategoryRequest) throws Exception {
        return categoryService.addCategory(addCategoryRequest);
    }
}
