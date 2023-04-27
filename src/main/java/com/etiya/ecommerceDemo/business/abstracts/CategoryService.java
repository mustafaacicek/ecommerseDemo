package com.etiya.ecommerceDemo.business.abstracts;

import com.etiya.ecommerceDemo.business.dtos.requests.AddCategoryRequest;
import com.etiya.ecommerceDemo.business.dtos.responses.AddCategoryResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.ListCategoryResponse;

import java.util.List;

public interface CategoryService {

    List<ListCategoryResponse> getAll();

    AddCategoryResponse add(AddCategoryRequest addCategoryRequest) throws Exception;
}
