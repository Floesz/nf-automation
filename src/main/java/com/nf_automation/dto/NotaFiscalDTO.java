package com.nf_automation.dto;

import com.nf_automation.xml.LocalDateTimeAdapter;
import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@XmlRootElement(name = "NFe")
@XmlAccessorType(XmlAccessType.FIELD)
public class NotaFiscalDTO {

    @NotBlank(message = "Numero da nota fiscal é obrigatório!")
    private String numero;

    @NotBlank(message = "Série da nota fiscal é obrigatório!")
    private String serie;

    @NotNull(message = "Valor total é obrigatório!")
    @DecimalMin(value = "0.01", message = "Valor total tem que ser maior que zero.")
    private BigDecimal valorTotal;

    @NotBlank(message = "Chave de acesso da nota fiscal é obrigatório!")
    private String chaveAcesso;

    @Valid
    @NotNull(message = "Emitente é obrigatório!")
    @XmlElement(name = "emitente")
    private EmitenteDTO emitenteDTO;

    @Valid
    @NotNull(message = "Destinatario é obrigatório!")
    @XmlElement(name = "destinatario")
    private DestinatarioDTO destinatarioDTO;

    @Valid
    @NotEmpty(message = "A nota fiscal deve conter pelo menos um produto.")
    @XmlElementWrapper(name = "produtos")
    @XmlElement(name = "produto")
    private List<ProdutoDTO> produtoDTOList;

    @NotNull(message = "Data de emissão é obrigatória!")
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
