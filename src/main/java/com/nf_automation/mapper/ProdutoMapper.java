package com.nf_automation.mapper;

import com.nf_automation.dto.NotaFiscalDTO;
import com.nf_automation.dto.ProdutoDTO;
import com.nf_automation.model.Produto;


import java.util.ArrayList;
import java.util.List;


public class ProdutoMapper {

    public static Produto toEntity(ProdutoDTO dto){
        Produto produto =new Produto();

        produto.setName(dto.getName());
        produto.setCodigo(dto.getCodigo());
        produto.setNcm(dto.getNcm());
        produto.setQuantidade(dto.getQuantidade());
        produto.setValorUnitario(dto.getValorUnitario());
        produto.setValorTotal(dto.getValorTotal());
        return produto;
    }
}
