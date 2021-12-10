package com.sentencias.sentenciasDeControl.Switch;

import java.util.Scanner;

public class EjerciciosNivelPrincipiante {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Por favor digite un numero");
        int numero = Integer.parseInt(consola.nextLine());
        String texto;
        switch (numero){
            case 1:
                texto="Numero uno";
                break;
            case 2:
                texto="Numero dos";
                break;
            case 3:
                texto="Numero tres";
                break;
            default:
                texto="Numero desconocido";
                break;
        }
        System.out.println(texto);
    }
}
