package com.nf_automation.mapper;

import com.nf_automation.dto.NotaFiscalDTO;
import com.nf_automation.dto.ProdutoDTO;
import com.nf_automation.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProdutoMapper {

    public static Produto toEntity(ProdutoDTO dto){
        Produto produto =new Produto();

        produto.setName(dto.getName());
        produto.setCodigo(dto.getCodigo());
        produto.setNcm(dto.getNcm());
        produto.setQuantidade(dto.getQuantidade());
        produto.setValorUnitario(dto.getValorUnitario());
        produto.setValorTotal(dto.getValorTotal());

        NotaFiscalDTO nfdto = new NotaFiscalDTO();
        List<Produto> produtos = nfdto.getProdutoDTOList() != null ?
                nfdto.getProdutoDTOList().stream().map(ProdutoMapper::toEntity).toList() :
                new ArrayList<>();

        return produto;
    }
}
