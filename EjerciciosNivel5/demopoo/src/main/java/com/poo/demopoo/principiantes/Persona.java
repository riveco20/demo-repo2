package com.poo.demopoo.principiantes;

public class Persona {
    public String nombre;
    public String apellido;
    public String cedula;
    public String profesion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String cedula, String profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.profesion = profesion;
    }

    public void mostrarCredencial(){
        System.out.println("-------Credencial-------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Documento: " + cedula);
        System.out.println("Profesion: " + profesion);
    }

}
