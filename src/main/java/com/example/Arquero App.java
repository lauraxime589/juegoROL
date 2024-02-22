package com.example;

public class Arquero extends personaje{
    private int destreza;
    private int agilidad;
    private int precision;
    private boolean disparoRapido;
    private boolean flechaVenenosa;
    private boolean tiroCertero;
    
    public Arquero(int destreza, int agilidad, int precision, boolean disparoRapido, boolean flechaVenenosa,
            boolean tiroCertero) {
        this.destreza = destreza;
        this.agilidad = agilidad;
        this.precision = precision;
        this.disparoRapido = disparoRapido;
        this.flechaVenenosa = flechaVenenosa;
        this.tiroCertero = tiroCertero;
    }

    
    
}
