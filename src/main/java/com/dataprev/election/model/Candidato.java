package com.dataprev.election.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Candidato")
@Data
public class Candidato {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_candidato", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false, length = 255)
    private String nome;

    @ManyToOne
    @JoinColumn(name="cargo_id", nullable=false)
    private Cargo cargo;
}
