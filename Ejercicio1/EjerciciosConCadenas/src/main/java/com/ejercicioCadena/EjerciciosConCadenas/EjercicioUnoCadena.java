package com.ejercicioCadena.EjerciciosConCadenas;

import ch.qos.logback.core.joran.conditional.ElseAction;

public class EjercicioUnoCadena {
    public static void main(String[] args) {
        String holaMundo =  "Hola mundo";
        for (int i = 1; i < 4; i++) {
            System.out.printf("\n" + holaMundo);

        }

        String cadenaDos = "Esta es una cadena nueva";
        var cadenaTres = "Esta tambien es una forma de cadena";
        if(cadenaTres.equals(cadenaDos)){

            System.out.println("\n"+"Estas cadenas son iguales");
        }
        else {
            System.out.println("\n"+"las cadenas no son iguales");
        }
    }
}
