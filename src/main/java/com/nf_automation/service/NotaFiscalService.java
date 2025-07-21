package com.nf_automation.service;

import com.nf_automation.dto.NotaFiscalDTO;
import com.nf_automation.mapper.NotaFiscalMapper;
import com.nf_automation.model.Destinatario;
import com.nf_automation.model.Emitente;
import com.nf_automation.model.NotaFiscal;
import com.nf_automation.repository.DestinatarioRepository;
import com.nf_automation.repository.EmitenteRepository;
import com.nf_automation.repository.NotaFiscalRepository;
import com.nf_automation.xml.NotaFiscalXmlParser;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;

@Service
public class NotaFiscalService {

    @Autowired
    private NotaFiscalRepository repository;

    @Autowired
    private NotaFiscalXmlParser parser;

    @Autowired
    private EmitenteRepository repoEmitente;

    @Autowired
    private DestinatarioRepository repoDestinatario;


    // Salvar nota fiscal no sistema
    public NotaFiscal salvar(NotaFiscal notaFiscal){

        Emitente novoEmitente = repoEmitente.save(notaFiscal.getEmitente());
        notaFiscal.setEmitente(novoEmitente);

        Destinatario novoDestinatario = repoDestinatario.save(notaFiscal.getDestinatario());
        notaFiscal.setDestinatario(novoDestinatario);

        return repository.save(notaFiscal);
    }

    // Listar todas as notas
    public List<NotaFiscal> listarTodos(){
        return repository.findAll();
    }

    // Buscar nota pelo seu ID
    public Optional<NotaFiscal> buscarPorId(Long id){
        return repository.findById(id);
    }

    // Deletar nota fiscal
    public void deletar(Long id){
        repository.deleteById(id);
    }

    // Fazer upload da nota fiscal
    @Transactional
    public NotaFiscal processarNotaFiscal(NotaFiscalDTO dto) {
        NotaFiscal notaFiscal = NotaFiscalMapper.toEntity(dto);
        return repository.save(notaFiscal);
    }


}
