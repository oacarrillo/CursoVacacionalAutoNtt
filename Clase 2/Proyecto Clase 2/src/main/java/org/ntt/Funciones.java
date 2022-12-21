package org.ntt;

public class Funciones {
    public static void main(String[] args) {
       // System.out.println(1);//directo
       // System.out.println(sumar(5,2));// llamado de funcion con parametros

        saludar();
        saludar("Oscar");
        //saludar("Oscar", "Carrillo");
    }

    public static int sumar(int a, int b){
        return a+b;
    }

    public static void saludar(){
        System.out.println("Hola");
    }
    public static void saludar( String name){
        System.out.println("Hola "+name);
    }

    public static void saludar( String name, String apellido){
        System.out.println("Hola "+name+" "+apellido);
    }

}
