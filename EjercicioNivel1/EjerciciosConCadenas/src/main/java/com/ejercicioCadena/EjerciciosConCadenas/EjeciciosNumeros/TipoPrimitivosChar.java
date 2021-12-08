package com.ejercicioCadena.EjerciciosConCadenas.EjeciciosNumeros;

import javax.sound.midi.spi.SoundbankReader;

public class TipoPrimitivosChar {
    public static void main(String[] args) {

        System.out.println("---char---");
        System.out.println("bits tipo byte" + Character.SIZE);
        System.out.println("Maximo positivo de byte " + Character.MAX_VALUE);
        System.out.println("Valor minimo de byte" + Character.MIN_VALUE);

        //Para el tipo char usamos ' comillas simples
        char c = 'h';
        var a ='\u0021';
        System.out.println("Caracter con unicor= " + a);
    }
}
