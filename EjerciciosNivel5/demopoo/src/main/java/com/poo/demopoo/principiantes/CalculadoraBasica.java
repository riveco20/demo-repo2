package com.poo.demopoo.principiantes;

public class CalculadoraBasica {
    public int numeroUno;
    public int numeroDos;

    public CalculadoraBasica() {
    }

    public void sumar(int numeroUno , int numeroDos){
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
        int suma = numeroUno + numeroDos;
        System.out.println("El resultado de la suma es: " + suma);
    }

    public int resta(int numeroUno, int numeroDos){
        this.numeroUno = numeroUno;
        this.numeroDos= numeroDos;
        return numeroUno-numeroDos;
    }

    public void multiplicacion(int numeroUno, int numeroDos){
        this.numeroDos=numeroDos;
        this.numeroUno=numeroUno;

        System.out.println("El resultado de la multiplicaciones es: " + (numeroDos*numeroUno));
    }

    public void divicion(int numeroUno, int numeroDos){
        this.numeroUno=numeroUno;
        this.numeroDos=numeroDos;

        double divicion =(numeroUno/numeroDos);

        System.out.println("divicion = " + divicion);
    }

}
