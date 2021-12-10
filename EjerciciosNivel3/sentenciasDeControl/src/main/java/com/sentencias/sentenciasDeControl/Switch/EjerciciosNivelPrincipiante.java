package com.sentencias.sentenciasDeControl.Switch;

import java.util.Scanner;

public class EjerciciosNivelPrincipiante {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Por favor ingres el numero del mes");
    /**    int numero = Integer.parseInt(consola.nextLine());
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
    **/
    int mes = consola.nextInt();
    String texto ="Estacion del año";
    switch (mes){
        case 12: case 1: case 2:texto="Invierno";
                                break;
        case 3: case 4: case 5: texto="Primabera";
                                break;
        case 9: case 10: case 11:texto="Verano";
                                 break;
        case 6: case 7: case 8:texto="Otoño";
            break;
        default:texto="No ha ingresado un valor correcto";
        break;
    }
        System.out.println("La estacion del año es = " + texto);
     }
}
