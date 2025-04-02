package acc.coding;

import java.util.Arrays;

public class Arreglos {
  static void ejecutarArreglos() {
    // --------------------------------------------------------------------------------------------
    // ARREGLOS
    System.out.println("\n\n\n\n---------------------------------------------------------------");
    System.out.println("ARRAYS");
    // Almacenar multiples valores juntos
    // Definir la cantidad de elementos juntos
    // Para acceder los arreglos se utiliza indices
    // Los arreglos almacenan valores del mismo tipo de dato

    // Creamos un arreglo con valores iniciales, el tamano/capacidad depende de
    // cuantos valores iniciales tiene
    int[] numeros1 = { 1, 5, 6, 9, 100 }; // 5
    double[] numerosDouble = { 1, 5, 6, 9, 100, 25.5 }; // 6
    boolean[] booleanos = { true, false, true }; // 3
    String[] arregloStrings = { "hola", "como", "estas   !!!!" }; // 3

    // Arreglo sin valores iniciales, pero con capacidad inicial
    int[] numeros2 = new int[10];

    System.out.println("numeros1[0]: " + numeros1[0]);
    System.out.println("numeros1[4]: " + numeros1[4]);
    System.out.println("numeros2[0]: " + numeros2[0]);
    System.out.println("numeros2[7]: " + numeros2[7]);

    // Tratar de acceder un indice invalido creara un error
    // System.out.println("numeros1[10]: "+numeros1[10]);

    // editar elementos del arreglo
    numeros1[4] = 999999;
    System.out.println("numeros1[4]: " + numeros1[4]);

    // Podemos obtener el tamano de un arreglo
    int tamanoArregloNumeros1 = numeros1.length;
    System.out.println("Tamano de numeros1 = " + tamanoArregloNumeros1);

    // rellenar un arreglo
    System.out.println("Valores inciales del arreglo numeros 1");
    System.out.println("numeros1[0] => " + numeros1[0]);
    System.out.println("numeros1[1] => " + numeros1[1]);
    System.out.println("numeros1[2] => " + numeros1[2]);
    System.out.println("numeros1[3] => " + numeros1[3]);
    System.out.println("numeros1[4] => " + numeros1[4]);

    System.out.println("Rellenando arreglo numeros 1");
    Arrays.fill(numeros1, 99);

    System.out.println("numeros1[0] => " + numeros1[0]);
    System.out.println("numeros1[1] => " + numeros1[1]);
    System.out.println("numeros1[2] => " + numeros1[2]);
    System.out.println("numeros1[3] => " + numeros1[3]);
    System.out.println("numeros1[4] => " + numeros1[4]);

    // Copiar un arreglo
    System.out.println("\n\n\n Copia de arreglos");
    String[] copiaArregloStrings = Arrays.copyOf(arregloStrings, arregloStrings.length);
    System.out.println("copiaArregloStrings[0]: " + copiaArregloStrings[0]);
    System.out.println("arregloStrings[0]: " + arregloStrings[0]);

    System.out.println("Sobreescribiendo copia");
    copiaArregloStrings[0] = "adios";

    System.out.println("copiaArregloStrings[0]: " + copiaArregloStrings[0]);
    System.out.println("arregloStrings[0]: " + arregloStrings[0]);

    System.out.println("\n>>> Recorrer arreglo:");
    // Recorrido de un arreglo con FOR
    for (int i = 0; i < numerosDouble.length; i++) {
      System.out.println("numerosDouble[" + i + "]: " + numerosDouble[i]);
    }

    System.out.println("\nMultiplicando elementos del arreglo por 2 \n");
    for (int i = 0; i < numerosDouble.length; i++) {
      numerosDouble[i] = numerosDouble[i] * 2;
    }

    for (int i = 0; i < numerosDouble.length; i++) {
      System.out.println("numerosDouble[" + i + "]: " + numerosDouble[i]);
    }

    System.out.println("\nRecorrido de arreglo con FOR for(double numero : numerosDouble) ");
    // FOR especial sin indices
    for (double numero : numerosDouble) {
      System.out.println("numerosDouble elemento: " + numero);
    }

    System.out.println("\n\n\nOrdenamiento:");
    // Ordenamiento: defecto ascendente
    Arrays.sort(numerosDouble);
    System.out.println("Ordenamiento ascendente");
    for (int i = 0; i < numerosDouble.length; i++) {
      System.out.println("numerosDouble[" + i + "]: " + numerosDouble[i]);
    }

    // Ordenamiento descendente: no funciona con primitivas
    // Arrays.sort(numerosDouble, Collections.reverseOrder());
    // System.out.println("Ordenamiento descendente");
    // for(int i = 0; i < numerosDouble.length; i++){
    // System.out.println("numerosDouble["+i+"]: "+numerosDouble[i]);
    // }

    System.out.println("\n\n\n\nOrdenar strings");

    for (int i = 0; i < arregloStrings.length; i++) {
      System.out.println("arregloStrings[" + i + "]: " + arregloStrings[i]);
    }
    Arrays.sort(arregloStrings);
    for (int i = 0; i < arregloStrings.length; i++) {
      System.out.println("arregloStrings[" + i + "]: " + arregloStrings[i]);
    }
  }
}
