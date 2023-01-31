package Herencia_Telefono;
import javax.swing.JOptionPane;
/**
 * @author 
 */
public class Telefono_Publico extends Telefono{
    String ubicacion;
    int moneda;
    
    public void recibirCredito(){
        moneda=Integer.parseInt(JOptionPane.showInputDialog("Ingresa una moneda"));
    }
    
    public void controlarCredito(){
        switch (moneda){
            case 10:
                JOptionPane.showMessageDialog(null,"Tienes 15 minutos");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Tienes 10 minutos");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Tienes 5 minutos");
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"Tienes 2 minutos");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Esa moneda no existe");
                break;
        }
    }
}