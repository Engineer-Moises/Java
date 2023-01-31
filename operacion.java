package operacion;
import javax.swing.JOptionPane;

/**
 * @author Moisés Hernández Cruz
 */
public class operacion {
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Métodos
    
    //Método para solicitar los dos números
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el número1:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el número2:"));
    }
    
    //Método para suma
    public void sumar(){
        suma = numero1 + numero2;
    }
    
    //Método para resta
    public void restar(){
        resta = numero1 - numero2;
    }
    
    //Método para multiplicar
    public void multiplicar(){
        multiplicacion = numero1 * numero2;
    }
    
    //Método para dividir
    public void division(){
        division = numero1 / numero2;
    }
    
    //Método para mostrar resultados
    public void mostrarNumeros(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
}
