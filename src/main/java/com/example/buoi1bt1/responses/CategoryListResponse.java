package com.example.buoi1bt1.responses;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CategoryListResponse {
    private List<CategoryResponse> categories;
    private int totalPages;
}
