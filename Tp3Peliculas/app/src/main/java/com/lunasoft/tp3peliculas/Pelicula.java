package com.lunasoft.tp3peliculas;

import android.os.Parcelable;

import java.io.Serializable;
import java.util.List;

public class Pelicula implements Serializable {

    private String nombre;
    private List<String> actores;
    private String sinopsis;
    private String director;
    private int foto;

    private String actoresCadena;

    public Pelicula(String nombre, List actores, String sinopsis, String director, int foto) {
        this.nombre = nombre;
        this.actores = actores;
        this.sinopsis = sinopsis;
        this.director = director;
        this.foto = foto;
    }

    public String getActoresCadena() {
        return actoresCadena;
    }

    public void setActoresCadena(String actoresCadena) {
        this.actoresCadena = actoresCadena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getActores() {
        return actores;
    }

    public void setActores(List<String> actores) {
        this.actores = actores;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}


