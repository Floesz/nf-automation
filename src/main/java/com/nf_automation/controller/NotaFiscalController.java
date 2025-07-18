package com.nf_automation.controller;

import com.nf_automation.model.NotaFiscal;
import com.nf_automation.service.NotaFiscalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notas_fiscais")
public class NotaFiscalController {

    @Autowired
    private NotaFiscalService service;

    // Criar nova nota fiscal
    @PostMapping
    public ResponseEntity<NotaFiscal> salvar(@RequestBody NotaFiscal notaFiscal){
        NotaFiscal novaNf = service.salvar(notaFiscal);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaNf);
    }

    // Listar as notas fiscais
    @GetMapping("/{id}")
    public ResponseEntity<List<NotaFiscal>> listarTodos(){
        List<NotaFiscal> notas = service.listarTodos();
        return ResponseEntity.ok(notas);
    }

    // Buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<NotaFiscal> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id)
        .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Deletar por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        if(service.buscarPorId(id).isPresent()){
            service.deletar(id);
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
