package com.etiya.ecommerceDemo.business.dtos.responses.products;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDetailResponse {
    private Long id;
    private String name;
    private int categoryId;
    private String category;
}
