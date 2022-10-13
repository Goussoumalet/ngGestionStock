package com.gous.gestiondesstock.validator;

import com.gous.gestiondesstock.dto.CommandeClientDto;
import com.gous.gestiondesstock.dto.CommandeFournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CommandeFournisseurValidator {

    public static List<String> validate(CommandeFournisseurDto dto) {

            List<String> errors = new ArrayList<>();
            if (dto == null) {
                errors.add("Veuillez renseigner le code fournisseur");
                errors.add("Veuillez renseigner la date de commande fournisseur");
                errors.add("Veuillez renseigner l'etat de Commande fournisseur");
                errors.add("Veuillez renseigner le fournisseur ");
                return errors;
            }
            if (!StringUtils.hasLength(dto.getCode())) {
                errors.add("Veuillez renseigner le code fournisseur");
            }
            if (dto.getDateCommande() == null) {
                errors.add("Veuillez renseigner la date de commande fournisseur");
            }
            if (!StringUtils.hasLength(dto.getEtatCommande().toString())) {
                errors.add("Veuillez renseigner l'etat de Commande fournisseur");
            }
            if (dto.getFournisseur() == null || dto.getFournisseur().getId() == null) {
                errors.add("Veuillez renseigner le fournisseur ");
            }
            return errors;
    }
}
