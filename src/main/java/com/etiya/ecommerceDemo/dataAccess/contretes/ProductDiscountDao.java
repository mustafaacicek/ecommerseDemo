package com.etiya.ecommerceDemo.dataAccess.contretes;

import com.etiya.ecommerceDemo.entities.concrete.ProductDiscount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDiscountDao extends JpaRepository<ProductDiscount, Long> {
}