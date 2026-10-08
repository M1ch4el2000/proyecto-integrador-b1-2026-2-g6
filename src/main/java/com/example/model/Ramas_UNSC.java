package com.example.model;

public class Ramas_UNSC {
    private Long id;
    private String rama;

    public Ramas_UNSC(Long id, String rama){
        this.id = id;
        this.rama = rama;
    }

    public Ramas_UNSC(String rama){
        this.rama = rama;
    }

    public Ramas_UNSC(){

    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getRama(){
        return rama;
    }

    //Setter para poner al recluta en una de las ramas de la UNSC
    public  void setRama(String rama){
        this.rama = rama;
    }

    @Override
    public String toString() {
        return "Ramas disponibles: \n" + rama;
    }
}
