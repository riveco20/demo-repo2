package com.ejercicioCadena.EjerciciosConCadenas.EjerciciosOperadores;

import ch.qos.logback.core.db.BindDataSourceToJNDIAction;

public class OperadoresCondicionales {
    public static void main(String[] args) {
        int a =3;
        int valoMinimo =0;
        int valorMaximo =10;
        boolean res =a>=valoMinimo && a<= valorMaximo;
        System.out.println("res = " + res);

        if(a>=valoMinimo && a<= valorMaximo){
            System.out.println("Dentro de rango");
        }
        else{
            System.out.println("Fuera de rango");
        }

        //operador ||

        boolean vaciones = false;
        boolean diaDescanso =false;
        if(vaciones||diaDescanso){
            System.out.println("El padre no esta ocupado puede asistir al juego del hijo");
        }
        else{
            System.out.println("El padre esta ocupado no puede asistir al juego del hijo ");

        }

    }
}
