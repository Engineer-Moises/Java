package toString;

/**
 * @author ALUMNO
 */
public class A_Principal {
    
    public static void main (String []args){
        
        A_Alumno a1 = new A_Alumno("Juan","1234",20);
        A_Alumno a2 = new A_Alumno("Pepe","4545",19);
        A_Alumno a3 = new A_Alumno("Manuel","4563",22);
        A_Alumno a4 = new A_Alumno("Maria","245579",21);
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}