package com.example.Aula33sincHibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "Tb-Aluno")
public class AlunoModel {

    @Id
    @SequenceGenerator(name = "aluno_sequence", sequenceName = "aluno_sequence",allocationSize = 1)
    //vai criar e controlar toda a criaçãodos nossos Id's
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aluno_sequence")
    //será a forma que essa sequencia será gerada
    private Long id;
    private String nome;
    private String idade;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    //CascadeType.REMOVE -- quando eu remover o professor, todos os alunos que estiverem associados
    // ao professor serão removidos
    @JoinColumn(name = "professor_id")//É onde ele faz o JOIN com a tabela professor
    private ProfessorModel professorModel;

    public AlunoModel() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
