package com.poo.demopoo.moderado;

public class Masajista extends Futbol{
    public String titulacion;
    public Integer añosExperiencia;

    public Masajista(String titulacion, Integer añosExperiencia) {
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public Masajista(Integer id, String nombre, String apellido, Integer edad, String titulacion, Integer añosExperiencia) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public void darMasaje(){
        System.out.println("Se esta dando masaje");
    }
}
