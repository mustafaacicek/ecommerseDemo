package com.etiya.ecommerceDemo.business.dtos.responses;

import com.etiya.ecommerceDemo.entities.concretes.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddProductResponse {
    private int id;
    private String name;
    private double unitPrice;
    private Category category;
}
