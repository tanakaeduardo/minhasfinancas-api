package com.tanakaeduardo.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanakaeduardo.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
