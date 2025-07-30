package com.nf_automation.xmlModel;


import java.util.List;

public class InfNFeXML {

    private EmitenteXML emitXML;
    private DestinatarioXML destXML;
    private List<ProdutoXML> produtos;

    public EmitenteXML getEmitXML() {
        return emitXML;
    }

    public void setEmitXML(EmitenteXML emitXML) {
        this.emitXML = emitXML;
    }

    public DestinatarioXML getDestXML() {
        return destXML;
    }

    public void setDestXML(DestinatarioXML destXML) {
        this.destXML = destXML;
    }

    public List<ProdutoXML> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoXML> produtos) {
        this.produtos = produtos;
    }
}
