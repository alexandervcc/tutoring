package acc.coding;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

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

        // Excepciones.excepcionChecked();

        // Excepciones.tryCatchEspecializado();

        // Excepciones.lanzarExcepcionManualmente();
        /*
         * 
         * double d = 0;
         * try {
         * d = Excepciones.dividirNumerosChecked(5, 0);
         * System.out.println("Division = " + d);
         * } catch (Exception e) {
         * System.out.println("Error en division = " + e);
         * }
         * 
         * d = Excepciones.dividirNumerosUnchecked(5, 0);
         * System.out.println("Division = " + d);
         * 
         * System.out.println(">>> Fin de programa. ");
         * 
         */

        Excepciones.tryWithResources();
    }

    public static void tryWithResources() {
        // Try-catch especializado para cerrar recursos como archivos, conexiones
        // Ya no es necesario el cierre manual del recurso.
        System.out.println(">>> tryWithResources");
        String ruta = "./dir/archivo.txt";

        try 
        (
            BufferedReader buffer = new BufferedReader(new FileReader(ruta))
        ) 
        {
            String contenido = buffer.readLine();
            System.out.println("Contenido = " + contenido);
        } catch (Exception e) {
            System.out.println("Error de lectura = " + e);
        }
    }

    public static double dividirNumerosUnchecked(double d1, double d2) {
        // Esta funcion es de tipo unchecked
        // Las unchecked utilizar RuntimeException
        if (d2 == 0) {
            throw new RuntimeException("No es posible la division para cero.");
        }

        double d = d1 / d2;

        return d;
    }

    public static double dividirNumerosChecked(double d1, double d2) throws Exception {
        // Por defecto se suele tratar a las excepcion de tipo 'Exception' como checked
        // Esta funcion es de tipo checked
        if (d2 == 0) {
            throw new Exception("No es posible la division para cero.");
        }

        double d = d1 / d2;

        return d;
    }

    public static void tryCatchEspecializado() {
        try {
            // BufferedReader buffer = new BufferedReader(new FileReader("t"));
            int[] arr = { 1, 2 };
            arr[5] = 0;
            int i = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            // Este bloque catch, solo capturara excepciones del tipo
            // ArrayIndexOutOfBoundsException
            System.out.println(">>> Error indice fuera de rango. " + e);
        } catch (ArithmeticException e) {
            System.out.println(">>> Error aritmetico. " + e);
        } catch (Exception e) {
            System.out.println(">>> Error generico : " + e);
        }
        System.out.println(">>> Final de la funcion tryCatchEspecializado");
    }

    public static void lanzarExcepcionManualmente() {
        System.out.println("--- Funcion lanzando una excepcion");

        // Utilizar palabra reservada: throw
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                Exception e = new Exception("Numero invalido");
                throw e; // lanzar una excepcion
            }
            System.out.println("Numero aceptado ");
            // throw new Exception("Error customizado");
        } catch (Exception e) {
            System.out.println(">>> Excepcion manual capturada: " + e);
        }
    }

    public static void lanzarExcepcionManualmenteVersionReturn() {
        System.out.println("--- Funcion con return en vez de exception");

        // Utilizar palabra reservada: throw
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            return;
        }
        System.out.println("Numero aceptado ");
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
