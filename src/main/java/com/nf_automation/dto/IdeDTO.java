package com.nf_automation.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

import java.time.LocalDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
public class IdeDTO {

    @XmlElement(name = "cUF")
    private String codigoUF;

    @XmlElement(name = "natOp")
    private String naturezaOperacao;

    @XmlElement(name = "mod")
    private String modelo;

    @XmlElement(name = "serie")
    private String serie;

    @XmlElement(name = "nNF")
    private String numeroUF;

    @XmlElement(name = "dhEmi")
    private String dataHoraEmissao;

    public IdeDTO(){

    }

    public String getNaturezaOperacao() {
        return naturezaOperacao;
    }

    public void setNaturezaOperacao(String naturezaOperacao) {
        this.naturezaOperacao = naturezaOperacao;
    }

    public String getCodigoUF() {
        return codigoUF;
    }

    public void setCodigoUF(String codigoUF) {
        this.codigoUF = codigoUF;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumeroUF() {
        return numeroUF;
    }

    public void setNumeroUF(String numeroUF) {
        this.numeroUF = numeroUF;
    }

    public LocalDateTime getDataHoraEmissao() {
        return dataHoraEmissao;
    }

    public void setDataHoraEmissao(String dataHoraEmissao) {
        this.dataHoraEmissao = dataHoraEmissao;
    }
}
