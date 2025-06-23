package acc.coding;

public class Recursividad {
    /*
     * Concepto: la llamada de una funcion a si misma
     * Cuando se tiene problema grande, y se quiere partir/resolver en trozos mas
     * pequenos
     * Descomponer tareas en tareas mas pequenas
     * 
     * Para que una funcion sea recursiva:
     * - La funcion se llame a si misma
     * - Haber un case base que detiene la recursividad
     */

    public static void ejecutar() {
        System.out.println("Ejecucion 1");
        int n = 3;
        int fac1 = Recursividad.factorial(n);
        System.out.println("El factorial de " + n + " es = " + fac1);
    }

    public static int factorial(int n) {
        // Caso base
        if (n == 0) {
            return 1;
        }

        // Llamada recursiva
        int rec = Recursividad.factorial(n - 1);

        int mul = n * rec;

        return mul;
    }
}
