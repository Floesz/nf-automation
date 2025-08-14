package com.nf_automation.dto;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "dest", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
public class DestinatarioDTO{


    @XmlElement(name = "xNome", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String nome;

    @XmlElements({
            @XmlElement(name = "CNPJ", type = String.class, namespace = "http://www.portalfiscal.inf.br/nfe"),
            @XmlElement(name = "CPF", type = String.class, namespace = "http://www.portalfiscal.inf.br/nfe")
    })
    private String cnpjOuCpf;

    @XmlElement(name = "IE", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String inscricaoEstadual;

    @XmlElement(name = "enderDest", namespace = "http://www.portalfiscal.inf.br/nfe")
    private EnderecoDTO endereco;

    public DestinatarioDTO() {

    }

    public DestinatarioDTO(String nome, String cnpjOuCpf, String inscricaoEstadual, EnderecoDTO endereco) {
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

    public EnderecoDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDTO endereco) {
        this.endereco = endereco;
    }
}
