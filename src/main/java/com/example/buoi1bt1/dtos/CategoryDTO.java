package com.example.buoi1bt1.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {
    @JsonProperty("name")
    @NotEmpty(message="Ten khong duoc de rong")
    private String categoryName;
}
