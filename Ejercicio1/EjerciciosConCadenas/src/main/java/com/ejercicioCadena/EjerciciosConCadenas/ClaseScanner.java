package com.ejercicioCadena.EjerciciosConCadenas;

import java.util.Scanner;

public class ClaseScanner {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa tu nombre por favor");
        String nombre = consola.nextLine();
        System.out.println("Saludos " + nombre);

    }
}
