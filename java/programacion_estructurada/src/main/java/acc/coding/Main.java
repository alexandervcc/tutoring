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

        /*
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
            System.out.println(">> " + in1 + " es menor que " + in2);
        } else if (in1 == in2) {
            System.out.println(">> " + in1 + " es igual a " + in2);
        } else {
            System.out.println(">> " + in1 + " es mayor que " + in2);
        }

        int num1 = 10;
        float float1 = 200;
        boolean bb1 = num1 == float1;

        String str1 = "str1";
        String str2 = "str1";
        // boolean bb2 = num1 == str1; incompatible
        char c1 = 'a';
        // boolean charVsString = str1 == c1; incompatible

        boolean strVsstr1 = str1 == str2;
        System.out.println("str1 == str2: " + strVsstr1);

        if (str1 == "str1") {
            System.out.println("Igual a str1");
        } else {
            System.out.println("NO Igual a str1");
        }

        // OPERADORES LOGICOS
        // && AND
        // || OR
        // ! NEGACION

        boolean comp1 = 10 > 20 && 10 > 5;
        System.out.println("10 > 20 && 10 > 5: " + comp1);

        boolean comp2 = 10 > 20 || 10 > 5;
        System.out.println("10 > 20 || 10 > 5: " + comp2);

        boolean comp3 = 10 < 20 && 10 > 5;
        System.out.println("10 < 20 && 10 > 5: " + comp3);

        boolean comp4 = !(10 < 20 && 10 > 5);
        System.out.println("!(10 < 20 && 10 > 5): " + comp4);

        int edad = xd.nextInt();
        if (edad < 18 || edad > 65) {
            System.out.println("No tiene que votar");
        } else {
            System.out.println("Obligada a votar");
        }
            




        // -----------------------------------------------------------------------------------------------
        
        //    BUCLES
        //    - Repeticion de una accion
        //    - Tipos de bucles: FOR, WHILE, DO-WHILE
        //   - Todo bucle debe de tener una condicion de finalizacion
                

        // FOR
        // - Bucle que repite la accion senalando un punto de inicio y punto de fin
        // - Tamano del paso: como queremos que avance desde el punto de inicio hacia el punto de fin
        // for ( <inicio> ; <condicion de fin> ; <tamano del paso>  ) { 
        //     ... codigo que se repite
        // }

        // i ++;   => i = i + 1;
        System.out.println("Bucle 1");
        for(int i = 0; i <= 5 ; i++  ){
            System.out.println("Numero actual: "+i);
        }

        System.out.println("Bucle 2");
        for(int i = 10; i <= 30 ; i+=2  ){
            System.out.println("Numero actual: "+i);
        }
        
        System.out.println("Bucle 3");
        for(int i = 100; i > -10 ; i-=5  ){
            System.out.println("Numero actual: "+i);
        }
        */


        //-----------------------------------------------------------------------------------------------
        // STRINGS
        // Cadena de texto, incluira cualquier caracter (unmeros, letras, simbolos especiales)
        // Tipo de dato: `String`, la primera letra es mayuscula
        // En Java hay dos tipos de datos: primitivas y objetos
        // primitivas: tipos de datos que solo almacenan valores, el tipo empieza en minuscula
        //             ejemplos de primitas: int, double, float, char, boolean
        // objectos: almacena el valor + metodos, el tipo empieza con mayuscula
        // Por lo tanto, los Strings son objetos
        String n = "mana";
        int edad = 8;
        System.out.println(n + " "+edad);
        // Para ejecutar un metodo de un objeto, se utilizar un punto
        System.out.println("Cantidad de letras en `n`: "+n.length());
        // Al usar un . sobre una primitiva no habra funciones/metodos a ejecutar
        // edad.
        
        String oracion = "Oracion SupEr orIginAl";
        // length(): contar la cantidad de caracteres dentro del string
        System.out.println( "longitud del string: "+ oracion.length());
        int tamanoOracion = oracion.length();
        System.out.println( "longitud del string(tamanoOracion): "+ tamanoOracion);

        // equals(): comparar si dos strings son iguales
        String str1 = "mana";
        String str2 = "mijo";
        String str3 = "mana";
        boolean b1 = str1.equals(str2);
        System.out.println(str1+"=="+str2+ " -> "+b1);
        System.out.println(str1+"=="+str3+ " -> "+str1.equals(str3));

        // convertir a mayuscyka o minuscula
        System.out.println("Oracion original: "+oracion);
        System.out.println("Oracion mayuscula: "+oracion.toUpperCase());
        String oracionMinuscula = oracion.toLowerCase();
        System.out.println("Oracion minuscula: "+oracionMinuscula);

        System.out.println("\n\n");
        // substring(): cortar un string
        String subStr1 = oracion.substring(5);
        String subStr2 = oracion.substring(6,10);
        System.out.println("Substring O: "+oracion);
        System.out.println("Substring 1: "+subStr1);
        System.out.println("Substring 2: "+subStr2);
        

        System.out.println("\n\n\n");
        // indexOf(): buscar dentro de un string
        String perros = "mana babas mijo cucoso cococha";
        int indiceBusqueda1 = perros.indexOf("babas");
        System.out.println(perros);
        System.out.println("'babas' encontrado en: "+indiceBusqueda1);
        // devuelve la primera ocurrencia
        System.out.println("'a' encontrado en: "+perros.indexOf("a"));
        // devuelve -1 si no encuentra
        System.out.println("'xd' encontrado en: "+perros.indexOf("xd"));


        // concatenar strings
        System.out.println("\n\n\n");
        String p1 = "mana";
        String p2 = "cocochas";
        String p4 = "babas";
        String p3 = p1+"   "+p2+ " ---- "+p4 ;
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


        System.out.println("\n\n\n--- Remplazar texto con .replace()"        );
        // Reemplazar texto
        // replace()
        String animales = "perro gato ave pez perro";
        String mosco = "mosquito";
        String nuevosAnimales = animales.replace("perro", mosco);
        System.out.println(animales);
        System.out.println(nuevosAnimales);
        System.out.println(animales.replace("xd", mosco));

        System.out.println("\n\n\n---> Dividir strings con .split()");
        //Dividir strings
        String animales2 = "perro,gato,canario,pescado";
        String[] listaAnimales = animales2.split(",");
        System.out.println("String original: "+animales2);
        System.out.println("Lista dividida por ,");
        for (int i = 0; i < listaAnimales.length; i++) {
            System.out.println(listaAnimales[i]);
        }
        String[] listaAnimales2 = animales2.split("a");
        System.out.println("Lista dividida por a");
        for (int i = 0; i < listaAnimales2.length; i++) {
            System.out.println(listaAnimales2[i]);
        }

        System.out.println("\n\n\n--------------- .charAt()");
        // Obtener el char en una posicion: .charAt()
        String lugar ="Ecuador";
        char c1 = lugar.charAt(2);
        System.out.println(lugar);
        System.out.println("char en posicion 2: "+c1);
        

    }
}