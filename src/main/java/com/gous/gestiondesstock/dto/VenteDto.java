package com.gous.gestiondesstock.dto;

import com.gous.gestiondesstock.model.Vente;
import lombok.Builder;
import lombok.Data;


import java.time.Instant;
import java.util.List;

@Data
@Builder
public class VenteDto {

    private Integer id;

    private String code;

    private Instant dateVente;

    private String commentaire;

    private Integer idEntreprise;

    private List<LigneVenteDto> ligneVentes;

    public static VenteDto fromEntity(Vente vente) {
        if (vente == null) {
            return null;
        }
        return VenteDto.builder()
                .id(vente.getId())
                .code(vente.getCode())
                .commentaire(vente.getCommentaire())
                .idEntreprise(vente.getIdEntreprise())
                .build();
    }

    public static Vente toEntity(VenteDto dto) {
        if (dto == null) {
            return null;
        }
        Vente ventes = new Vente();
        ventes.setId(dto.getId());
        ventes.setCode(ventes.getCode());
        ventes.setCommentaire(dto.getCommentaire());
        ventes.setIdEntreprise(dto.getIdEntreprise());

        return ventes;
    }
}
