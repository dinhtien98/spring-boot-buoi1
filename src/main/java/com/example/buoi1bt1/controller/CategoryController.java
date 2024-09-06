package com.example.buoi1bt1.controller;

import com.example.buoi1bt1.dtos.CategoryDTO;
import com.example.buoi1bt1.models.Category;
import com.example.buoi1bt1.services.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    @GetMapping("")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }
    @PostMapping("")
    public String addCategory(@Valid @RequestBody CategoryDTO categoryDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<String> errors = bindingResult.getFieldErrors().stream().map(FieldError::getDefaultMessage).toList();
            return errors.toString();
        }
        categoryService.saveCategory(categoryDTO);
        return "success";
    }
    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable long id) {
        categoryService.deleteCategory(id);
        return "success delete with id: " + id;
    }
    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable long id, @RequestBody CategoryDTO categoryDTO) {
        return categoryService.updateCategory(id, categoryDTO);
    }
}
