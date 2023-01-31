package toString;

/**
 * @author Moisés Hernández Cruz
 */
public class B_Principal {
    
    public static void main(String []args){
        
        B_Empleado e1 = new B_Empleado("Fernando Ureña",23,600.0f);
        B_Empleado e2 = new B_Empleado("Antonio Lopez",28,900.0f);
        B_Empleado e3 = new B_Empleado("Alvaro Perez",19,800.0f);
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}