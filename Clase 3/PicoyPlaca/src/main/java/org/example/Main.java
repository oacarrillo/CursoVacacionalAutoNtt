package org.example;

public class Main {
    public static void main(String[] args) {
       PicoPlaca picoPlaca= new PicoPlaca();
       boolean expected=PicoPlaca.tienePicoPlaca("Bogota","Lunes","ABC129");
       System.out.println(expected);
    }
}