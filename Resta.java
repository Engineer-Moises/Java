package Ejercicio2_Herencia;

import javax.swing.JOptionPane;

/**
 * @author MoisésHernández Cruz
 */
public class Resta extends Operaciones {
    int  resta;
    
    public Resta (int resta, int numero1, int numero2){
        super (numero1,numero2);
        this.resta = resta;
    }
    
    public void restar (){
        resta = numero1 - numero2;
    }
    
    public void mostrarResultados (){
        JOptionPane.showMessageDialog(null,"Numero 1: "+numero1+
                                         "\nNumero 2: "+numero2+
                                         "\nResultado: "+resta);
    }
}