package com.programacionFuncional.programacionFuncional.principiante;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class FuncionLambdas {

    public LinkedList nombres;


   public FuncionLambdas(){

   }

   public LinkedList AgregarNombres() {
       this.nombres = new LinkedList();
       InputStreamReader in = new InputStreamReader(System.in);
       BufferedReader buffer = new BufferedReader(in);
       String texto="si";
       while (texto.equalsIgnoreCase("si")){
           try {
               System.out.println("Agrega un nombre");
               String nombre = buffer.readLine();
               nombres.add(nombre);
               System.out.println("Quiere agregar otro nombre");
               texto = buffer.readLine();

           }catch (Exception ex){
               ex.printStackTrace();
           }
           }
       return nombres;
   }

   public void ordenarNombres(){

       LinkedList list = new LinkedList();
       list = this.AgregarNombres();
       Collections.sort(list, (String p1, String p2) -> p1.compareTo(p2));
       for(Object elementos:list){
           System.out.println(elementos);
       }
   }




    public static void main(String[] args) {
       LinkedList list = new LinkedList();
       FuncionLambdas prueba = new FuncionLambdas();

       prueba.ordenarNombres();



    }
}
