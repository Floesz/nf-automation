package com.nf_automation.model;

import java.util.Objects;

public class Emitente {

    private Long id;
    private String nome;
    private String cnpj;
    private String inscricaoEstadual;
    private String endereco;

    public Emitente(Long id, String nome, String cnpj, String inscricaoEstadual, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Emitente emitente = (Emitente) o;
        return Objects.equals(id, emitente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
