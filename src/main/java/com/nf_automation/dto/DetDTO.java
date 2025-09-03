package com.nf_automation.dto;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class DetDTO {

    @XmlElement(name = "prod", namespace = "http://www.portalfiscal.inf.br/nfe")
    private ProdutoDTO produto;

    public DetDTO(){

    }

    public ProdutoDTO getProduto() {
        return produto;
    }

    public void setProduto(ProdutoDTO produto) {
        this.produto = produto;
    }
}
