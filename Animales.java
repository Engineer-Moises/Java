package examen_moises;
import javax.swing.JOptionPane;

/**
 * @author Moisés Hernández Cruz
 */
public class Animales {
    //Atributos
    String nombre;
    int id;
    int edad;
    String comida;
    //Metodos
    public void insertarDatos(){
        nombre=JOptionPane.showInputDialog("Ingresa el nombre del animal");
        id=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ID del "+nombre));
        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del "+nombre));
    }
    
    public void comen(){
        comida=JOptionPane.showInputDialog("¿Que come el animal: "+nombre+"?");
    }
    
    public void mostrarDatos(){
        System.out.println("\nNombre del animal: "+nombre+
                         "\nID del animal: "+id+
                         "\nEdad del animal: "+edad+
                         "\nSe alimenta de: "+comida);
    }
}
