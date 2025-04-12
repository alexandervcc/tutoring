package acc.coding;

public class Main {
    static void cambiarStaticN1() {
        Static.n1 = -9999;
    }

    public static void main(String[] args) {
        System.out.println(">>> Ejecutando Main main");
        // For.forEjecucion();
        // While.whileEjecucion();
        // Switch.ejecutarSwitch();
        // Funciones.ejecutarFunciones();
        // Static.ejecutarStatic();
        // System.out.println("4. Static.n1 = " + Static.n1);

        // Llamando(ejecutando) a una funcion
        Funciones.ejecutarFunciones();
    }

}