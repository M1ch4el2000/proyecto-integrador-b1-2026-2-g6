package com.example.model;

public class Recluta extends Ramas_UNSC{
    private Long id; // para que sea autogenerado por la BD
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private double altura;

    // ===================
    // Constructor completo
    // ===================
    public Recluta(Long id, String nombre, String apellido, int edad, double peso, double altura) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    // ===================
    // Constructor sin ID
    // (para insertar nuevos usuarios sin ID)
    // ===================
    public Recluta(String nombre, String apellido, int edad, double peso, double altura) {
        this(null, nombre, apellido, edad, peso, altura);
    }

    // ===================
    // Constructor vacío
    // ===================
    public Recluta() {
    
    }

    // ===================
    // Getters y setters
    // ===================
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public double getPeso(){
        return  peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Recluta [id= " + id + ", Name= " + nombre + ", Apellido= " + apellido + "sirviendo en= " + getRama() + "]";
    }
}
