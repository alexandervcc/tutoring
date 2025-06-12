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

  public static void funcion3(String par1) {
    System.out.println("Ejemplofunciones::funcion3::par1 = " + par1);
  }

  public static void imprimirArreglo(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println("arr[" + i + "] = " + arr[i]);
    }
  }

  public static void funcion4(String par1, int numeroPrametro) {
    System.out.println("Ejemplofunciones::funcion4::par1 = " + par1);
    System.out.println("Ejemplofunciones::funcion4::numeroParametro = " + numeroPrametro);
  }

}
