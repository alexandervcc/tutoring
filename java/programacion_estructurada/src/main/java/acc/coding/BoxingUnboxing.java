package acc.coding;

public class BoxingUnboxing {
  /*
   * Ligado a las primitivas y los objeos
   * Crear clases/objetos para los datos primitivos
   * Utilizar boxing/unboxing (mezclar primitivas + objetos) para las operaciones genera un consumo excesivo de recursos
   */
  public static void ejecutar() {
    System.out.println("-------BOXING & UNBOXING---------");
    int intPrimitiva = 1;
    Integer intClase = 1;

    System.out.println(">>>>> primitiva = " + intPrimitiva);
    System.out.println(">>>>>>>> clase = " + intClase);

    byte bytePrimitiva = intClase.byteValue();
    System.out.println(">>>>>>>>>>>>> bytePrimitiva = "+bytePrimitiva);

    int intPrim = intClase; // unboxing
    Integer intClase2 = intPrimitiva; // boxing

    int int1 = intPrim + intClase2;
    Integer intC2 = intPrim + intClase2;

    // Conversiones
    String strInt = "10";
    int num1 = Integer.parseInt(strInt);
    num1 += 2;
    System.out.println(">>>>>>>>>>>>> num1 = "+num1);
/*     int asciiA = 66;
    char letraA = (char) asciiA;
    System.out.println(">>>>>>>>>>> letraA = "+letraA); */

    // Existir diferentes clases por cada primitiva
    Float.parseFloat(strInt);
    Double.parseDouble(strInt);
    // Character
    // Boolean

    // funcion para convertir valores primitivos (box/unbox) en strings
    String str1 = String.valueOf(25.2);
    String str2 = String.valueOf(intClase);
    String str3 = String.valueOf(1.2f);

    // Casteos: .valueOf()
    int int10 = 10;
    double d = Double.valueOf(num1);
    // int int11 = 1234;
    // byte b = Byte.valueOf(int11);

  }
}
