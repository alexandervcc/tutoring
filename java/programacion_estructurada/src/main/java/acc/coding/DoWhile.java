package acc.coding;

import java.util.Scanner;

public class DoWhile {
  public static void ejecutarDoWhile() {
    /*
     * Do-While
     * Similar al while, pero se asegura de ejecutar al menos una vez el codigo
     * a ser repetido.
     * Sea o no que la condicion del do-while se cumpla, siempre la primera
     * ejecuacion se realizara.
     */

    int i = 0;
    do {
      // ... codigo a repetir
      i++;
      System.out.println("i => " + i);
      if (i == 5) {
        break;
      }
    } while (true);

    int numero = 0;
    System.out.println("Do-While");
    do {
      System.out.println("Numero actual " + numero);
    } while (numero != 0);

    System.out.println("\nWhile");
    while (numero != 0) {
      System.out.println("Numero actual " + numero);
    } 
  }
}
