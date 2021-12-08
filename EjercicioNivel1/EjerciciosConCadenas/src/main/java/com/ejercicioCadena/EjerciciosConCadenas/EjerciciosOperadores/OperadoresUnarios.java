package com.ejercicioCadena.EjerciciosConCadenas.EjerciciosOperadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int a =3;
        int b =-a;
        System.out.println("b = " + b);

        //Operador para los tipos boolean
        boolean d = true;
        boolean c =!d;
        System.out.println("c = " + c);

        //PosDecremento posIncremento, preIncremento y preDecremento

        int e = 3;
        int f = e++;//pos
        System.out.println("valro de e : " + e);
        System.out.println("valor de f : " + f);

        int g =2;
        int h=++g;//pre
        System.out.println("Valor de g : " + g);
        System.out.println("Valor de h : " + h);

        int t =2;
        int y=--g;//pre
        System.out.println("Valor de t : " + t);
        System.out.println("Valor de y : " + y);

        int j =2;
        int i=g--;
        System.out.println("Valor de j : " + j);
        System.out.println("Valor de i : " + i);
    }
}
