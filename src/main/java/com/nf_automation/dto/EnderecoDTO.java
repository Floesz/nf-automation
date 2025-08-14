package com.nf_automation.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "enderEmit", namespace = "http://www.portalfiscal.inf.br/nfe") // ou "enderDest" se for destinatário
@XmlAccessorType(XmlAccessType.FIELD)
public class EnderecoDTO {

    @XmlElement(name = "xLgr", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String logradouro;

    @XmlElement(name = "nro", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String numero;

    @XmlElement(name = "xCpl", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String complemento;

    @XmlElement(name = "xBairro", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String bairro;

    @XmlElement(name = "cMun", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String codigoMunicipio;

    @XmlElement(name = "xMun", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cidade;

    @XmlElement(name = "UF", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String uf;

    @XmlElement(name = "CEP", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cep;

    @XmlElement(name = "cPais", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String codigoPais;

    @XmlElement(name = "xPais", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String pais;

    @XmlElement(name = "fone", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String telefone;

    public EnderecoDTO(){

    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
