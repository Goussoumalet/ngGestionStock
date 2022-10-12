package com.gous.gestiondesstock.dto;


import com.gous.gestiondesstock.model.Article;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ArticleDto {

    private Integer id;

    private String codeArticle;

    private String description;

    private BigDecimal prixUnitaireHt;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitaireTtc;

    private String photo;

    private Integer idEntreprise;

    private CategoryDto category;


    public  static ArticleDto fromEntity(Article article){
        if( article == null){
            return null;
        }
        // mapping ArticleDto -> Article
        return ArticleDto.builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .description(article.getDescription())
                .prixUnitaireHt(article.getPrixUnitaireHt())
                .tauxTva(article.getTauxTva())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .photo(article.getPhoto())
                .idEntreprise(article.getIdEntreprise())
                .category(CategoryDto.fromEntity(article.getCategory()))
                .build();
    }

       public static  Article toEntity(ArticleDto articleDto){
         if(articleDto == null) {
             return null;
         }
          //mapping article -> articleDto

           Article article = new Article();
           article.setId(articleDto.getId());
           article.setCodeArticle(articleDto.getCodeArticle());
           article.setDescription(articleDto.getDescription());
           article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
           article.setTauxTva(articleDto.getTauxTva());
           article.setPrixUnitaireTtc(articleDto.getPrixUnitaireTtc());
           article.setPhoto(articleDto.getPhoto());
           article.setIdEntreprise(articleDto.getIdEntreprise());
           article.setCategory(CategoryDto.toEntity(articleDto.getCategory()));

           return article;
       }

}
