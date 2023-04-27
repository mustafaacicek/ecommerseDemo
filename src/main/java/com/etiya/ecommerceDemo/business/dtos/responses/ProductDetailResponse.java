package com.etiya.ecommerceDemo.business.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDetailResponse {
    private int id;
    private String name;
    private int categoryId;
    private String category;
}
