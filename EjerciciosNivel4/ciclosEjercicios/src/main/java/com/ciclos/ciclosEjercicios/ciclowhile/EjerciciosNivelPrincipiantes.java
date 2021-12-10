package com.ciclos.ciclosEjercicios.ciclowhile;

import java.util.Scanner;

public class EjerciciosNivelPrincipiantes {
    public static void main(String[] args) {
        System.out.println("Comprobar si un numero es par e impar");
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el numero hasta donde quiere calcular los par e impar");
        int numero = consola.nextInt();
        int contador=0;
        while (contador<=numero){
            var resultado = (contador%2==0) ?" es par":" es impar";
            System.out.println(contador + resultado  );
            contador++;
        }
    }
}
