package com.gous.gestiondesstock.validator;

import com.gous.gestiondesstock.dto.ClientDto;
import com.gous.gestiondesstock.dto.EntrepriseDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EntrepriseValidator {

    public static List<String> validate(EntrepriseDto dto){

        List<String> errors = new ArrayList<>();

        if(dto == null){
            errors.add("Veuillez renseigner le nom de l'entreprise");
            errors.add("Veuillez renseigner la description de l'entreprise");
            errors.add("Veuillez renseigner l'email de l'entreprise");
            errors.add("Veuillez renseigner le numero telephone de l'entreprise ");
            errors.addAll(AdresseValidator.validate(null));
            return errors;
        }
        if(!StringUtils.hasLength(dto.getNom())){
            errors.add("Veuillez renseigner le nom de l'entreprise");
        }
        if(!StringUtils.hasLength(dto.getDescription())){
            errors.add("Veuillez renseigner la description de l'entreprise");
        }
        if(!StringUtils.hasLength(dto.getEmail())){
            errors.add("Veuillez renseigner l'email de l'entreprise");
        }
        if(!StringUtils.hasLength(dto.getNumTel())){
            errors.add("Veuillez renseigner le numero telephone de l'entreprise ");
        }
        errors.addAll(AdresseValidator.validate(dto.getAdresse()));
        return errors;
    }

}
