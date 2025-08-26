package com.nf_automation.mapper;

import com.nf_automation.dto.EmitenteDTO;
import com.nf_automation.model.Emitente;

public class EmitenteMapper {

    public static Emitente toEntity(EmitenteDTO dto) {
        Emitente emitente = new Emitente();
        emitente.setNome(dto.getNome());
        emitente.setCnpj(dto.getCnpj());
        emitente.setInscricaoEstadual(dto.getInscricaoEstadual());
        emitente.getEndereco();
        return emitente;
    }
}