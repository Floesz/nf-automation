package com.nf_automation.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "nfeProc")
@XmlAccessorType(XmlAccessType.FIELD)
public class NfeProcDTO {

    @XmlElement(name = "NFe")
    private NotaFiscalDTO nfe;

    public NotaFiscalDTO getNfe() {
        return nfe;
    }

    public void setNfe(NotaFiscalDTO nfe) {
        this.nfe = nfe;
    }
}
