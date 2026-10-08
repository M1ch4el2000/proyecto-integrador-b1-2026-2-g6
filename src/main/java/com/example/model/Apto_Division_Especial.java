package com.example.model;

public class Apto_Division_Especial extends Recluta {
    private boolean apto_EspDiv;

    public boolean getApto_EspDiv() {
        return apto_EspDiv;
    }

    public void setApto_EspDiv(boolean apto_EspDiv) {
        this.apto_EspDiv = apto_EspDiv;
    }

    @Override
    public String toString() {
        return "Recluta [id= " + getId() + ", Name= " + getNombre() + "Apellido= " + getApellido() + " Sirviendo actualmente en=" + getRama() + " es " + getApto_EspDiv() + " para servir en fuerzas especiales]";
    }
}
