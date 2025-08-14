package com.nf_automation.mapper;

import com.nf_automation.dto.DestinatarioDTO;
import com.nf_automation.dto.EnderecoDTO;
import com.nf_automation.model.Destinatario;

public class DestinatarioMapper {

    public static Destinatario toEntity(DestinatarioDTO dto){
        Destinatario destinatario = new Destinatario();
        EnderecoDTO end = new EnderecoDTO();
        destinatario.setNome(dto.getNome());
        destinatario.getEndereco();
        destinatario.setCnpjOuCpf(dto.getCnpjOuCpf());
        destinatario.setInscricaoEstadual(dto.getInscricaoEstadual());
        return destinatario;
    }

}
