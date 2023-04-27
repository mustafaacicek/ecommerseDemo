package com.etiya.ecommerceDemo.repositories.abstracts;

import com.etiya.ecommerceDemo.business.dtos.responses.products.ListProductResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.products.ProductDetailResponse;
import com.etiya.ecommerceDemo.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Long> {

    @Query("select new com.etiya.ecommerceDemo.business.dtos.responses.products.ListProductResponse(p.id, p.name, c.name) from Product p join p.category c order by p.name")
    List<ListProductResponse> getAll();

    @Query(value="Select new com.etiya.ecommerceDemo.business.dtos.responses.products" +
            ".ProductDetailResponse(p.id, p.name,c.id, c.name)" +
            "from Product p Join p.category c Where p.id=:id ")
    ProductDetailResponse getById(int id);
}

