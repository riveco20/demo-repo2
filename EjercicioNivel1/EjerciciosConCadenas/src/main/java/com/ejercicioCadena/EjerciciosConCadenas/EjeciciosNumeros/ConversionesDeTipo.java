package com.ejercicioCadena.EjerciciosConCadenas.EjeciciosNumeros;

import java.util.Scanner;

public class ConversionesDeTipo {
    public static void main(String[] args) {
       //convertir caracteres en numeros
        int edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);
        Double pi = Double.parseDouble("3.14");
        System.out.println("pi = " + pi);
     
        //Convertir cadena a tipo caracter 
        //comienza en 0,1,2,3....
        char c = "hola".charAt(0);
        System.out.println("c = " + c);

        //clase Scanner
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");
        int edadDos = Integer.parseInt(consola.nextLine());
        System.out.println("edadDos = " + edadDos);
        System.out.println("ingres una cadena");
        char caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    
    //Convertir numero en cadenas
        String edadTexto = String.valueOf(25);
        String piTexto = String.valueOf(3.14);
        System.out.println("piTexto = " + piTexto);
        System.out.println("edadTexto = " + edadTexto);
        System.out.println(""+pi);

    }
}
