package com.company;

import java.util.Date;

public class Paciente {
    String nome;
    String sobrenome;
    String historiaClinica;
    Date dataInternacao;
    Date dataAlta;


    Paciente(String nome, String sobrenome, String historiaClinica, Date dataInternacao)
    {   Date hoje= new Date();
        this.nome=nome;
        this.sobrenome=sobrenome;
        dataAlta=null;
        if (dataInternacao.before(hoje))
            this.dataInternacao=dataInternacao;
    }

    public Date getDataInternacao() {

        return dataInternacao;
    }

    public Date getDataAlta() {

        return dataAlta;
    }

    public void darAlta(Date dataAlta)
    {
        if (dataAlta.after(dataInternacao))
            System.out.println("Ok");
        else
            System.out.println("Não pode");
    }



}
