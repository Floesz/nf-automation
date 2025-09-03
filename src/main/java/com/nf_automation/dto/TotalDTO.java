package com.nf_automation.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TotalDTO {

    @XmlElement(name = "ICMSTot")
    private IcmsTotDTO icsmTot;

    public IcmsTotDTO getIcsmTot() {
        return icsmTot;
    }

    public void setIcsmTot(IcmsTotDTO icsmTot) {
        this.icsmTot = icsmTot;
    }
}


