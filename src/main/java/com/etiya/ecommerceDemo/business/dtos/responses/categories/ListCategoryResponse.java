package com.etiya.ecommerceDemo.business.dtos.responses.categories;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ListCategoryResponse {
    private Long id;
    private String name;
}
