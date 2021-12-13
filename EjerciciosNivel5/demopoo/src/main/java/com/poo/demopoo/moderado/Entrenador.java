package com.poo.demopoo.moderado;

public class Entrenador extends Futbol{
    public String idFederacion;

    public Entrenador(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(Integer id, String nombre, String apellido, Integer edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirEntrenamiento(){
        System.out.println("Entrenamiento Dirigido");
    }

    public void dirigirPartido(){
        System.out.println("Partido Dirigido");
    }
}
