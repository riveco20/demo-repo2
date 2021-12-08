package com.ejercicioCadena.EjerciciosConCadenas.EjeciciosNumeros;

public class TipoPrimitvosBoolean {
    public static void main(String[] args) {
        System.out.println("---Boolean---");
        System.out.println("Maximo positivo de byte " + Boolean.TRUE);
        System.out.println("Valor minimo de byte" + Boolean.FALSE);

        boolean bolean = false;
        if(bolean){
            System.out.println("La variable contiene un valor verdadero");
        }
        else {
            System.out.println("La variable tiene un valor falso");
        }

        var edad = 10;
        var adulto = edad>=18;
        if(adulto){
            System.out.println("\n"+"Eres mayor de edad puede pasar");
        }
        else {
            System.out.println("\n"+"Eres menor de edad  no puede pasar");
        }

    }
}
