package com.nf_automation.xml;

import com.nf_automation.dto.NotaFiscalDTO;
import com.nf_automation.dto.EmitenteDTO;
import com.nf_automation.dto.DestinatarioDTO;
import com.nf_automation.dto.ProdutoDTO;

import jakarta.xml.bind.JAXBException;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.stereotype.Component;


import java.io.InputStream;

@Component
public class NotaFiscalXmlParser {

    private JAXBContext jaxbContext;

    public NotaFiscalXmlParser() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(NotaFiscalDTO.class, EmitenteDTO.class, DestinatarioDTO.class, ProdutoDTO.class);
    }

    public NotaFiscalDTO parse(InputStream is) throws JAXBException {
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (NotaFiscalDTO) unmarshaller.unmarshal(is);
    }
}
