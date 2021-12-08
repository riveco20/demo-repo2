package com.ejercicioCadena.EjerciciosConCadenas.EjerciciosOperadores;

public class OperadoresIgualdaRelacionales {
    public static void main(String[] args) {
        //Operadores Igualda
        int a=3;
        int b =2;
        boolean c = a==b;
        System.out.println("c = " + c);
        boolean d= a!=b;
        System.out.println("d = " + d);

        String cadenaUno ="Hola";
        String cadenaDos ="Hola";
        boolean f = cadenaDos.equals(cadenaUno);
        System.out.println("f = " + f);

        //operadores relacionales

        boolean g = a>b;
        System.out.println("g = " + g);


        if(a%2==0){
            System.out.println("Numero par");
        }
        else {
            System.out.println("Numero impar");
        }
    }
}
