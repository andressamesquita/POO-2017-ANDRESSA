package com.example.andressaribeiro.myapplication.model;

/**
 * Created by Andressa Ribeiro on 14/03/2018.
 */

public class Bimestre {

    private double nota1;
    private double nota2;

    private int peso1;
    private int peso2;

    private double media;

    public Bimestre(){

    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public int getPeso1() {
        return peso1;
    }

    public void setPeso1(int peso1) {
        this.peso1 = peso1;
    }

    public int getPeso2() {
        return peso2;
    }

    public void setPeso2(int peso2) {
        this.peso2 = peso2;
    }

    public double getMedia() {
        media = (getNota1()*getPeso1())+(getNota2()*getPeso2())/(getPeso1()+getPeso2());
        return media;
    }

    public void setMedia(double media){
        this.media = media;
    }

}
