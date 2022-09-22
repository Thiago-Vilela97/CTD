package com.example.Aula34SincHQL.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_jogador")
public class JogadorModel {

    @Id
    @SequenceGenerator(name = "jogador_sequence", sequenceName = "jogador_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
    private Long id;
    private String nome;
    private String clubeFavorito;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "treinador_id")
    private TreinadorModel treinadorModel;

    public JogadorModel(String nome, String clubeFavorito) {
        this.nome = nome;
        this.clubeFavorito = clubeFavorito;
    }
    public JogadorModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClubeFavorito() {
        return clubeFavorito;
    }

    public void setClubeFavorito(String clubeFavorito) {
        this.clubeFavorito = clubeFavorito;
    }
}
