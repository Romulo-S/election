package com.dataprev.election.model;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "Eleicao")
@Data
public class Eleicao {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_eleicao", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false, length = 40)
    private String nome;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_inicio", nullable = false)
    private Date data_inicio;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_fim", nullable = false)
    private  Date data_fim;

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "eleicao",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Cargo> cargos = new HashSet<>();

}
