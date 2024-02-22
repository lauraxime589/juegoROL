package com.example;

public class Mago extends personaje{
    private int inteligencia;
    private int sabiduria;
    private int energMagica;
    private boolean bolaFuego;
    private boolean rayoElectri;
    private boolean hechizoCurador;
    
    public Mago(int inteligencia, int sabiduria, int energMagica, boolean bolaFuego, boolean rayoElectri,
            boolean hechizoCurador) {
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.energMagica = energMagica;
        this.bolaFuego = bolaFuego;
        this.rayoElectri = rayoElectri;
        this.hechizoCurador = hechizoCurador;
    }

    
    
}
