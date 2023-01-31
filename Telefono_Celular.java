package Herencia_Telefono;
import javax.swing.JOptionPane;

/**
 * @author Moisés Hernández Cruz
 */
public class Telefono_Celular extends Telefono{
    String antena;
    
    public void enviarMensaje(){
        String mensaje="";
        mensaje = JOptionPane.showInputDialog("La persona no se encuentra. Ingresa un mensaje");
        JOptionPane.showMessageDialog(null,"Enviado");
    }
}