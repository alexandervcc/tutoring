package acc.coding;

public class Variables {
  public static void ejecutarVariables() {

    // VARIABLES
    // - Espacio de memoria donde almacenamos un dato
    // - Se reserva un espacio en (bytes) segun el tipo de dato de la variable
    // - No se puede crear dos variables con el mismo nombre
    // SINTAXIS PARA CREAR VARIABLE
    // <tipo de dato> <nombre de variable>;
    // <tipo de dato> <nombre de variable> = <valor>;

    // Tipos de datos: int, float, double, char, String, boolean, entre otros.
    // https://repositorio.konradlorenz.edu.co/micrositios/001-985/tipos_de_dato_en_java.html
    // int: almacenar numeros enteros
    // float: almacenar numeros con coma flotante
    // double: almacenar numeros reales (float pero mas capacidad)
    // String: almacenar de texto
    // boolean: verdadero y falso
    // Variables utilizan `memoria estatica`: se hace una reservacion de memoria
    // durante todo el tiempo de vida del programa

    // <tipo de dato> <nombre de variable>: no tiene inicializado un valor
    double d1;
    // System.out.println("d1 = "+d1);

    // <tipo de dato> <nombre de variable> = <valor>;
    double b1 = -129;
    System.out.println("b1 = " + b1);

    int i1 = 50;

    float f1 = 5.6f;
    double d2 = 15651651.255;
    boolean bol1 = false;
    char c1 = 'a'; // solo puede contener una y sola una letra/caracter

    String str1 = "hola como estas?";

    // String str1 = "adios"; // no se puede crear dos variables con el mismo nombre
    // int str1 ; // no se puede crear dos variables con el mismo nombre

    System.out.println("str1 = " + str1);
    // Actualizacion de valor de una variable
    str1 = "adios";
    System.out.println("str1 = " + str1);

    System.out.println("int1 = " + i1);
    i1 = 100;
    System.out.println("int1 = " + i1);

    // CASTEO
    // Convertir una variable en otro tipo
    // <nuevo tipo de dato> <nombre de variable> = (<nuevo tipo de dato>) <vieja
    // variable>;
    // https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj930yeQtaqsKSGkibqUjm3OI88_I3fn5nH9Fu-B0VqCCeg6D_sPUpZdsOKvDe-wNkr7rrIJYSGD6iss5BfF4XAOMzNALVhv5RGe6gpPq_VFXdS9erQoIfNXD15LUg5yyKzYeKnODbLOHMs/s1600/conversionTipo.png

    System.out.println("\n\n\nCASTEO:");
    int int2 = 10;
    System.out.println("int2 = " + int2);

    double double2 = (double) int2;
    System.out.println("double2 = " + double2);

    char la = 'a';
    System.out.println(" la = " + la);
    byte bca = (byte) la;
    System.out.println("bca = " + bca);
    char la2 = (char) bca;
    System.out.println("la2 = " + la2);

  }
}
