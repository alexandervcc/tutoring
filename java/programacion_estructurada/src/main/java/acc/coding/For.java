package acc.coding;

public class For {
  static void forEjecucion() {
    System.out.println("Ejemplo de FOR");

    int[] numeros = { 1, 2, 3, 4, 5 };
    numeros[0] = 10;
    
    for (int i = 0; i < numeros.length; i++) {
      numeros[0] = 100;
      System.out.println(" i => " + numeros[i]);
    }

    int num1 = numeros[0];
    numeros[0] = 9999;

    System.out.println("num1 => " + num1);	
    num1 = 1000;
    System.out.println("num1 => " + num1);

    for (int i = 0; i < numeros.length; i++) {
      System.out.println(" ["+i+"] => " + numeros[i]);
    }
  }
}
