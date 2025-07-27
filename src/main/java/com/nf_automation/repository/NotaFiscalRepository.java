package com.nf_automation.repository;

import com.nf_automation.model.NotaFiscal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NotaFiscalRepository extends JpaRepository<NotaFiscal, Long> {

    Optional<NotaFiscal> findByNumero(String numero);

    Optional<NotaFiscal> findByChaveAcesso(String chaveAcesso);
}
