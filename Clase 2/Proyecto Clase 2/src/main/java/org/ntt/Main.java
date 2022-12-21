package org.ntt;


public class Main {
    public static void main(String[] args) {
        //Calculadora calc = new Calculadora();
        //System.out.println(calc.sumar(1,2));

        Animal perro =new Animal();
        String resultado = perro.comer(2,"Yuki");
        System.out.println(resultado);

        Animal gato = new Animal();
        gato.caminar(1,"micho");
        System.out.println(gato.comer(3,"micho2"));


// tarea: terminar la clase calculadora, con - * /
// crear un objeto calculadora y llamar las 4 operaciones

    }

}
