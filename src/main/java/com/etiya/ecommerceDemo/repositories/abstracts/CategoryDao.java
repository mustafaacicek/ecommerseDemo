package com.etiya.ecommerceDemo.repositories.abstracts;

import com.etiya.ecommerceDemo.business.dtos.responses.ListCategoryResponse;
import com.etiya.ecommerceDemo.entities.concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category, Integer> {
    Category findByName(String name);

    @Query(value = "select new" +
            "com.etiya.ecommerceDemo.businnes.dtos.responses.ListCategoryResponse(c.id, c.name)" +
            "from Category c", nativeQuery = false)
    List<ListCategoryResponse> getAll();

}
