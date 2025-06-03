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

  // <modificador de acceso> <tipo de retorno> <nombre de la funcion> ( < parametros>  ) {
  //     ...
  // }


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

    System.out.println("\n\nEjecucion de una funcion que devuelve un valor:");
    int v1 = Funciones.devolverUnInt();
    System.out.println("devolverUnInt:v1: " + v1);
    double v2 = Funciones.devolverUnDouble();
    System.out.println("v2=" + v2);
    String v3 = Funciones.devolverUnString();
    System.out.println("v3=" + v3);
    double[] v4 = Funciones.devolverUnArregloDouble();
    for (int i = 0; i < v4.length; i++) {
      System.out.println("i[" + i + "] => " + v4[i]);
    }

    System.out.println("\n\n\n\nEjemplos");
    double v11 = Funciones.multiplicacion(11, 4);
    System.out.println("multiplicacion:v11=" + v11);

    System.out.println("\n\nSumatorias");
    int[] arr1 = { 1, 2, 3, 4 };
    int[] arr2 = { 9, 8, 7, 6, 5, 4 };

    int sum1 = Funciones.sumatoria(arr1);
    int sum2 = Funciones.sumatoria(arr2);

    System.out.println("sum1 = " + sum1);
    System.out.println("sum2 = " + sum2);

    String txt = Funciones.palabraUsuario();
    System.out.println("palabra 1 = " + txt);
    String txt2 = Funciones.palabraUsuario();
    System.out.println("palabra 2 = " + txt2);
  }

  /**
   * modificador de acceso, tipo de dato de retorno, nombre de funcion, parametros
   */
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
    System.out.println("Texto  = " + texto);
  }

  /**
   * Funcion que devuelve un valor
   */
  public static int devolverUnInt() {
    // Para hacer retornos de valores hay que usar la palabra `return`
    System.out.println("la funcion `devolverUnInt` fue ejecutada.");

    // Como la funcion devuelve un valor, podemos capturar ese valor en una variable
    return 100;
  }

  public static double devolverUnDouble() {
    System.out.println("la funcion `devolverUnDouble` fue ejecutada.");
    return 99.999999;
  }

  public static String devolverUnString() {
    System.out.println("la funcion `devolverUnString` fue ejecutada.");
    return "mijoron";
  }

  public static double[] devolverUnArregloDouble() {
    System.out.println("la funcion `devolverUnArregloDouble` fue ejecutada.");

    double[] arr = { 5.5, 6.9, 7.7 };

    return arr;
  }

  public static double multiplicacion(double x, double y) {
    return x * y;
  }

  public static int sumatoria(int[] arr) {
    int sumatoria = 0;

    for (int i = 0; i < arr.length; i++) {
      sumatoria += arr[i];
    }

    return sumatoria;
  }

  public static String palabraUsuario() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese una palabra: ");
    String xd = sc.next();
    sc.close();
    return xd;
  }

  public static void f1ConParametros(int num) {
    System.out.println("f1ConParametros::num = " + num);
  }

  public static void f2ConParametros(int num, String str1, double[] arr1) {
    System.out.println("\n\nf2ConParametros::num    = " + num);
    System.out.println("f2ConParametros::str1   = " + str1);
    System.out.print("f2ConParametros::arr1   = ");
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr1[i] + ", ");
    }
  }

  public static void imprimirArreglo(int[] arr) {
    System.out.println("Imprimiendo arreglo: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.println("arr[" + i + "] => " + arr[i]);
    }
  }

  public static String str1() {
    return "1 xd flashito";
  }

  public static String bienvenido(String nombre, int edad) {
    String msg = "Saludos " + nombre + " con edad = " + edad + ". Bienvenido al sistema!!";
    return msg;
  }

  public static double operacion(double d1, double d2) {
    double d = (d1 + d2) * 10;
    return d;
  }

  public static void ejecutarFunciones2() {
    Funciones.f1ConParametros(10);
    Funciones.f1ConParametros(99);
    int num = -25;
    Funciones.f1ConParametros(num);
    Funciones.f1ConParametros(num);
    int num2 = 15;
    Funciones.f1ConParametros(num2);
    num = 7777;
    Funciones.f1ConParametros(num);

    double[] arr = { 1.2, 5.9, 7.8 };
    Funciones.f2ConParametros(num, "cheems", arr);
    double[] arr2 = { 101.9, -55.7, 45.2, 9.9 };
    Funciones.f2ConParametros(-1, "manaseses", arr2);

    System.out.println("\n\n\n");
    String res1 = Funciones.str1();
    String res2 = Funciones.str1();

    System.out.println("res1 = " + res1);
    System.out.println("res2 = " + res2);

    System.out.println("\n\n\n");
    double d1 = Funciones.operacion(10.2, 3.7);
    System.out.println("d1 = " + d1);
    double d2 = Funciones.operacion(-5.2, 31.22);
    System.out.println("d2 = " + d2);

    Funciones.operacion(-5.2, 31.22);

    System.out.println("\n\n");
    String str1 = Funciones.bienvenido("Alex", 26);
    System.out.println("str1 = " + str1);
    String str2 = Funciones.bienvenido("Mana", 8);
    System.out.println("str2 = " + str2);


    System.out.println("\n\n\n");
    int[] arr11 = { 5 ,5,9,7};
    int[] arr12 = { -5 ,0};
    Funciones.imprimirArreglo(arr11);
    Funciones.imprimirArreglo(arr12);
  }

}
