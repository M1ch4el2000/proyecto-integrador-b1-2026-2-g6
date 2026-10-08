package com.example.model;

public class Divisiones_Especiales {
    private String division_especial;

    public String getDivision(){
        return division_especial;
    }

    //Setter para poner al soldado en ODST u ONI
    public void setDivision(String division_especial){
        this.division_especial = division_especial;
    }

    @Override
    public String toString() {
        return "Pertenece a: " + division_especial;
    }
}
