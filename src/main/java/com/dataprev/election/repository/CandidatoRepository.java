package com.dataprev.election.repository;

import com.dataprev.election.model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<Candidato,Long> {
}
