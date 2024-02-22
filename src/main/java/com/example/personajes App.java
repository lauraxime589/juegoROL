package com.example;

abstract class personajes {

    private String nombre;
    private String descripcion;
    private String apodo;
    private int dineroInicial;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getApodo() {
        return apodo;
    }
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    public int getDineroInicial() {
        return dineroInicial;
    }
    public void setDineroInicial(int dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

    
}
