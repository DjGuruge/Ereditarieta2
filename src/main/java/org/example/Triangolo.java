package org.example;

public class Triangolo extends Forma {
    Integer base;
    Integer altezza;

    public Triangolo(Integer base, Integer altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        int risultato = (base * altezza) / 2;
        System.out.println("l'area è di = " + base * altezza);
    }

}

