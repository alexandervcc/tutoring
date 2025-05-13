package acc.coding;

public class For {
  static void forEjecucion() {

    // -----------------------------------------------------------------------------------------------

    // BUCLES
    // - Repeticion de una accion
    // - Tipos de bucles: FOR, WHILE, DO-WHILE
    // - Todo bucle debe de tener una condicion de finalizacion

    // FOR
    // - Bucle que repite la accion senalando un punto de inicio y punto de fin
    // - Tamano del paso: como queremos que avance desde el punto de inicio hacia el
    // punto de fin
    // for ( <inicio> ; <condicion de fin> ; <tamano del paso> ) {
    // ... codigo que se repite
    // }

    // i ++; => i = i + 1;
    System.out.println("Bucle 1");
    for (int i = 0; i <= 5; i++) {
      System.out.println("Numero actual: " + i);
    }

    System.out.println("Bucle 2");
    for (int i = 10; i <= 30; i += 2) {
      System.out.println("Numero actual: " + i);
    }

    System.out.println("Bucle 3");
    for (int i = 100; i > -10; i -= 5) {
      System.out.println("Numero actual: " + i);
    }

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
      System.out.println(" [" + i + "] => " + numeros[i]);
    }

    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        for (int j = 0; j < numeros.length; j++) {

        }
      }
    }

    // Alcance de variables
    int num2 = 10;
    // Desde que lugar se puede acceder a una variable declarada
    if (10 % 2 == 0) {
      // Esta variable, tiene el alcance limitado al bloque donde fue declarada
      int numeroIf = 100;
      numeroIf += 10;
      System.out.println("numeroIf=" + numeroIf);

      numeroIf += num2;
    }

    for (int i = 0; i < numeros.length; i++) {
      int j = i * 10;
      j *= num2;
      System.out.println("j = " + j);

      if (j % 2 == 0) {
        int num3 = j - 99;
        num3 += 1;
      }

      // Variable no es alcanzable desde el bloque externo
      // num3+=1;
    }

    // Variable no es alcanzable desde el bloque externo  
    // j = 10;
    // System.out.println(numeroIf);
  }
}
