package com.nf_automation.model;

import jakarta.persistence.*;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "nota_fiscal")
public class NotaFiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private String serie;
    private LocalDateTime dataEmissao;
    private BigDecimal valorTotal;
    private String chaveAcesso;

    @ManyToOne
    @JoinColumn(name = "emitente_id")
    private Emitente emitente;

    @ManyToOne
    @JoinColumn(name = "destinatario_id")
    private Destinatario destinatario;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "nota_fiscal_id")
    private List<Produto> produtoList = new ArrayList<>();

    public NotaFiscal(Long id, String numero, String serie, LocalDateTime dataEmissao, BigDecimal valorTotal, String chaveAcesso, Emitente emitente, Destinatario destinatario, List<Produto> produtoList) {
        this.id = id;
        this.numero = numero;
        this.serie = serie;
        this.dataEmissao = dataEmissao;
        this.valorTotal = valorTotal;
        this.chaveAcesso = chaveAcesso;
        this.emitente = emitente;
        this.destinatario = destinatario;
        this.produtoList = produtoList;
    }

    public Long getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
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

    public Emitente getEmitente() {
        return emitente;
    }

    public void setEmitente(Emitente emitente) {
        this.emitente = emitente;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NotaFiscal that = (NotaFiscal) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
