package acc.coding;

public class Main {
    public static void llamarFuciones() {
        EjemploFunciones.funcion1();
        EjemploFunciones.funcion1();
        EjemploFunciones.funcion1();
        EjemploFunciones.funcion1();

        EjemploFunciones.funcion2();
        int n1 = EjemploFunciones.funcion2();
        System.out.println("Main::n1 = " + n1);

        EjemploFunciones.funcionRetornarString();
        EjemploFunciones.funcionRetornarString();
        EjemploFunciones.funcionRetornarString();
        String str1 = EjemploFunciones.funcionRetornarString();
        System.out.println("Main::str1 = " + str1);

        System.out.println("\n\n\n");
        EjemploFunciones.funcion3("argumento 1");
        String str2 = "argumento 2";
        EjemploFunciones.funcion3(str2);

        System.out.println("\n\nImpresion de arreglos:");
        int[] arr1 = { 1, 9, 8, 7 };
        EjemploFunciones.imprimirArreglo(arr1);
        int[] arr2 = { 555, 9, 145, -5, 8, 7 };
        EjemploFunciones.imprimirArreglo(arr2);

        System.out.println("\n\nFuncion con 2 parametros:");
        EjemploFunciones.funcion4("Ejemplo string", 5);

    }

    public static void main(String[] args) {
        System.out.println(">>> Ejecutando Main main");
        // Condicionales.ejecutarCondicionales();
        // ScannerEjercicio.ejecutarScanner();
        // For.arreglosMultidimencionales();
        // While.whileEjecucion();
        // DoWhile.ejecutarDoWhile();
        // Switch.ejecutarSwitch();
        // Strings.ejecutarStrings();
        // Funciones.ejecutarFunciones();
        // Recursividad.ejecutar();
        // BoxingUnboxing.ejecutar();
        CopiasYReferencias.ejecutar();
    }

}