package toString;

/**
 * @author ALUMNO
 */
public class A_Alumno {
    private String nombre, id;
    private int edad;
    
    public A_Alumno (String nombre, String id, int edad){
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }
    
    public String toString(){
        return "Nombe: "+nombre+
             "\nEdad: "+edad+
             "\nID: "+id+"\n";
    }
}