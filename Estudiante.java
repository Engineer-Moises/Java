package Herencia;
import javax.swing.JOptionPane;
/**
 * @author Moisés Hernández cruz
 */
public class Estudiante extends Persona {
    //Atributos
    private int codigoEstudiante;
    private float notaFinal;
    
    //Constructor
    public Estudiante(String nombre, String apellidos, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre,apellidos,edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
//        System.out.println("Nombre: "+getNombre()+
//                         "\nApellidos: "+getApellidos()+
//                         "\nEdad: "+getEdad()+
//                         "\nCodigo Estudiante: "+codigoEstudiante+
//                         "\nNota Final: "+notaFinal);
        JOptionPane.showMessageDialog(null,"Nombre: "+getNombre()+
                         "\nApellidos: "+getApellidos()+
                         "\nEdad: "+getEdad()+
                         "\nCodigo Estudiante: "+codigoEstudiante+
                         "\nNota Final: "+notaFinal);
    }
}
