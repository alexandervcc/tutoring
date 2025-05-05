package acc.coding;

import java.util.Scanner;

public class Condicionales {
  static void ejecutarCondicionales() {
    Scanner xd = new Scanner(System.in);

    // --------------------------------------------------------------------------------
    // Condicionales

    // Permite comparar valores, y tomar decisiones
    // Comparaciones
    // == , si es igual
    // >, si es mayor (>= mayor o igual)
    // <, si es menor (<= menor o igual)
    // !=, si no son iguales,

    // Al hacer una comparacion el resultado es un boolean, verdadero o falso

    boolean b1 = 70 > 65;
    System.out.println("70 > 65: " + b1);
    boolean b2 = 70 == 65;
    System.out.println("70 == 65: " + b2);
    boolean b3 = 70 < 65;
    System.out.println("70 < 65: " + b3);
    boolean b4 = 70 != 65;
    System.out.println("70 != 65: " + b4);

    int n1 = 10;
    int n2 = 20;
    boolean b5 = n1 <= n2;
    System.out.println(n1 + " <= " + n2 + ": " + b5);

    // IF
    // Sentencia de condicion: evaluara una comparacion y en base al resultado
    // ejecutara una pieza de codigo
    // Si no se cumple lo que esta dentro del IF, podemos anadir una clausula else a ejecutar
    // SINTAXIS:
    // if ( <condicion> ) {
    // .... cuerpo del if
    // }

    System.out.println("\n\n\n\nIF:");
    if (10 > 5) {
      System.out.println("if: 10 es mayor a 5");
    }
    int int1 = 10;
    int int2 = 5;
    boolean bint1_int2 = int1 > int2;

    if(bint1_int2){
      System.out.println("if(variable): 10 es mayor a 5");
    }

    if (10 > 5) {
      System.out.println("if: 10 es mayor a 5");
    }else{
      System.out.println("else: 10 NO es mayor a 5");
    }

    if (b5) {
      System.out.println("n1 es menor o igaul que n2");
    }

    // Ejercio de aplicacion de IF:
    
    System.out.println("Ingrese numero 1: ");
    int in1 = xd.nextInt();
    System.out.println("Ingrese numero 2: ");
    int in2 = xd.nextInt();

    if (in1 < in2) {
      System.out.println(">> " + in1 + " es menor que " + in2);
    } else if (in1 == in2) {
      System.out.println(">> " + in1 + " es igual a " + in2);
    } else {
      System.out.println(">> " + in1 + " es mayor que " + in2);
    }

    int num1 = 10;
    float float1 = 200;
    boolean bb1 = num1 == float1;

    String str1 = "str1";
    String str2 = "str1";
    // boolean bb2 = num1 == str1; incompatible
    char c1 = 'a';
    // boolean charVsString = str1 == c1; incompatible

    boolean strVsstr1 = str1 == str2;
    System.out.println("str1 == str2: " + strVsstr1);

    if (str1 == "str1") {
      System.out.println("Igual a str1");
    } else {
      System.out.println("NO Igual a str1");
    }

    // OPERADORES LOGICOS
    // && AND
    // || OR
    // ! NEGACION

    boolean comp1 = 10 > 20 && 10 > 5;
    System.out.println("10 > 20 && 10 > 5: " + comp1);

    boolean comp2 = 10 > 20 || 10 > 5;
    System.out.println("10 > 20 || 10 > 5: " + comp2);

    boolean comp3 = 10 < 20 && 10 > 5;
    System.out.println("10 < 20 && 10 > 5: " + comp3);

    boolean comp4 = !(10 < 20 && 10 > 5);
    System.out.println("!(10 < 20 && 10 > 5): " + comp4);

    int edad = xd.nextInt();
    if (edad < 18 || edad > 65) {
      System.out.println("No tiene que votar");
    } else {
      System.out.println("Obligada a votar");
    }

    xd.close();
  }
}
