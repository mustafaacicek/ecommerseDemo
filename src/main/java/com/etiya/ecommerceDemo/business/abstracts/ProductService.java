package com.etiya.ecommerceDemo.business.abstracts;

import com.etiya.ecommerceDemo.business.dtos.requests.AddProductRequest;
import com.etiya.ecommerceDemo.business.dtos.responses.AddProductResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.ListProductResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.ProductDetailResponse;
import com.etiya.ecommerceDemo.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    AddProductResponse add(AddProductRequest addProductRequest);
    List<ListProductResponse> getAll();
    ProductDetailResponse getById(int id);
}
