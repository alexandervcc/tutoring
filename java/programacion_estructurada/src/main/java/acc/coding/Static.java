package acc.coding;

public class Static {
  // Atributo estatica
  public static int n1 = 5;

  /*
   * STATIC: palabra reservada que indica que una funcion o atributo estan
   * instanciados en una clase
   * 
   */

  // Funcion estatica
  public static void ejecutarStatic() {
    System.out.println("Ejecutar codigo desde la clase Static");

    System.out.println("1. Static.n1 = " + Static.n1);

    Static.n1 = 100;

    System.out.println("2. Static.n1 = " + Static.n1);

    // Main.cambiarStaticN1();

    System.out.println("3. Static.n1 = " + Static.n1);
    
    Static.n1 = 5222;
  }
}
