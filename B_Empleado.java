package toString;

/**
 * @author Moisés Hernández Cruz
 */
public class B_Empleado {
    
    private String nombre;
    private int edad;
    private float salario;

    public B_Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public String toString(){
        return "El empleado se llama "+nombre+" con "+edad+" años y un salario de "+salario;
    }
}
