package com.nf_automation.controller;

import com.nf_automation.dto.NotaFiscalDTO;
import com.nf_automation.exception.ResourceConflictException;
import com.nf_automation.mapper.NotaFiscalMapper;
import com.nf_automation.model.NotaFiscal;
import com.nf_automation.service.NotaFiscalService;
import com.nf_automation.xml.NotaFiscalXmlParser;
;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@RestController
@RequestMapping("/notas_fiscais")
@Validated
public class NotaFiscalController {

    @Autowired
    private NotaFiscalService service;

    @Autowired
    private NotaFiscalXmlParser parser;

    @Autowired
    private NotaFiscalMapper mapper;

    // Criar nova nota fiscal
    @PostMapping
    public ResponseEntity<NotaFiscal> salvar(@RequestBody NotaFiscalDTO notaFiscalDTO){
        try{
            NotaFiscal nf = mapper.toEntity(notaFiscalDTO);
            NotaFiscal novaNf = service.salvar(nf);
            return ResponseEntity.status(HttpStatus.CREATED).body(novaNf);
        }catch(ResourceConflictException ex){
            throw new ResourceConflictException("Essa nota fiscal já está cadastrada!");
        }
    }

    // Listar as notas fiscais
    @GetMapping
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

    // Fazer upload da NF via XML
    @PostMapping("/upload")
    public ResponseEntity<String> uploadNotaFiscal(@RequestParam("file")MultipartFile file){
        try {
            NotaFiscalDTO dto = parser.parse(file.getInputStream());
            NotaFiscal nf = NotaFiscalMapper.toEntity(dto);
            service.salvar(nf);
            return ResponseEntity.ok("Nota fiscal processada com sucesso!");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro ao processar nota fiscal : " + e.getMessage());
        }

    }

    // Consultar nota pelo numero
    @GetMapping("/buscar_por_numero")
    public ResponseEntity<NotaFiscal> buscarPorNumero(@RequestParam @NotBlank String numero){
        NotaFiscal nota = service.buscarPorNumero(numero);
        if(nota == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(nota);
    }

    // Consultar nota pela chave de acesso
    @GetMapping("/buscar_por_chaveAcesso")
    public ResponseEntity<NotaFiscal> buscarPorChaveDeAcesso(@RequestParam @NotBlank String chaveAcesso){
        NotaFiscal nota = service.buscarPorChaveDeAcesso(chaveAcesso);
        return ResponseEntity.ok(nota);
    }

}
