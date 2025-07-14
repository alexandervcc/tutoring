package acc.coding;

public class CopiasYReferencias {
  public static void ejecutar() {
    System.out.println(">>>>>>>>>>>>>>> Copias y referencias");
    int num1 = 10;
    int num2 = 20;

    // Primitivas:
    // hacen copias de valor
    // Crea un espacio de memoria, y dentro almaceno una copia de la variable
    // original
    int num3 = num1;
    num3 += 15;
    System.out.println("num3 = " + num3);
    System.out.println("num1 = " + num1);

    // Objetos:
    // los objetos por defecto hacen copias por referencia
    // Tener dos variables apuntando al mismo espacio de memoria
    // objecto = arreglos

    System.out.println("------------REFERENCIAS");
    int[] arr1 = { 1, 2, 3 };
    System.out.println("dir(arr1) = " + arr1);
    int[] arr2 = { 1, 2, 3 };
    System.out.println("dir(arr2) = " + arr2);
    // referencia:
    int[] arr3 = arr1; // apuntando a la misma direccion de memoria
    System.out.println("dir(arr3) = " + arr3);
    System.out.println("Impresion: arr1");
    for (int i = 0; i < arr1.length; i++) {
      System.out.println("arr1[" + i + "] = " + arr1[i]);
    }
    System.out.println("Impresion: arr3");
    for (int i = 0; i < arr3.length; i++) {
      System.out.println("arr3[" + i + "] = " + arr3[i]);
    }

    arr1[0] = 100;
    System.out.println("arr1[0] = " + arr1[0]);
    System.out.println("arr3[0] = " + arr3[0]);
    arr3[0] = 555;
    System.out.println("arr1[0] = " + arr1[0]);
    System.out.println("arr3[0] = " + arr3[0]);

    arr3 = arr2; // un nuevo cambio de puntero (direccion de memoria)
    arr1[0] = 666;
    System.out.println("arr1[0] = " + arr1[0]);
    System.out.println("arr3[0] = " + arr3[0]);

    // Hacer una copia real de un objeto, mas no una referencia
    // .clone(): metodo dentro de la clase Object para hacer copias
    int[] arrCopia = arr1.clone();
    System.out.println(">>>>>>>>>>>>>>>>>>>> .clone()");
    for (int i = 0; i < arr1.length; i++) {
      System.out.println("arr1[" + i + "] = " + arr1[i]);
    }
    for (int i = 0; i < arrCopia.length; i++) {
      System.out.println("arrCopia[" + i + "] = " + arrCopia[i]);
    }
    arr1[0] = 333;
    System.out.println("arr1[0] = " + arr1[0]);
    System.out.println("arrCopia[0] = " + arrCopia[0]);

    // Hacer que una variable con referencia deje de apuntar a dicha referencia
    int[] arr4 = arr1;

    System.out.println("arr1 = " + arr1);
    System.out.println("arr4 = " + arr4);

    arr4 = null;
    System.out.println("arr1 = " + arr1);
    System.out.println("arr4 = " + arr4);

    System.out.println("arr1[0] = " + arr1[0]);

    // System.out.println("arr4[0] = " + arr4[0]);

    System.out.println(">>>>>>>>>>>>>>>>>>> String");
    // String: comportamiento especial, a pesar de ser objeto
    // Es inmutable
    String str1 = "texto1";
    str1 = "texto2";

    String str2 = str1; // No se genera un referencia, sino una copia
    str2 = "hola";
    System.out.println("str1 = " + str1);
    System.out.println("str2 = " + str2);

    System.out.println(">>>>>>>>>>>>>> Comparacion de Objetos");
    // Comparar strings = .equals
    // .equals: para hacer comparaciones de los valores sobre objetos
    // Para comparar objetos se debe manualmente comparar sus valores, o utilizar un
    // metodo .equals() cuando sea posible
    double[] dobArr1 = { 1.0, 2.0 };
    double[] dobArr2 = { 1.0, 2.0 };

    // Al comparar objetos, se comparan direcciones de memoria
    boolean comp1 = dobArr1 == dobArr2;
    System.out.println("dir(dobArr1) = " + dobArr1);
    System.out.println("dir(dobArr2) = " + dobArr2);
    System.out.println("dobArr1 == dobArr2 = " + comp1);

    double[] dobArr3 = dobArr1;
    System.out.println("dir(dobArr1) = " + dobArr1);
    System.out.println("dir(dobArr3) = " + dobArr3);
    boolean comp2 = dobArr1 == dobArr3;
    System.out.println("dobArr1 == dobArr3 = " + comp2);

    // En funciones
    // En primitivas pasar valores a funciones, pasa una copia
    int num101 = 101;
    System.out.println("prev: num101 = " + num101);
    CopiasYReferencias.modificarInt(num101);
    System.out.println("post: num101 = " + num101);

    int[] arr101 = { 1, 2 };
    System.out.println("prev: arr101[0] = " + arr101[0]);
    CopiasYReferencias.modificarObjeto(arr101);
    System.out.println("prev: arr101[0] = " + arr101[0]);

    System.out.println("prev: arr101[0] = " + arr101[0]);
    CopiasYReferencias.reasignacionObjeto(arr101);
    System.out.println("prev: arr101[0] = " + arr101[0]);

  }

  public static void modificarInt(int num) {
    num += 10;
  }

  public static void modificarObjeto(int[] arr) {
    arr[0] += 10;
  }

  public static void reasignacionObjeto(int[] arr) {
    // No se modifica la referencia original, sino que se trabaja sobre un nuevo valor
    arr = new int[2]; 
    arr[0] = 99;
    arr[1] = 98;
  }

}
