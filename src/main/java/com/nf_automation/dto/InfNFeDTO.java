package com.nf_automation.dto;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class InfNFeDTO {

    @XmlAttribute(name = "Id")
    private String chaveAcesso;

    @XmlAttribute(name = "versao")
    private String versao;

    @XmlElement(name = "ide", namespace = "http://www.portalfiscal.inf.br/nfe")
    private IdeDTO ide;

    @XmlElement(name = "emit", namespace = "http://www.portalfiscal.inf.br/nfe")
    private EmitenteDTO emitente;

    @XmlElement(name = "dest", namespace = "http://www.portalfiscal.inf.br/nfe")
    private DestinatarioDTO destinatario;

    @XmlElement(name = "det", namespace = "http://www.portalfiscal.inf.br/nfe")
    private List<DetDTO> detList;

    @XmlElement(name = "total", namespace = "http://www.portalfiscal.inf.br/nfe")
    private TotalDTO total;

    public InfNFeDTO(){

    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public IdeDTO getIde() {
        return ide;
    }

    public void setIde(IdeDTO ide) {
        this.ide = ide;
    }

    public EmitenteDTO getEmitente() {
        return emitente;
    }

    public void setEmitente(EmitenteDTO emitente) {
        this.emitente = emitente;
    }

    public DestinatarioDTO getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(DestinatarioDTO destinatario) {
        this.destinatario = destinatario;
    }

    public List<DetDTO> getDetList() {
        return detList;
    }

    public void setDetList(List<DetDTO> detList) {
        this.detList = detList;
    }

    public TotalDTO getTotal() {
        return total;
    }

    public void setTotal(TotalDTO total) {
        this.total = total;
    }
}
