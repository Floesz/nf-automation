package com.nf_automation.mapper;

import com.nf_automation.dto.DestinatarioDTO;
import com.nf_automation.model.Destinatario;

public class DestinatarioMapper {

    public static Destinatario toEntity(DestinatarioDTO dto){
        Destinatario destinatario = new Destinatario();
        destinatario.setNome(dto.getNome());
        destinatario.setEndereco(dto.getEndereco());
        destinatario.setCnpjOuCpf(dto.getCnpjOuCpf());
        destinatario.setInscricaoEstadual(dto.getInscricaoEstadual());
        return destinatario;
    }

}
