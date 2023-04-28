package com.etiya.ecommerceDemo.business.dtos.responses.products;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ListProductResponse {
    // id must be Long
    private Long id;
    private String name;
    private String categoryName;
}
