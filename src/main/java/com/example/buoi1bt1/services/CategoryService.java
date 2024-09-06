package com.example.buoi1bt1.services;

import com.example.buoi1bt1.dtos.CategoryDTO;
import com.example.buoi1bt1.models.Category;
import com.example.buoi1bt1.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService {
    private final CategoryRepository categoryRepository;
    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category saveCategory(CategoryDTO categoryDTO) {
        Category category = Category
                .builder()
                .name(categoryDTO.getCategoryName())
                .build();
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Long id,CategoryDTO categoryDTO) {
        Category cate = getCategoryById(id);
        cate.setName(categoryDTO.getCategoryName());
        return categoryRepository.save(cate);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
