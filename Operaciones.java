package Ejercicio2_Herencia;
import javax.swing.JOptionPane;

/**
 * @author Moisés Hernández Cruz
 */
public class Operaciones {
    public int numero1;
    public int numero2;
    
    public Operaciones (int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public void insertarNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 2"));
    }
}