package com.example.buoi1bt1.responses;

import com.example.buoi1bt1.models.Category;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryResponse extends BaseResponse {
    private Long id;
    private String name;
    public static CategoryResponse fromCategory(Category category) {
        CategoryResponse categoryResponse = CategoryResponse
                .builder()
                .id(category.getId())
                .name(category.getName())
                .build();
        categoryResponse.setCreatedAt(category.getCreatedAt());
        categoryResponse.setUpdatedAt(category.getUpdateAt());
        return categoryResponse;
    }
}
