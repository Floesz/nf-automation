package com.nf_automation.dto;

import com.nf_automation.model.Emitente;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class EmitenteDTO{
    private String nome;
    private String cnpj;
    private String inscricaoEstadual;
    private String endereco;

    public EmitenteDTO(){

    }

    public EmitenteDTO(String nome, String cnpj, String inscricaoEstadual, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.endereco = endereco;
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
}
