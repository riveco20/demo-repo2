package com.ejercicioCadena.EjerciciosConCadenas.EjerciciosOperadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //Operador de suma
        int  a=3,b=2;
        int suma = a+b;
        System.out.println("El valor de la suma es: " + suma);
        //Operador de resta
        int resta = 1-b;
        System.out.println("resta = " + resta);
        
        //operador de multiplicaciones 
        int multiplicaciones = 3*2;
        System.out.println("multiplicaciones = " + multiplicaciones);
        
        //operador de divicion 
        double divicion = 3D / b;
        System.out.println("divicion = " + divicion);

        //operador de modulo
        int modulo = a%b;
        System.out.println("modulo = " + modulo);
        if(modulo==0){
            System.out.println("El numero es par");
        }

        else {
            System.out.println("El numero es impar");
        }
    }
}
