package Ejercicio2_Herencia;

import javax.swing.JOptionPane;

/**
 * @author Moisés Hernández Cruz
 */
public class Suma extends Operaciones{
    int suma;
    
    public Suma (int suma, int numero1, int numero2){
        super (numero1,numero2);
        this.suma = suma;
    }
    
    public void Sumar (){
        suma = numero1 + numero2;
    }
    
    public void mostrarResultados (){
        JOptionPane.showMessageDialog(null,"Numero 1: "+numero1+
                                         "\nNumero 2: "+numero2+
                                         "\nResultado: "+suma);
    }
}