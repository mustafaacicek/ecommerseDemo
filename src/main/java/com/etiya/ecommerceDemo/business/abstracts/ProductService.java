package com.etiya.ecommerceDemo.business.abstracts;

import com.etiya.ecommerceDemo.business.dtos.requests.products.AddProductRequest;
import com.etiya.ecommerceDemo.business.dtos.responses.products.AddProductResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.products.ListProductResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.products.ProductDetailResponse;

import java.util.List;

public interface ProductService {
    AddProductResponse add(AddProductRequest addProductRequest);
    List<ListProductResponse> getAll();
    ProductDetailResponse getById(int id);
}
