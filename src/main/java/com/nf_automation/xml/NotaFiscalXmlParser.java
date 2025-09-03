package com.nf_automation.xml;

import com.nf_automation.dto.*;

import com.nf_automation.exception.NotaFiscalException;
import jakarta.xml.bind.JAXBException;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.stereotype.Component;


import java.io.InputStream;

@Component
public class NotaFiscalXmlParser {

    private JAXBContext jaxbContext;

    public NotaFiscalXmlParser() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(NotaFiscalDTO.class);
    }

    private void validarCampos(NotaFiscalDTO dto){
        if(dto.getChaveAcesso() == null || dto.getChaveAcesso().isBlank()){
            throw new NotaFiscalException("Chave de acesso é obrigatório");
        }
    }

    public NotaFiscalDTO parse(InputStream is) throws JAXBException {
        jaxbContext = JAXBContext.newInstance(NfeProcDTO.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Object obj = unmarshaller.unmarshal(is);

        if (obj instanceof NfeProcDTO) {
            return ((NfeProcDTO) obj).getNfe();
        } else if (obj instanceof NotaFiscalDTO) {
            return (NotaFiscalDTO) obj;
        } else {
            throw new JAXBException("XML inválido ou formato desconhecido");
        }
    }

}
