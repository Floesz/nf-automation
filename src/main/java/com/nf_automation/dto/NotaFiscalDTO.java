package com.nf_automation.dto;

import com.nf_automation.xml.LocalDateTimeAdapter;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@XmlRootElement(name = "notaFiscal")
@XmlAccessorType(XmlAccessType.FIELD)
public class NotaFiscalDTO {
    private String numero;
    private String serie;
    private BigDecimal valorTotal;
    private String chaveAcesso;

   @XmlElement(name = "emitente")
    private EmitenteDTO emitenteDTO;

    @XmlElement(name = "destinatario")
    private DestinatarioDTO destinatarioDTO;

    @XmlElementWrapper(name = "produtos")
    @XmlElement(name = "produto")
    private List<ProdutoDTO> produtoDTOList;

    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime dataEmissao;

    public NotaFiscalDTO(){

    }

    public NotaFiscalDTO(String numero, String serie, LocalDateTime dataEmissao, BigDecimal valorTotal, String chaveAcesso, EmitenteDTO emitenteDTO, DestinatarioDTO destinatarioDTO, List<ProdutoDTO> produtoDTOList) {
        this.numero = numero;
        this.serie = serie;
        this.dataEmissao = dataEmissao;
        this.valorTotal = valorTotal;
        this.chaveAcesso = chaveAcesso;
        this.emitenteDTO = emitenteDTO;
        this.destinatarioDTO = destinatarioDTO;
        this.produtoDTOList = produtoDTOList;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public void setEmitenteDTO(EmitenteDTO emitenteDTO) {
        this.emitenteDTO = emitenteDTO;
    }

    public void setDestinatario(DestinatarioDTO destinatarioDTO) {
        this.destinatarioDTO = destinatarioDTO;
    }

    public List<ProdutoDTO> getProdutoDTOList() {
        return produtoDTOList;
    }

    public void setProdutoDTOList(List<ProdutoDTO> produtoDTOList) {
        this.produtoDTOList = produtoDTOList;
    }

    public EmitenteDTO getEmitente() {
        return emitenteDTO;
    }

    public DestinatarioDTO getDestinatario() {
        return destinatarioDTO;
    }
}
