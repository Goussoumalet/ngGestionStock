package com.gous.gestiondesstock.dto;

import com.gous.gestiondesstock.model.MouvementStock;
import com.gous.gestiondesstock.model.SourceMvtStock;
import com.gous.gestiondesstock.model.TypeMvtStock;
import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MouvementStockDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantity;

    private ArticleDto article;

    private TypeMvtStock typeMvt;

    private SourceMvtStock sourceMvt;

    private Integer idEntreprise;

    public static MouvementStockDto fromEntity(MouvementStock mvtStk) {
        if (mvtStk == null) {
            return null;
        }

        return MouvementStockDto.builder()
                .id(mvtStk.getId())
                .dateMvt(mvtStk.getDateMvt())
                .quantity(mvtStk.getQuantity())
                .article(ArticleDto.fromEntity(mvtStk.getArticle()))
                .typeMvt(mvtStk.getTypeMvt())
                .sourceMvt(mvtStk.getSourceMvt())
                .idEntreprise(mvtStk.getIdEntreprise())
                .build();
    }

    public static MouvementStock toEntity(MouvementStockDto dto) {
        if (dto == null) {
            return null;
        }

        MouvementStock mvtStock = new MouvementStock();
        mvtStock.setId(dto.getId());
        mvtStock.setDateMvt(dto.getDateMvt());
        mvtStock.setQuantity(dto.getQuantity());
        mvtStock.setArticle(ArticleDto.toEntity(dto.getArticle()));
        mvtStock.setTypeMvt(dto.getTypeMvt());
        mvtStock.setSourceMvt(dto.getSourceMvt());
        mvtStock.setIdEntreprise(dto.getIdEntreprise());

        return mvtStock;
    }
}
