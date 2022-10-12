package com.gous.gestiondesstock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gous.gestiondesstock.model.Category;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class CategoryDto {


    private Integer id;

    private String code;

    private String description;

    private Integer idEntreprise;

    @JsonIgnore
    private List<ArticleDto> articles;

    //mapping de l'entité vers Dto et de Dto vers entité
    public static CategoryDto fromEntity(Category category){
        if(category ==null){
            return null;
        }
        // mapping de CategoryDto -> Category
         return CategoryDto.builder()
                 .id(category.getId())
                 .code(category.getCode())
                 .description(category.getDescription())
                 .idEntreprise(category.getIdEntreprise())
                 .build();
    }

     public static Category toEntity(CategoryDto categoryDto){
        if(categoryDto == null){
            return null;
        }
         // mapping de Category -> CategoryDto
        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setCode(categoryDto.getCode());
        category.setDescription(categoryDto.getDescription());
        category.setIdEntreprise(categoryDto.getIdEntreprise());

         return category;
     }
}
