package com.nf_automation.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class ProdutoDTO{

    @NotBlank(message = "Nome do produto é obrigatório!")
    @XmlElement(name = "xProd", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String name;

    @NotBlank(message = "O código do produto é obrigatório!")
    @XmlElement(name = "cProd", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String codigo;

    @XmlElement(name = "NCM", namespace = "http://www.portalfiscal.inf.br/nfe")
    @NotBlank(message = "O NCM do produto é obrigatório!")
    private String ncm;

    @NotNull(message = "A quantidade do produto é obrigatório!")
    @DecimalMin(value = "1", message = "A quantidade do produto não pode ser menor que zero")
    @XmlElement(name = "qCom", namespace = "http://www.portalfiscal.inf.br/nfe")
    private BigDecimal quantidade;

    @NotNull(message = "O valor unitário do produto é obrigatório!")
    @DecimalMin(value = "0.01", message = "O valor unitário tem que ser maior que zero.")
    @XmlElement(name = "vUnCom", namespace = "http://www.portalfiscal.inf.br/nfe")
    private BigDecimal valorUnitario;

    @NotNull(message = "O valor total do produto é obrigatório!")
    @DecimalMin(value = "0.01",message = "O valor total do produto tem que ser maior que zero.")
    @XmlElement(name = "vProd", namespace = "http://www.portalfiscal.inf.br/nfe")
    private BigDecimal valorTotal;

    public ProdutoDTO() {

    }

    public ProdutoDTO(String name, String codigo, String ncm, BigDecimal quantidade, BigDecimal valorUnitario, BigDecimal valorTotal) {
        this.name = name;
        this.codigo = codigo;
        this.ncm = ncm;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

}
