package acc.coding.poo;

import java.util.Date;

// POO: Pilar 'encapsulamiento'
/*
 * Ocultacion de datos/operaciones internos de un objeto 
 * - tener atributos ocultas para evitar lecturas o escrituras indebidas
 * - Tener un control sobre la asignacion de los valores de atributos.
 * - Se recomienda que todos las clases utilizen atributos privados, en consecuencia siempre se debe utilizar un constructor para rellenar los atributos.
 * Si queremos permitir escritura o lectura de un atributo puntual desde el mundo exterior, se utiliza metodos especiales: getters & setters
 * 
 * Beneficios
 * - Ya no hay riesgo de modificaciones indebidas
 * - El dessarrollador tiene control total de como leer u acceder a los atributos o metodos
 * - Ocultamiento de atributos. solo queremos compartir ciertos atributos mientras otros son escondidos del mundo exterior.
 */

public class Mascota {
    // Modificadores de acceso: public y private (protected)
    // public: atributos, funciones, metodos sean de acceso publico
    // private: esconder los metodos o atributos del exterior
    private String nombre;
    private String raza;
    private int edad;
    private double masaCorporal;
    private Date fechaNacimiento;

    public Mascota() {

    }

    public Mascota(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.masaCorporal = (0.75 * edad);
        this.fechaNacimiento = new Date(2017, 01, 24);
    }

    public void comer() {
        System.out.println(this.nombre + " esta comiendo");
        if (this.edad > 10) {
            this.dormir();
        }
    }

    private void dormir() {
        System.out.println(this.nombre + " esta durmiendo");
    }

    // Getter: metodo especial para leer atributos
    public String getNombre() {
        return nombre;
    }

    // Setter: metodo especial para escribir atributes
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mascota [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", masaCorporal=" + masaCorporal
                + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

}
