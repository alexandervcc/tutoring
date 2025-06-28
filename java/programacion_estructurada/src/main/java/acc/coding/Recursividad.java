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

        System.out.println("Ejecucion 2");
        int[] arr = { 1, 5, 9, 48, 11, 3 };
        int suma = Recursividad.sumarArreglo(arr, 0);
        System.out.println("Suma recursiva = " + suma);

        System.out.println("Ejecucion 3");
        String text = "mana";
        String textoInvertido = Recursividad.invertir(text);
        System.out.println(textoInvertido);
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

    public static int sumarArreglo(int[] arr, int index) {

        // Caso base
        if (index == arr.length) {
            return 0;
        }

        // Llamada recursiva
        int sume = arr[index] + sumarArreglo(arr, index + 1);

        return sume;
    }

    public static String invertir(String texto) {
        // Caso base
        if (texto.isEmpty()) {
            return texto;
        }

        String subtext = texto.substring(1);

        // Llamada recursiva
        String textoRecursivo = Recursividad.invertir(subtext);

        String primerCaracter = String.valueOf(texto.charAt(0));

        return textoRecursivo + primerCaracter;
    }
}
