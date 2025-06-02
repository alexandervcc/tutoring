package acc.coding;

public class Switch {
  static void ejecutarSwitch() {
    /*
     * SWITCH
     * Sentencia de condicion, similar a un if, pero con una sintaxis diferente.
     * Se define una lista de casos y codigo a ejecutar para cada caso.
     * Por cada caso se debe de anadir un break para evitar que se ejecute el
     * siguiente caso.
     * Tipos de datos que soporta el switch: byte, short, int, char, strings, enum
     * Puede soportar lambdas (tipo de funciones) desde Java 14.
     */
    int numero = 1;
    // enteros
    switch (numero) {
      case 1:
        System.out.println("El numero es 1");
        break;
      case 2:
        System.out.println("El numero es 2");
        break;
      case 3:
        System.out.println("El numero es 3");
        break;
      case 4:
        System.out.println("El numero es 4");
        break;
      default:
        System.out.println("El numero no es ninguno de los anteriores");
        break;
    }

    System.out.println("\n\n\n");
    // strings
    switch ("xd") {
      case "xd":
          System.out.println("xd");
        break;
    
      default:
          System.out.println("no xd");
        break;
    }

    if (numero == 1) {
      System.out.println("El numero es 1");
    } else if (numero == 2) {
      System.out.println("El numero es 2");
    } else if (numero == 3) {
      System.out.println("El numero es 3");
    } else {
      System.out.println("El numero no es ninguno de los anteriores");
    }

  }
}
