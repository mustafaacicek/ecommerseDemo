package com.etiya.ecommerceDemo.business.concretes;

import com.etiya.ecommerceDemo.business.abstracts.ProductService;
import com.etiya.ecommerceDemo.business.dtos.requests.AddProductRequest;
import com.etiya.ecommerceDemo.business.dtos.responses.AddProductResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.ListProductResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.ProductDetailResponse;
import com.etiya.ecommerceDemo.core.mapping.ModelMapperService;
import com.etiya.ecommerceDemo.entities.concretes.Product;
import com.etiya.ecommerceDemo.repositories.abstracts.ProductDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductManager implements ProductService {
    private ProductDao productDao;
    private ModelMapperService modelMapperService;

    @Override
    public AddProductResponse add(AddProductRequest addProductRequest) {
        Product product = modelMapperService.getMapper().map(addProductRequest, Product.class);
        productDao.save(product);

        AddProductResponse response = modelMapperService.getMapper().map(product, AddProductResponse.class);
        return response;
    }

    @Override
    public List<ListProductResponse> getAll() {
        return productDao.getAll();
    }

    @Override
    public ProductDetailResponse getById(int id) {
        return productDao.getById(id);
    }
}
