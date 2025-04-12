package acc.coding;

import java.util.Scanner;

public class Funciones {
  /*
   * FUNCIONES
   * - Trozo de codigo reutilizable
   * - Se puede ejecutar segun la necesidad el programa
   * - Puede tener parametros y valor de retorno
   * - Parametros: valores de ingreso sobre los cuales la funcion debe operar.
   * Opcionales
   * puede tener 0 o mas parametros
   * - Valor de retorno: Valor resultante del trabajo realizado, el valor es
   * opcional
   * Al crear una funcion le debes asignar un nombre, el nombre debe ser adecuado
   * 
   * Al declarar funciones se lo debe hacer a nivel de clase
   * La funcion tambien tendra un modificador de acceso: public, protected,
   * private
   * 
   * Por el momento no puede haber dos funciones dentro de una clase con el mismo
   * nombre.
   */

  public static void ejecutarFunciones() {
    System.out.println(">>>>>>> Ejecutando la funcion `ejecutarFunciones`");
    Funciones.imprimirTexto();
    Funciones.imprimirTexto();

    System.out.println("\n\nEjecucion de un FOR de 7 repeticiones");
    for (int i = 0; i < 7; i++) {
      System.out.println("i = " + i);
      if (i % 2 == 0) {
        Funciones.imprimirTexto();
      }
    }

    System.out.println("\n\nEjecucion de una funcion que recibe un parametro:");
    Funciones.imprimirNumero(5);
    Funciones.imprimirNumero(10);

    System.out.println("\n\nEjecucion de una funcion que recibe dos ints:");
    Funciones.imprimirDosNumero(-1, 10);

    System.out.println("\n\nEjecucion de una funcion que recibe dos variables (double, String):");
    Funciones.imprimirDosVariables(-55.123456, "Mijotron");

  }

  // modificador de acceso, tipo de dato de retorno, nombre de funcion, parametros
  public static void imprimirTexto() {
    // Esta funcion no tiene parametros
    // Esta funcion tiene tipo de dato de retorno `void`
    // `void`= Significa que la funcion no devuelve nada
    // Por el momento nuestra funciones tambien seran estaticas `static`
    System.out.println("Mi nombre de funcion es `imprimirTexto`");
  }

  /**
   * Esta es una funcion que no devuelve nada (`void`), pero recibe un parametro
   * (i de tipo entero)
   */
  public static void imprimirNumero(int i) {
    System.out.println("El numero recibido es: " + i);
  }

  public static void imprimirDosNumero(int i, int j) {
    System.out.println("Los numeros recibidos son: " + i + ", " + j);
  }

  public static void imprimirDosVariables(double i, String texto) {
    System.out.println("Numero = " + i);
    System.out.println("Texto = " + texto);
  }

}
