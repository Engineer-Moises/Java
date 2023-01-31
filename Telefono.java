import javax.swing.JOptionPane;
/**
 * @author Equipo 2
 */
public class Telefono {
    //Atrubutos
    String marca, color;
    int almto;
    int llamar;
    String mensaje;
    
    //Metodo Constructor
    public Telefono(String _marca, String _color,int _almto){
        marca= _marca;
        color= _color;
        almto= _almto;
    }
    
    public void llamar(){
       llamar=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas llamadas realizó en un día?"));
    }
    
    public void mensaje(){
        mensaje=JOptionPane.showInputDialog("¿A quien le quiere mandar mensaje?");
    }
    
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null,"La marca del telefono es: "+marca+
                "\nEl color del telefono es: "+color+
                "\nEl almacenamiento del telefeno es: "+almto+"Gb"+
                        "\nLa llamadas que realizo el telefono en un dia fueron: "+llamar+"\nEl telefono envio un mensaje a: "+mensaje);
        
        
    }
}
