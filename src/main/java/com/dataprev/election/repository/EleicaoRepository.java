package com.dataprev.election.repository;

import com.dataprev.election.model.Eleicao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EleicaoRepository extends JpaRepository<Eleicao,Long> {
}
