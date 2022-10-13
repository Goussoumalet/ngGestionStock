package com.gous.gestiondesstock.validator;

import com.gous.gestiondesstock.dto.ClientDto;
import com.gous.gestiondesstock.dto.CommandeClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CommandeClientValidator {

    public static List<String> validate(CommandeClientDto dto){

            List<String> errors = new ArrayList<>();
            if(dto == null){
                errors.add("Veuillez renseigner la reference de commande");
                errors.add("Veuillez renseigner la date de commande");
                errors.add("Veuillez renseigner l'etat de Commande");
                errors.add("Veuillez renseigner le client de commande ");
                return errors;
            }
            if(!StringUtils.hasLength(dto.getReference())){
                errors.add("Veuillez renseigner la reference de commande");
            }
            if(dto.getDateCommande() == null){
                errors.add("Veuillez renseigner la date de commande");
             }
            if(!StringUtils.hasLength(dto.getEtatCommande().toString())){
                errors.add("Veuillez renseigner l'etat de Commande");
            }
            if(dto.getClient() == null || dto.getClient().getId() == null){
                errors.add("Veuillez renseigner le client de commande ");
            }
            return errors;
     }
}
