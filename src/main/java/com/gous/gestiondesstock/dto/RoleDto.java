package com.gous.gestiondesstock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gous.gestiondesstock.model.Role;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class RoleDto {

    private Integer id;

    private String roleName;

    @JsonIgnore
    private UtilisateurDto utilisateur;

    public static RoleDto fromEntity(Role roles) {
        if (roles == null) {
            return null;
        }
        return RoleDto.builder()
                .id(roles.getId())
                .roleName(roles.getRoleName())
                .build();
    }

    public static Role toEntity(RoleDto dto) {
        if (dto == null) {
            return null;
        }
        Role roles = new Role();
        roles.setId(dto.getId());
        roles.setRoleName(dto.getRoleName());
        roles.setUtilisateur(UtilisateurDto.toEntity(dto.getUtilisateur()));
        return roles;
    }
}
