package org.example;

public abstract class Forma {


    public void calcolaArea(Integer base,Integer altezza){
        System.out.println("l'area è di = "+base*altezza);
    }

    public abstract void calcolaArea();
}
