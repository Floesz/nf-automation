package com.nf_automation.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.math.BigDecimal;
import java.util.Arrays;

@XmlAccessorType(XmlAccessType.FIELD)
public class ProdutoDTO{
    private String name;
    private String codigo;
    private String ncm;
    private BigDecimal quantidade;
    private BigDecimal valorUnitario;
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
