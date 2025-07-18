package com.nf_automation.model;

import jakarta.persistence.*;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "imposto")
public class Imposto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private BigDecimal percentual;
    private BigDecimal valor;
    private String cst;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    public Imposto(Long id, String tipo, BigDecimal valor, BigDecimal percentual, String cst, Produto produto) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.percentual = percentual;
        this.cst = cst;
        this.produto = produto;
    }

    public Long getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getPercentual() {
        return percentual;
    }

    public void setPercentual(BigDecimal percentual) {
        this.percentual = percentual;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Imposto imposto = (Imposto) o;
        return Objects.equals(id, imposto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
