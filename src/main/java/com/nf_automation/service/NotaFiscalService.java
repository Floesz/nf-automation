package com.nf_automation.service;

import com.nf_automation.model.NotaFiscal;
import com.nf_automation.repository.NotaFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotaFiscalService {

    @Autowired
    private NotaFiscalRepository repository;

    // Salvar nota fiscal no sistema
    public NotaFiscal salvar(NotaFiscal notaFiscal){
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


}
