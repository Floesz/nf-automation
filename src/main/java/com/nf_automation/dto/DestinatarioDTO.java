package com.nf_automation.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class DestinatarioDTO{
    private String nome;
    private String cnpjOuCpf;
    private String inscricaoEstadual;
    private String endereco;

    public DestinatarioDTO() {

    }

    public DestinatarioDTO(String nome, String cnpjOuCpf, String inscricaoEstadual, String endereco) {
        this.nome = nome;
        this.cnpjOuCpf = cnpjOuCpf;
        this.inscricaoEstadual = inscricaoEstadual;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpjOuCpf() {
        return cnpjOuCpf;
    }

    public void setCnpjOuCpf(String cnpjOuCpf) {
        this.cnpjOuCpf = cnpjOuCpf;
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
}
