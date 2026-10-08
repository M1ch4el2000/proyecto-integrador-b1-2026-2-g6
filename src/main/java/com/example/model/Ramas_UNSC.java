package com.example.model;

public class Ramas_UNSC {
    private Long id;
    private String armada;
    private String cuerpo_marines;
    private String ejercito;
    private String fuerza_aerea;
    private String cuerpo_spartan;

    public Ramas_UNSC(Long id, String armada, String cuerpo_marines, String ejercito, String fuerza_aerea, String cuerpo_spartan){
        this.id = id;
        this.armada = armada;
        this.cuerpo_marines = cuerpo_marines;
        this.ejercito = ejercito;
        this.fuerza_aerea = fuerza_aerea;
        this.cuerpo_spartan = cuerpo_spartan;
    }

    public Ramas_UNSC(String armada, String cuerpo_marines, String ejercito, String fuerza_aerea, String cuerpo_spartan){
        this.armada = armada;
        this.cuerpo_marines = cuerpo_marines;
        this.ejercito = ejercito;
        this.fuerza_aerea = fuerza_aerea;
        this.cuerpo_spartan = cuerpo_spartan;
    }

    public Ramas_UNSC(){

    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getArmada(){
        return armada;
    }
    
    public String getCuerpo_marines(){
        return cuerpo_marines;
    }

    public String getEjercito(){
        return ejercito;
    }

    public String getFuerza_aerea(){
        return fuerza_aerea;
    }

    public String getCuerpo_spartan(){
        return cuerpo_spartan;
    }
}
