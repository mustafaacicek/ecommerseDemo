package com.etiya.ecommerceDemo.repositories.abstracts;

import com.etiya.ecommerceDemo.business.dtos.responses.categories.ListCategoryResponse;
import com.etiya.ecommerceDemo.entities.concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category, Long> {
    Category findByName(String name);

    @Query(value = "select new com.etiya.ecommerceDemo.business.dtos.responses.categories.ListCategoryResponse(c.id, c.name) from Category c")
    List<ListCategoryResponse> getAll();

}
