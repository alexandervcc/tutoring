package acc.coding;

import java.util.Scanner;

public class ScannerEjemplo {
  static void ejecutarScanner() {
    Scanner xd = new Scanner(System.in);

    // ---------------------------------------------------------------------------
    // Ejemplo de Scanner

    System.out.println("Ingrese un numero: ");
    int numeroIngresadoPorEscaner = xd.nextInt();

    System.out.println("Numero: " + numeroIngresadoPorEscaner);

    // El scanner tienen diferentes metodos para cada tipo de dato
    float float1 = xd.nextFloat();
    double d1 = xd.nextDouble();
    boolean b = xd.nextBoolean();
    String s = xd.next();

    // Esto no se puede por la incompatabilidad de tipos de datos
    // int n = xd.nextFloat();

    xd.close();
  }
}
