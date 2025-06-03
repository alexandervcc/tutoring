package acc.coding;

public class EjemploFunciones {

  public static void funcion1() {
    System.out.println("EjemploFunciones::funcion1");
  }

  public static int funcion2() {
    System.out.println("EjemploFunciones::funcion2");
    int n = 10 * 9;
    return n;
  }

  public static String funcionRetornarString() {
    System.out.println("EjemploFunciones::funcionRetornarString");

    int num = EjemploFunciones.funcion2();

    return "hola como estas = " + num;
  }

}
