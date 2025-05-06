package acc.coding;

import java.util.Scanner;

public class ScannerEjercicio {
  public static void ejecutarScanner(){
    // SCANNER:
    // Un medio para ingresar datos al programa en tiempo de ejecucion.
    
    // Estructura de una variable:
    //  new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);
    
    // Dentro del scanner hay una series de metodos para leer diferentes tipos de datos
    // int, double, float, String
    // Patron:  next<tipo de dato>();

    // Usando el escaner para ingresar un valor entero
    System.out.println("Ingrese un valor entero: ");
    int int1 = scanner.nextInt();
    System.out.println("Scanner:int1 = "+int1);

    System.out.println("Ingrese un valor entero 2 : ");
    int int2 = scanner.nextInt();
    System.out.println("Scanner:int2 = "+int2);

    System.out.println("Ingrese un valor double: ");
    double d1 = scanner.nextDouble();
    System.out.println("Scanner:d1 = "+d1);

    System.out.println("Ingrese un valor de texto: ");
    String str1 = scanner.next(); // excepcion del patron
    System.out.println("Scanner:str1 = "+str1);
    


  }
}
