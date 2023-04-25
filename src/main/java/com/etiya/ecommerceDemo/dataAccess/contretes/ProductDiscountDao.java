package com.etiya.ecommerceDemo.dataAccess.contretes;

import com.etiya.ecommerceDemo.entities.concrete.Product;
import com.etiya.ecommerceDemo.entities.concrete.ProductDiscount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDiscountDao extends JpaRepository<ProductDiscount, Long> {
    @Query(value = "select * from public.product_discount")
    List<Product>getProductDiscount();

    @Query(value = "SELECT * FROM public.product_discount pd where pd.discount_amount = (select MAX(pd2.discount_amount) FROM public.product_discount pd2)")
    List<Product>getMaxProductDiscount();


}
