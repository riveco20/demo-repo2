package com.poo.demopoo.moderado;

public class Futbol {
    protected Integer id;
    protected String nombre;
    protected String apellido;
    protected Integer edad;

    public Futbol() {
    }

    public Futbol(Integer id, String nombre, String apellido, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void concentrase(){
        System.out.println("Agregando concentracion");
    }
    public void viaje(String ciudadOrigne, String ciudadDestino){
        System.out.println("Ciudad de origen: " + ciudadOrigne);
        System.out.println("Ciudad de destino: " + ciudadDestino);
    }
}

