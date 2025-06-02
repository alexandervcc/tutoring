package acc.coding;

public class Strings {
  static void ejecutarStrings() {

    // -----------------------------------------------------------------------------------------------
    // STRINGS
    // El string no es una primitiva, es un Objeto
    // Cadena de texto, incluira cualquier caracter (unmeros, letras, simbolos
    // especiales)
    // Tipo de dato: `String`, la primera letra es mayuscula
    // En Java hay dos tipos de datos: primitivas y objetos
    // primitivas: tipos de datos que solo almacenan valores, el tipo empieza en minuscula
    // ejemplos de primitas: int, double, float, char, boolean
    // objectos: almacena el valor + metodos, el tipo empieza con mayuscula
    // Por lo tanto, los Strings son objetos
    String n = "mana";
    int edad1 = 8;
    n.length();

    System.out.println(".lenth()");
    String oracion = "Oracion SupEr orIginAl";
    // length(): contar la cantidad de caracteres dentro del string
    System.out.println("longitud del string: " + oracion.length());
    int tamanoOracion = oracion.length();
    System.out.println("longitud del string(tamanoOracion): " + tamanoOracion);

    System.out.println("\n\n\n>>> .equals()");
    // equals(): comparar si dos strings son iguales
    String sstr1 = "mana";
    String sstr2 = "mijo";
    String sstr3 = "mana";
    boolean bol1 = sstr1.equals(sstr2);
    System.out.println(sstr1 + "==" + sstr2 + " -> " + bol1);
    System.out.println(sstr1 + "==" + sstr3 + " -> " + sstr1.equals(sstr3));

    // convertir a mayuscula o minuscula
    // Genera un nuevo string, no modifica el original
    System.out.println("\n\n\n>>> .toUpperCase() vs .toLowerCase()");
    System.out.println("Oracion original: " + oracion);
    System.out.println("Oracion mayuscula: " + oracion.toUpperCase());
    String oracionMinuscula = oracion.toLowerCase();
    System.out.println("Oracion minuscula: " + oracionMinuscula);

    // substring(): cortar un string
    System.out.println("\n\n\n>>> .substring():");
    String subStr1 = oracion.substring(5);
    String subStr2 = oracion.substring(6, 10);
    System.out.println("Substring O: " + oracion);
    System.out.println("Substring 1: " + subStr1);
    System.out.println("Substring 2: " + subStr2);

    // indexOf(): buscar dentro de un string, y devuele el indice si lo contiene
    System.out.println("\n\n\n>>>.indexOf():");
    String perros = "mana babas mijo cucoso cococha";
    int indiceBusqueda1 = perros.indexOf("babas");
    System.out.println(perros);
    System.out.println("'babas' encontrado en: " + indiceBusqueda1);
    // devuelve la primera ocurrencia
    System.out.println("'a' encontrado en: " + perros.indexOf("a"));
    // devuelve -1 si no encuentra
    System.out.println("'xd' encontrado en: " + perros.indexOf("xd"));

    // concatenar strings
    System.out.println("\n\n\n>>> concatenacion");
    String p1 = "mana";
    String p2 = "cocochas";
    String p4 = "babas";
    String p3 = p1 + "   " + p2 + " ---- " + p4;
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);

    // replace(): Reemplazar texto
    System.out.println("\n\n\n>>>.replace()");
    String animales = "perro gato ave pez perro";
    String mosco = "mosquito";
    String nuevosAnimales = animales.replace("perro", mosco);
    System.out.println(animales);
    System.out.println(nuevosAnimales);
    System.out.println(animales.replace("xd", "mosco"));

    // Dividir strings
    System.out.println("\n\n\n>>>.split()");
    String animales2 = "perro,gato,canario,pescado";
    String[] listaAnimales = animales2.split(",");
    System.out.println("String original: " + animales2);
    System.out.println("Lista dividida por ,");
    for (int i = 0; i < listaAnimales.length; i++) {
      System.out.println(listaAnimales[i]);
    }
    String[] listaAnimales2 = animales2.split("a");
    System.out.println("Lista dividida por a");
    for (int i = 0; i < listaAnimales2.length; i++) {
      System.out.println(listaAnimales2[i]);
    }

    System.out.println("\n\n\n--------------- .charAt()");
    // Obtener el char en una posicion: .charAt()
    String lugar = "Ecuador";
    char cc1 = lugar.charAt(2);
    System.out.println(lugar);
    System.out.println("char en posicion 2: " + cc1);

  }
}
