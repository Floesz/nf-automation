package com.nf_automation.model;

public class Destinatario {

    private Long id;
    private String nome;
    private String cnpjOuCpf;
    private String inscricaoEstadual;
    private String endereco;

    public Destinatario(Long id, String nome, String cnpjOuCpf, String inscricaoEstadual) {
        this.id = id;
        this.nome = nome;
        this.cnpjOuCpf = cnpjOuCpf;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    
}
