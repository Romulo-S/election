package com.dataprev.election.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Cargo")
@Data
public class Cargo {

    @Id
    @GeneratedValue
    @Column(name = "cargo_id", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false, length = 255)
    private String nome;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_eleicao",nullable=false)
    private Eleicao eleicao;

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "cargo",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Candidato> candidatos = new HashSet<>();
}
