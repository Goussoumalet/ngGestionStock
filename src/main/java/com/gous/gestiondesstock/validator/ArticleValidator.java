package com.gous.gestiondesstock.validator;

import com.gous.gestiondesstock.dto.ArticleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {

    public static List<String> validate(ArticleDto articleDto){

        List<String> errors = new ArrayList<>();

        if(articleDto == null){
            errors.add("Veuillez renseigner le code de l'article'");
            errors.add("Veuillez renseigner la description de l'article");
            errors.add("Veuillez renseigner le prix unitaire Ht de l'article");
            errors.add("Veuillez renseigner le prix unitaire ttc de l'article");
            errors.add("Veuillez renseigner le taux Tva");
            errors.add("Veuillez renseigner la categorie de l'article");
            return errors;
        }
         if(!StringUtils.hasLength(articleDto.getCodeArticle())){
             errors.add("Veuillez renseigner le code de l'article'");
         }
        if(!StringUtils.hasLength(articleDto.getDescription())){
            errors.add("Veuillez renseigner la description de l'article");
        }
        if(articleDto.getPrixUnitaireHt() == null){
            errors.add("Veuillez renseigner le prix unitaire Ht de l'article");
        }
        if(articleDto.getPrixUnitaireTtc() == null){
            errors.add("Veuillez renseigner le prix unitaire ttc de l'article");
        }
        if(articleDto.getTauxTva() == null){
            errors.add("Veuillez renseigner le taux Tva");
        }
        if(articleDto.getCategory() == null){
            errors.add("Veuillez renseigner la categorie de l'article");
        }
         return errors;
    }
}
