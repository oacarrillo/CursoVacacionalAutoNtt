package org.ntt;

public class Animal
{
int edad=0;
String nombre;

    public String comer(int a, String b){
        edad=a;
        nombre = b;
        return nombre+ " esta comiendo a pesar de tener "+ a + " años" ;
    }
    public void caminar(int a, String b){
        edad=a;
        nombre = b;
        System.out.println(nombre+ " esta caminando a pesar de tener "+ a + " años");
    }
}
