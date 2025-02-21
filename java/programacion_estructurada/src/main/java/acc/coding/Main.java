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

        System.out.println("Ingrese un numero: ");
        int numeroIngresadoPorEscaner = xd.nextInt();
        
        System.out.println("Numero: "+numeroIngresadoPorEscaner);

        // El scanner tienen diferentes metodos para cada tipo de dato
        float float1 = xd.nextFloat();
        double d1 = xd.nextDouble();
        boolean b = xd.nextBoolean();
        String s = xd.next();

        // Esto no se puede por la incompatabilidad de tipos de datos
        //int n = xd.nextFloat();

    }
}