package acc.coding;
import java.util.Scanner;

/**
 *
 * @author paoch
 */
public class Ahorcado {

    public static void ejecutar(){
        String  p = Ahorcado.ingresarPalabra();
        System.out.println(">>>>>>>");
        Ahorcado.adivinarPalabra(p);
    }

    public static String ingresarPalabra() {
        System.out.println("Ingresa una palabra de mínimo 10 letras sin espacios");
        String palabra;

        boolean espacioBlanco = true;

        do {

            Scanner sc = new Scanner(System.in);

            palabra = sc.nextLine();
            System.out.println("input word = "+palabra);
            if (palabra.length() >= 10) {
                for (int i = 0; i < palabra.length(); i++) {
                    if (Character.isWhitespace(palabra.charAt(i))) {
                        espacioBlanco = true;
                        break;
                    } else {
                        espacioBlanco = false;
                        palabra = palabra.toLowerCase();
                    }
                }

            } else {
                System.out.println("Palabra incorrecta ingresa una palabra con un mínimo de 10 letras sin espacios");

            }
        } while (palabra.length() < 10 || espacioBlanco);
        System.out.println(espacioBlanco);
        return palabra;

    }

    public static void adivinarPalabra(String palabra) {
        String[] palabraAdivinar = new String[palabra.length()];
        int a = 5;
        String decision;
        for (int i = 0; i < palabraAdivinar.length; i++) {
            palabraAdivinar[i] = "-";

            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Ahora vamos adivinar la pabra. Tienes" + a + " intentos para adivinar la palabra");
                String letra = sc.next();
                letra = letra.toLowerCase();
                a -= 1;
                for (int j = 0; j < palabraAdivinar.length; j++) {
                    if (letra.equals(palabra.charAt(j))) {
                        palabraAdivinar[j] = letra;

                    } else {
                        System.out.println("La palabra no contiene esta letra");
                    }

                }
                for (int j = 0; j < palabraAdivinar.length; j++) {
                    System.out.println(palabraAdivinar[j]);
                }

                do {
                    System.out.println("Deseas adivinar la palabra SI ingresa 1 o NO ingresa 2");
                    decision = sc.next();

                    if (decision.equals("1")) {
                        System.out.println("Indica la palabra");
                        String palabraingresada = sc.next();
                        if (palabraingresada.equals(palabra)) {
                            System.out.println("ADIVINASTE LA PALABRA");
                        }
                        break;
                    } else if (decision.equals("2")) {

                    } else {
                        System.out.println("Has ingresado opcion incorrecta");
                    }

                } while (!(decision.equals("1") || decision.equals("2")));

            } while (a > 0 && a < 5 && decision.equals("2"));

        }

    }
}