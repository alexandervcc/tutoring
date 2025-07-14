package acc.coding;

import java.io.BufferedReader;
import java.io.FileReader;

public class Excepciones {
    public static void ejecutar() {
        // Cuando un error en tiempo de ejecucion toma lugar (se lanza Excepcion)
        // Excepcion:
        // Clase especial, que representa un error/evento en tiempo de ejecucion que
        // interrumpe el flujo normal del programa
        // Hay diferentes tipos de excepciones, podemos crear excepciones a nuestro
        // comidad

        // Tipos de excepciones:
        // Hay dos tipos de expceciones:
        // - Checked expetiones: compilador exigen que sean manejadas
        // - Unchecked expections: clase especial, que el compilador no obliga a
        // manejarlas
        // - unchecked tambien se denomina RuntimeExceptions:
        // ArrayIndexOutOfBoundsException, AirthmeticException

        // Para manejar errores se tiene que usar una clausula especial llamada
        // try-catch
        // Excepciones.ejemploTryCatch();

        // Excepciones.excepcionNull();

        Excepciones.excepcionChecked();
    }

    /**
     * Ejemplo de try-catch general
     */
    public static void ejemploTryCatch() {
        // try-catch: se compone de 3 partes:
        // try: codiog que es propenso a error, y queremos manejar
        // catch: codigo que manejara el error de forma adecuada (evita que el programa
        // finalize de forma prematura)
        // finally(opcional): trozo de codigo que siempre se ejecuta despues de try o el
        // catch. Usualmente utilizado para hacer limpieza.

        // No tiene errores
        try {
            System.out.println("Try catch sin errores");
        } catch (Exception e) {
            System.out.println("Error capturado: " + e);
        }

        System.out.println("\n\n\n>>>>>> try-catch sin errores, pero con finally");
        try {
            System.out.println("Try catch sin errores + finally");
        } catch (Exception e) {
            System.out.println("Error capturado: " + e);
        } finally {
            System.out.println("Codigo finally");
        }

        System.out.println("\n\n\n>>>>>> try-catch con error");
        int a = -1;
        try {
            // Runtime Exception (unchecked)
            a = 10 / 0;
            System.out.println("10/0=" + a);
        } catch (Exception e) {
            System.out.println("Error capturado: " + e);
        } finally {
            System.out.println("Codigo finally");
        }
        System.out.println(a);

        System.out.println("\n\n\n\n>>>>>> Fin del metodo ejemploTryCatch");
    }

    public static void excepcionChecked() {
        // Este tipo de excepcion requiere de forma obligatoria ser manejada
        String ruta = "./dir/archivo.txt";
        BufferedReader buffer = null;
        try {
            buffer = new BufferedReader(new FileReader(ruta));
            String contenido = buffer.readLine();
            System.out.println("Contenido = " + contenido);
        } catch (Exception e) {
            System.out.println("No se pudo leer el archivo: " + e);
        } finally {
            try {
                if (buffer != null) {
                    buffer.close();
                }
            } catch (Exception e) {
                System.out.println("No se puede cerrar el buffer.");
            }
        }
    }

    public static void excepcionNull() {
        int[] arr = { 1, 2 };
        System.out.println("arr[7] = " + arr[7]);
    }

    public static void excepcionAritmetica() {

        int a = 10 / 0;
        int b = 10 / 0;

        System.out.println(">>>>>>>>>> fin Excepciones");
    }
}
