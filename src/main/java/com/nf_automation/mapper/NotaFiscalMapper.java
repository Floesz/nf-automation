package com.nf_automation.mapper;

import com.nf_automation.dto.*;
import com.nf_automation.model.*;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscalMapper {

    public static NotaFiscal toEntity(NfeProcDTO dto) {
        if (dto == null || dto.getNfe() == null || dto.getNfe().getInfNFe() == null) {
            throw new IllegalArgumentException("Nota Fiscal ou chave de acesso é nula!");
        }

        InfNFeDTO inf = dto.getNfe().getInfNFe();

        NotaFiscal nf = new NotaFiscal();
        nf.setNumero(inf.getIde().getNumeroUF());
        nf.setSerie(inf.getIde().getSerie());
        nf.setDataEmissao(inf.getIde().getDataHoraEmissao());
        nf.setChaveAcesso(inf.getChaveAcesso());

        if (inf.getTotal() != null && inf.getTotal().getIcsmTot() != null) {
            nf.setValorTotal(inf.getTotal().getIcsmTot().getValorNotaFiscal());
        }

        // Mapeando emitente e destinatário usando os outros mappers
        nf.setEmitente(EmitenteMapper.toEntity(inf.getEmitente()));
        nf.setDestinatario(DestinatarioMapper.toEntity(inf.getDestinatario()));

        // Mapeando produtos dentro de <det>
        List<Produto> produtos = inf.getDetList() != null
                ? inf.getDetList().stream()
                .map(det -> ProdutoMapper.toEntity(det.getProduto()))
                .toList()
                : new ArrayList<>();

        nf.setProdutoList(produtos);

        return nf;
    }
}
