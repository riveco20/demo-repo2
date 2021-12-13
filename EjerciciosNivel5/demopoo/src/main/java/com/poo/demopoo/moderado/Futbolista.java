package com.poo.demopoo.moderado;

import java.util.Scanner;

public class Futbolista extends Futbol {
    public Integer dorsal;
    public String desmarcacion;

    public Futbolista(Integer dorsal, String desmarcacion) {
        this.dorsal = dorsal;
        this.desmarcacion = desmarcacion;
    }

    public Futbolista(Integer id, String nombre, String apellido, Integer edad, Integer dorsal, String desmarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.desmarcacion = desmarcacion;
    }

    public void jugarPartido(){
        Scanner consola = new Scanner(System.in);
        System.out.println("El jugador estara en el partido");
        String texto= consola.nextLine();
        if(texto.equalsIgnoreCase("si")){
            System.out.println("El jugador estara en el partido");
        }
        else {
            System.out.printf("El jugador no estara en el partido");
        }

    }

}
