package Herencia_Telefono;

/**
 * @author 
 */
public class Principal {
    
    public static void main(String[] args) {
        Telefono op = new Telefono();
        op.Llamar();
        op.sonar();
        
        Telefono_Celular phone1 = new Telefono_Celular();
        phone1.Llamar();
        phone1.sonar();
        phone1.enviarMensaje();
        
        Telefono_Publico publico1 = new Telefono_Publico();
        publico1.Llamar();
        publico1.recibirCredito();
        publico1.controlarCredito();
        publico1.sonar();
    }
}