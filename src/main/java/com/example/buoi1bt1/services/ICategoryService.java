package com.example.buoi1bt1.services;

import com.example.buoi1bt1.dtos.CategoryDTO;
import com.example.buoi1bt1.models.Category;
import com.example.buoi1bt1.responses.CategoryResponse;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface ICategoryService {
    Category getCategoryById(Long id);
    List<Category> getAllCategories();
    Category saveCategory(CategoryDTO categoryDTO);
    Category updateCategory(Long id, CategoryDTO categoryDTO);
    void deleteCategory(Long id);

    Page<CategoryResponse> getAllCategories1(PageRequest pageRequest);
}
