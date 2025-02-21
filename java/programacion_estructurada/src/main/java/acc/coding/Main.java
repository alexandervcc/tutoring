package acc.coding;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaracion de variables
        // <tipo de dato> <nombre de variable>;
        int numero1;

        // Declaracion de variables con un valor
        // <tipo de dato> <nombre de variable> = <valor>;
        int numero2 = 10;

        Scanner xd = new Scanner(System.in);

        /*
         * //---------------------------------------------------------------------------
         * ----------------
         * // Ejemplo de Scanner
         * 
         * System.out.println("Ingrese un numero: ");
         * int numeroIngresadoPorEscaner = xd.nextInt();
         * 
         * System.out.println("Numero: " + numeroIngresadoPorEscaner);
         * 
         * // El scanner tienen diferentes metodos para cada tipo de dato
         * float float1 = xd.nextFloat();
         * double d1 = xd.nextDouble();
         * boolean b = xd.nextBoolean();
         * String s = xd.next();
         * 
         * // Esto no se puede por la incompatabilidad de tipos de datos
         * // int n = xd.nextFloat();
         * 
         */

        // --------------------------------------------------------------------------------
        // Condicionales

        // Permite comparar valores, y tomar decisiones
        // Comparaciones
        // == , si es igual
        // >, si es mayor (>= mayor o igual)
        // <, si es menor (<= menor o igual)
        // !=, si no son iguales,

        // Al hacer una comparacion el resultado es un boolean, verdadero o falso

        boolean b1 = 70 > 65;
        System.out.println("70 > 65: " + b1);
        boolean b2 = 70 == 65;
        System.out.println("70 == 65: " + b2);
        boolean b3 = 70 < 65;
        System.out.println("70 < 65: " + b3);
        boolean b4 = 70 == 65;
        System.out.println("70 == 65: " + b4);

        int n1 = 10;
        int n2 = 20;
        boolean b5 = n1 <= n2;
        System.out.println(n1 + " <= " + n2 + ": " + b5);

        // IF
        // if ( <condicion> ) {
        // .... cuerpo del if
        // }

        if (10 > 5) {
            System.out.println("10 es mayor a 5");
        }

        if (b5) {
            System.out.println("n1 es menor o igaul que n2");
        }

        System.out.println("Ingrese numero 1: ");
        int in1 = xd.nextInt();
        System.out.println("Ingrese numero 2: ");
        int in2 = xd.nextInt();

        if (in1 < in2) {
            System.out.println(">> "+in1 + " es menor que " + in2);
        }else if(in1 == in2) {
            System.out.println(">> "+in1 + " es igual a " + in2);    
        }else {
            System.out.println(">> "+in1 + " es mayor que "+in2);
        }
    }
}