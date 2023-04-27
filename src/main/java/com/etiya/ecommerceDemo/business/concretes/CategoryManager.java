package com.etiya.ecommerceDemo.business.concretes;

import com.etiya.ecommerceDemo.business.abstracts.CategoryService;
import com.etiya.ecommerceDemo.business.dtos.requests.categories.AddCategoryRequest;
import com.etiya.ecommerceDemo.business.dtos.responses.categories.AddCategoryResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.categories.ListCategoryResponse;
import com.etiya.ecommerceDemo.core.exceptions.BusinessException;
import com.etiya.ecommerceDemo.core.utils.mapping.ModelMapperService;
import com.etiya.ecommerceDemo.entities.concretes.Category;
import com.etiya.ecommerceDemo.repositories.abstracts.CategoryDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {

    private CategoryDao categoryDao;
    private ModelMapperService modelMapperService;

    @Override
    public List<ListCategoryResponse> getAll(){
        return categoryDao.getAll();
    }

    @Override
    public AddCategoryResponse add(AddCategoryRequest addCategoryRequest) throws Exception{
        Category categoryToFind = categoryDao.findByName(addCategoryRequest.getName());
        if(categoryToFind != null){
            throw new BusinessException("Kategori zaten mevcut");
        }
        Category category = modelMapperService.getMapper().map(addCategoryRequest, Category.class);
        categoryDao.save(category);

        AddCategoryResponse response = modelMapperService.getMapper().map(category, AddCategoryResponse.class);
        return response;
    }
}
