package com.etiya.ecommerceDemo.business.dtos.requests.products;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddProductRequest {
    @NotNull(message = "Name alanı boş bırakılamaz")
    @NotBlank(message = "Name alanı boş bırakılamaz")
    @Size(min = 2, message = "Name alanı 2 karakterden kısa olamaz")
    private String name;
    @Min(1)
    private double unitPrice;
    private int categoryId;
}
