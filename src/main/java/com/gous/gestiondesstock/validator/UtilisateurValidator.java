package com.gous.gestiondesstock.validator;

import com.gous.gestiondesstock.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {

    public static List<String> validate(UtilisateurDto dto){

        List<String> errors = new ArrayList<>();

        if(dto == null){
            errors.add("Veuillez renseigner le nom de l'utilisateur");
            errors.add("Veuillez renseigner le prenom de l'utilisateur");
            errors.add("Veuillez renseigner la date de naissance de l'utilisateur");
            errors.add("Veuillez renseigner le mot de passe de l'utilisateur");
            errors.add("Veuillez renseigner l'email de l'utilisateur");
            errors.addAll(AdresseValidator.validate(null));
            return errors;
        }
        if(!StringUtils.hasLength(dto.getNom())){
            errors.add("Veuillez renseigner le nom de l'utilisateur");
        }
        if(!StringUtils.hasLength(dto.getPrenom())){
            errors.add("Veuillez renseigner le prenom de l'utilisateur");
        }
        if(dto.getDateDeNaissance() == null){
            errors.add("Veuillez renseigner la date de naissance de l'utilisateur");
        }
        if(!StringUtils.hasLength(dto.getEmail())){
            errors.add("Veuillez renseigner l'email du client");
        }
        if(!StringUtils.hasLength(dto.getMoteDePasse())){
            errors.add("Veuillez renseigner le mot de passe de l'utilisateur");
        }
        errors.addAll(AdresseValidator.validate(dto.getAdresse()));
        return errors;
    }
}
