package com.nf_automation.mapper;

import com.nf_automation.dto.EmitenteDTO;
import com.nf_automation.model.Emitente;

public class EmitenteMapper {

    public static Emitente toEntity(EmitenteDTO dto) {
        Emitente emitente = new Emitente();
        emitente.getNome();
        emitente.getCnpj();
        emitente.getInscricaoEstadual();
        emitente.getEndereco();
        return emitente;
    }
}