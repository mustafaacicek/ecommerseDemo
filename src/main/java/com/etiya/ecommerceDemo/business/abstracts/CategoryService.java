package com.etiya.ecommerceDemo.business.abstracts;

import com.etiya.ecommerceDemo.business.dtos.requests.categories.AddCategoryRequest;
import com.etiya.ecommerceDemo.business.dtos.responses.categories.AddCategoryResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.categories.ListCategoryResponse;

import java.util.List;

public interface CategoryService {

    List<ListCategoryResponse> getAll();

    AddCategoryResponse add(AddCategoryRequest addCategoryRequest) throws Exception;
}
