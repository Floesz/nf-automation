package com.nf_automation.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class IcmsTotDTO {

    @XmlElement(name = "vNF")
    private BigDecimal valorNotaFiscal;

    public IcmsTotDTO(){

    }


    public BigDecimal getValorNotaFiscal() {
        return valorNotaFiscal;
    }

    public void setValorNotaFiscal(BigDecimal valorNotaFiscal) {
        this.valorNotaFiscal = valorNotaFiscal;
    }
}
