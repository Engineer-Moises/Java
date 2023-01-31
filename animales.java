package coche;

/**
 * @author Moisés Hernández Cruz
 */
public class animales {
    String nombre;
    int id;
    int edad;
    
    //Metodo
    public static void main(String []arg){
        animales animal1 = new animales();
        
        animal1.id = 001;
        animal1.nombre = "leon";
        animal1.edad = 15;
        
        System.out.println("El ID del animal1 es: "+animal1.id);
        System.out.println("El nombre del animal1 es: "+animal1.nombre);
        System.out.println("La edad del animal1 es: "+animal1.edad);
        
        animales animal2 = new animales();
        
        animal2.id = 002;
        animal2.nombre = "jirafa";
        animal2.edad = 23;
        
        System.out.println("\nEl ID del animal2 es: "+animal2.id);
        System.out.println("El nombre del animal2 es: "+animal2.nombre);
        System.out.println("La edad del animal2 es: "+animal2.edad);
    }
}