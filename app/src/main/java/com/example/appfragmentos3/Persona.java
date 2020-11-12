package com.example.appfragmentos3;

import android.widget.TextView;

public class Persona {

    private String nombre;
    private String paterno;
    private String materno;

    public Persona(String nombre, String paterno, String materno) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String toString(){
        return "Persona";
    }
}
