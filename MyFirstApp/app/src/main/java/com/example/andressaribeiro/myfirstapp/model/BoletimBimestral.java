package com.example.andressaribeiro.myfirstapp.model;

/**
 * Created by Andressa Ribeiro on 05/03/2018.
 */

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;

@Entity
public class BoletimBimestral {

    @Id
    private long id;
    private double notaB1;
    private double notaB2;

    private ToMany<Disciplina> disciplinaToMany;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public double getNotaB1() {
        return notaB1;
    }

    public void setNotaB1(double notaB1) {
        this.notaB1 = notaB1;
    }

    public double getNotaB2() {
        return notaB2;
    }

    public void setNotaB2(double notaB2) {
        this.notaB2 = notaB2;
    }

    public ToMany<Disciplina> getDisciplinaToMany() {
        return disciplinaToMany;
    }

    public void setDisciplinaToMany(ToMany<Disciplina> disciplinaToMany) {
        this.disciplinaToMany = disciplinaToMany;
    }
}
