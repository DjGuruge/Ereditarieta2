package org.example;

public class Rettangolo extends Forma {
    Integer base;
    Integer altezza;

    public Rettangolo(Integer base, Integer altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public void calcolaArea(){
        int risultato = base*altezza;
        System.out.println("l'area è di = "+base*altezza);
    }

}
