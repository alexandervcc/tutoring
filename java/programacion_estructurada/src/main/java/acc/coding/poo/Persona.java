package acc.coding.poo;

public class Persona {
    // Atributos: declaran a nivel de la clase
    String nombre;
    int edad;
    String apellido;
    double peso;
    double masaCorporal;

    // Constructor: un metodo especial que me permite instancia un objeto de la
    // clase
    // todas las clases por defecto tienen un constructor
    // Si se asigna explicitamente un constructor a una clase, el constructor por
    // defecto desaparece.
    // El constructor usualmente se utiliza para instanciar los atributos del
    // objeto.
    // Una clase puede tener mas de 1 constructor, pero no 2 constructores iguales
    public Persona() {
        System.out.println("Creando una persona. Constructor en blanco.");
    }

    public Persona(String name, String apellido, int edad, double peso) {
        System.out.println("Creando una persona. Constructor con argumentos.");
        this.nombre = name;
        this.edad = edad;
        this.apellido = apellido;
        this.peso = peso;
        this.masaCorporal = (peso * edad) / 0.24;
    }

    public Persona(String apellido) {
        this.apellido = apellido;
    }

    // Metodos: funciones declaras a nivel de la clase (no seran static)
    public void trabajar() {
        // Cuando se requiere acceder atributos desde los metodos, pero utilizar this.
        // Se puede leer como asignar los atributos.
        // this.nombre = "xd";

        System.out.println(this.nombre + " esta trabajando.");
    }

    public void dormir() {
        this.trabajar();
        System.out.println(this.nombre + " esta durmiendo.");
    }

    // @ -> Anotacion: una caracteristica extra que se le anade una function o atributo
    // Override: sobrecargando un metodo (sobrecargar = sobreescribiendo)
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", apellido=" + apellido + "]";
    }

}
