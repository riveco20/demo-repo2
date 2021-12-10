package com.ciclos.ciclosEjercicios.ciclofor;

import java.util.Scanner;

public class EjerciciosNivelPrincipiante {
    public static void main(String[] args) {
        System.out.println("Comprobar si un numero es par e impar");
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el numero hasta donde quiere calcular los par e impar");
        int numero = consola.nextInt();
    /**    for (int i = 0; i <= numero; i++) {
            var resultado = (i % 2 == 0) ? " es par " : " es impar";
            System.out.println( i + resultado);
        }

        for (int i = 0; i <=numero ; i++) {
            if(numero%2==0){
                System.out.println("Hola todo va bien");
            }
            break;
        }

        System.out.println("Ocurrio un error se encontro un numero impar");

     */

        for (int i = 0; i <=numero ; i++) {
            if(numero%2==0){

                System.out.println(i + "Numero par");
                continue;

            }
            else {
                System.out.println(i + "Numero impar");
            }

        }

        System.out.println("Fin del ciclo");

    }


    }
