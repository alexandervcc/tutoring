package acc.coding.poo;

import java.util.Scanner;

public class Poo {
   /*
    * Programacion Orientada a Objetos
    * Es nuevo paradigma busca abstraer conceptos del mundo real dentro del codigo
    * Cada representacion de un item del mundo real se denomina objeto.
    * Dado que un objeto del mundo real es demasiado complejo en la programacion se
    * utilizar el proceso de 'abstraccion' para obtener/asignar solo las
    * caracteristicas deseadas en el programa.
    * 
    * Objeto se compone de 2 partes importantes:
    * - atributos: caracteristicas que definen al objeto.
    * Auto: color, marca, peso, modelo, anio
    * - metodos (funciones): acciones que un objeto puede realizar
    * Auto: prender, arrancar, cambiar_marcha, apagarse
    * 
    * En Orientacion a objetos veremos dos conceptos:
    * - Clase: molde o plantilla para construir objetos
    * - Objeto: una instancia de la clase.
    */

   public static void ejecutar() {
      Poo.ejecutarEjemploMascota();
   }

   public static void ejecutarEjemploMascota() {
      Mascota m1 = new Mascota("Mana", "Perro", 18);
      Mascota m3 = new Mascota("Babas","Perro",12);
      /*       
      Si atributos son publicos se puede leer/escribir
      System.out.println("m1 = " + m1.nombre);
      m1.nombre = "Lucky";
      System.out.println("m1 = " + m1.nombre);
      */
      System.out.println("m1 = "+m1);


      /* 
      Esta operacion es imposible porque el atributo es privado
      System.out.println("m1 = " + m1.edad);
      m1.edad = 1; 
      */
      m1.comer();

      // Getter & Setter
      Mascota m2 = new Mascota();
      System.out.println("m2 = "+m2.getNombre());
      m2.setNombre("Cocochas");
      System.out.println("m2 = "+m2.getNombre());
      
      
   }

   public static void ejecutarEjemploPerson() {
      String str1 = "";
      Scanner sc = new Scanner(System.in);
      sc.close();
      // Al declarar objetos siempre utilizaremos la palabra `new` para su
      // instanciacion.
      Persona p1 = new Persona();
      // p1.nombre = "Alex";
      p1.edad = 28;
      p1.apellido = "Charco";
      p1.peso = 100.25;

      Persona p2 = new Persona();
      p2.nombre = "Jose";
      p2.edad = 24;
      p2.apellido = "Charco";
      p2.peso = 10.25;

      System.out.println("Person1. Nombre= " + p1.nombre);
      System.out.println("Person2. Nombre= " + p2.nombre);

      System.out.println("p1 = " + p1);
      System.out.println("p2 = " + p2);

      p1.trabajar();
      p2.trabajar();

      System.out.println("\n\n\n\n\n");
      Persona p3 = new Persona("Cosme", "Fulanito", 42, 150.6);
      System.out.println("Person3. Nombre= " + p3.nombre);
      System.out.println("Person3. masaCorporal= " + p3.masaCorporal);
      p3.nombre = "Homero";
      System.out.println("Person3. Nombre= " + p3.nombre);
      System.out.println(p3);
      // Esto crea un objeto totalmente nuevo
      p3 = new Persona();
      System.out.println(p3);

      Persona p4 = new Persona("Simpson");
      p4.trabajar();

      System.out.println("\n\n\n\n\ntoString()");
      System.out.println("p3.1 = " + p3.toString());
      System.out.println("p3.2 = " + p3);
      System.out.println("p1 = " + p1);

      Persona p5 = p1;
      if (p1 == p5) {
         System.out.println("p1 y p5 son iguales.");
      }
      Persona p4_2 = new Persona("Simpson");
      System.out.println("  p4 = " + p4);
      System.out.println("p4_2 = " + p4_2);
      if (p4 == p4_2) {
         System.out.println("p4 y p4_2 son iguales.");
      }

      if (p4.equals(p4_2)) {
         System.out.println(">>> p4 y p4_2 son iguales, usando equals.");
      }
   }
}
