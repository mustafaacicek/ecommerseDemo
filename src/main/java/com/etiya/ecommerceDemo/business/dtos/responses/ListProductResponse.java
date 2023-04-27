package com.etiya.ecommerceDemo.business.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ListProductResponse {
    private int id;
    private String name;
    private String categoryName;
}
