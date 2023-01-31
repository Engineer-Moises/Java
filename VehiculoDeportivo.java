package Polimorfismo;

/**
 * @author Moisés Hernández Cruz
 */
public class VehiculoDeportivo extends Vehiculo {
    private int cilindros;
    
    public VehiculoDeportivo(int cilindros,String matricula,String marca,String modelo){
        super(matricula,marca,modelo);
        this.cilindros = cilindros;
    }
    
    public int getcilindros(){
        return cilindros;
    }
    
    @Override
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+
             "\nCilindros: "+cilindros;
    }
}