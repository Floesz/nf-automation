package com.nf_automation.mapper;

import com.nf_automation.dto.*;
import com.nf_automation.model.*;


import java.util.List;
import java.util.stream.Collectors;

public class NotaFiscalMapper {

    public static NotaFiscal toEntity(NotaFiscalDTO dto) {
        NotaFiscal nf = new NotaFiscal();
        nf.setNumero(dto.getNumero());
        nf.setSerie(dto.getSerie());
        nf.setDataEmissao(dto.getDataEmissao());
        nf.setValorTotal(dto.getValorTotal());
        nf.setChaveAcesso(dto.getChaveAcesso());

        // Mapeando emitente e destinatário usando os outros mappers
        nf.setEmitente(EmitenteMapper.toEntity(dto.getEmitente()));
        nf.setDestinatario(DestinatarioMapper.toEntity(dto.getDestinatario()));

        // Convertendo lista de produtos
        List<Produto> produtos = dto.getProdutoDTOList()
                .stream()
                .map(ProdutoMapper::toEntity)
                .collect(Collectors.toList());
        nf.setProdutoList(produtos);


        return nf;
    }
}
