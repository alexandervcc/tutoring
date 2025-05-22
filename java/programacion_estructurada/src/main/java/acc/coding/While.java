package acc.coding;

import java.util.Scanner;

public class While {
  static void whileEjecucion() {
    // While
    /*
     * Bucle: un trozo de codigo que se repite en funcion de una condicion
     * No hay un rango como en el FOR, sino una condicion
     * Mientras la codicion se cumpla, el bucle se ejecuta
     * Tener cuidado de crear bucles infinito, para ello dentro del while hay que
     * definir un codigo que detenga el while dada alguna condicion.
     */

    /*
     * FORMATO:
     * while( <condicion> ){
     * // codigo a ejecutar
     * }
     * 
     */

    /*
     * Ejemplo de WHILE infinito, no tiene condicion de parada, se ejecuta
     * indefinidamente
     * int contador21 = 0;
     * boolean condiction = 0 > -10;
     * while (condiction) {
     * contador21++;
     * System.out.println("Ejemplo de WHILE infinito, iteracion:" + contador21);
     * }
     */

    // Ejemplo de WHILE con evaluacion true, manualmente se rompe el bucle con break
    int contador = 0;
    while (true) {
      contador++;
      System.out.println("Ejemplo de WHILE infinito, iteracion:" + contador);
      if (contador == 10) {
        System.out.println("Se ha alcanzado el limite de iteraciones, se sale del bucle WHILE");
        // Rompe el bucle WHILE
        break;
      }
    }

    // While con condicion especifica, mientras la condicion se cumpla, el bucle se
    // ejecuta

    System.out.println("\n\nEjemplo de WHILE con condicion explicita:");
    contador = 0;
    while (contador < 5) {
      contador++;
      System.out.println("Ejemplo de WHILE con condicion, iteracion: " + contador);
    }

    Scanner sc = new Scanner(System.in);
    System.out.println("\n\n\nEjemplo de WHILE, para validar un numero entre 0 y 10, usando while true");
    // While con condicion de entrada, el bucle se ejecuta mientras la condicion se
    // umpla
    int numero = 0;
    while (true) {
      System.out.println("Ingrese un numero valido (0-10): ");
      numero = sc.nextInt();
      if (numero >= 0 && numero <= 10) {
        System.out.println("El numero es valido: " + numero);
        break;
      }
    }
    System.out.println("El bucle WHILE ha terminado, el numero es valido: " + numero);

    System.out.println("\n\n\n\n");
    System.out.println("Ejemplo de WHILE, para validar un numero entre 0 y 10, usando while con condicion");
    int contador2 = -1;

    while (contador2 < 0 || contador2 > 10) {
      System.out.println("Ingrese un numero valido (0-10): ");
      contador2 = sc.nextInt();
    }

    System.out.println("El bucle WHILE ha terminado, el numero es valido: " + contador2);

    System.out.println("\n\n\n\n");
    System.out.println("Ejemplo de WHILE, para validar una palabra incluya una A");
    while (true) {
      System.out.println("ingrese una palabra: ");
      String palabra = sc.next();

      if (palabra.contains("a")) {
        System.out.println("La palabra contiene la letra A: " + palabra);
        break;
      } else {
        System.out.println("La palabra no contiene la letra A: " + palabra);
      }

    }

    sc.close();

  }
}
