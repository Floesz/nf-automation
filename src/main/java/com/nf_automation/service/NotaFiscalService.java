package com.nf_automation.service;

import com.nf_automation.dto.NotaFiscalDTO;
import com.nf_automation.exception.NotaFiscalException;
import com.nf_automation.exception.ResourceConflictException;
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

        if(notaFiscal == null || notaFiscal.getChaveAcesso() == null){
            throw new NotaFiscalException("Nota Fiscal ou chave de acesso é nula!");
        }
        Optional<NotaFiscal> existente = repository.findByChaveAcesso(notaFiscal.getChaveAcesso());
        if(existente.isPresent()){
            throw new ResourceConflictException("Já existe uma nota fiscal com a chave de acesso informada!");
        }
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

    // Buscar pela chave de acesso
    public NotaFiscal buscarPorChaveDeAcesso(String chaveAcesso){
        return repository.findByChaveAcesso(chaveAcesso)
                .orElseThrow(() -> new RuntimeException("Nota fiscal com chave de acesso" + chaveAcesso + "nao encontrada"));
    }

    // Buscar pelo numero de série
    public NotaFiscal buscarPorNumero(String numero){
        return repository.findByNumero(numero)
                .orElseThrow(() -> new RuntimeException("Nota fiscal com numero" + numero + "nao encotrada"));
    }



}
