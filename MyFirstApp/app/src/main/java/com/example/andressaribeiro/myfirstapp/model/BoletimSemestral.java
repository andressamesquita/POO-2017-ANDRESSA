package com.example.andressaribeiro.myfirstapp.model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;

/**
 * Created by Andressa Ribeiro on 05/03/2018.
 */
@Entity
public class BoletimSemestral {
    @Id
    private long id;
    private double notaS1;
    private double notaS2;
    private double notaS3;
    private double notaS4;

    private ToMany<Disciplina>disciplinaToMany;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getNotaS1() {
        return notaS1;
    }

    public void setNotaS1(double notaS1) {
        this.notaS1 = notaS1;
    }

    public double getNotaS2() {
        return notaS2;
    }

    public void setNotaS2(double notaS2) {
        this.notaS2 = notaS2;
    }

    public double getNotaS3() {
        return notaS3;
    }

    public void setNotaS3(double notaS3) {
        this.notaS3 = notaS3;
    }

    public double getNotaS4() {
        return notaS4;
    }

    public void setNotaS4(double notaS4) {
        this.notaS4 = notaS4;
    }

    public ToMany<Disciplina> getDisciplinaToMany() {
        return disciplinaToMany;
    }

    public void setDisciplinaToMany(ToMany<Disciplina> disciplinaToMany) {
        this.disciplinaToMany = disciplinaToMany;
    }
}
