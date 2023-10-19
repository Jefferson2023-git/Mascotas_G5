package com.example.animation2;

public class Conejo {
    String nombre;
    double altura;
    double peso;
    String colorPelaje;
    String genero;
    String raza;

    public Conejo(String nombre, double altura, double peso, String colorPelaje, String genero, String raza) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.colorPelaje = colorPelaje;
        this.genero = genero;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public String getGenero() {
        return genero;
    }

    public String getRaza() {
        return raza;
    }
}
