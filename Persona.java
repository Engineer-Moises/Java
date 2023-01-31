package Herencia;

/**
 * @author Moisés Hernández Cruz
 */
public class Persona {
    //Atributos
    private String nombre;
    private String apellidos;
    private int edad;

    //Constructores
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //Metodos Getter
    public String getNombre(){
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }
}
