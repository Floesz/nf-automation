package com.nf_automation.dto;

import jakarta.xml.bind.annotation.XmlElement;

public class ProdutoDetDTO {

    @XmlElement(name = "prod")
    private ProdutoDTO produto;
}
