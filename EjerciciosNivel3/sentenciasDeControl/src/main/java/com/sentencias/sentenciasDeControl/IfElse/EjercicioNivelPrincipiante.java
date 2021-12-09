package com.sentencias.sentenciasDeControl.IfElse;

import java.util.Scanner;

public class EjercicioNivelPrincipiante {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Por favor digite un numero");
        int numero = Integer.parseInt(consola.nextLine());

        if(numero==1){
            System.out.println("Ingresaste el numero uno");
        }
        else if(numero==2){
            System.out.println("Ingresaste el numero dos");

        }

        else if(numero==3){
            System.out.println("Ingresaste el numero tres");
        }

        else  {
            System.out.println("Ingresaste un numero desconocido");
        }
    }
}
