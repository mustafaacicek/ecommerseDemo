package com.etiya.ecommerceDemo.repositories.abstracts;

import com.etiya.ecommerceDemo.business.dtos.responses.ListProductResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.ProductDetailResponse;
import com.etiya.ecommerceDemo.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDao extends JpaRepository<Product,Long> {

    // No Need
//    @Query(value = "SELECT p.* FROM products p INNER JOIN order_details od ON od.product_id = p.id", nativeQuery = true)
//    List<Product> getProductByOrdered();
    @Query(value = "select new" +
            "com.etiya.ecommerceDemo.business.dtos.responses.ListProductResponse(p.id, p.name, c.name)" +
            "from Product p join p.category order by p.name")
    List<ListProductResponse> getAll();
    @Query(value = "select new" +
            "com.etiya.ecommmerceDemo.business.dtos.responses.ProductDetailResponse(p.id, p.name, c.id, c.name)" +
            "from Product p join p.category c where p.id:id")
    ProductDetailResponse getById(int id);
}
