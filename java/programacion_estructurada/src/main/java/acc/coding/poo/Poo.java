package acc.coding.poo;

import java.util.Scanner;

public class Poo {
    /*
     * Programacion Orientada a Objetos
     * Es nuevo paradigma busca abstraer conceptos del mundo real dentro del codigo
     * Cada representacion de un item del mundo real se denomina objeto.
     * Dado que un objeto del mundo real es demasiado complejo en la programacion se utilizar el proceso de 'abstraccion' para obtener/asignar solo las caracteristicas deseadas en el programa.
     * 
     * Objeto se compone de 2 partes importantes:
     * - atributos: caracteristicas que definen al objeto.
     *      Auto: color, marca, peso, modelo, anio
     * - metodos (funciones): acciones que un objeto puede realizar
     *      Auto: prender, arrancar, cambiar_marcha, apagarse
     * 
     * En Orientacion a objetos veremos dos conceptos:
     * - Clase: molde o plantilla para construir objetos
     * - Objeto: una instancia de la clase.
     */


     public static void ejecutar(){
        /* String str1 = "";
        Scanner sc = new Scanner(System.in); */
        // Al declarar objetos siempre utilizaremos la palabra `new` para su instanciacion.
        Persona p1 = new Persona();
        p1.nombre = "Alex";
        p1.edad = 28;
        p1.apellido = "Charco";
        p1.peso = 100.25;

        Persona p2 = new Persona();
        p2.nombre = "Jose";
        p2.edad = 24;
        p2.apellido = "Charco";
        p2.peso = 10.25;

        System.out.println("Person1. Nombre= "+p1.nombre);
        System.out.println("Person2. Nombre= "+p2.nombre);

        System.out.println("p1 = "+p1);
        System.out.println("p2 = "+p2);
        
        p1.trabajar();
        p2.trabajar();
     }
}
