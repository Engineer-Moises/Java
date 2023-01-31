package coche;

/**
 * @author Moisés Hernández Cruz
 */
public class coche {
    String color;
    String marca;
    int km;
    
    //Metodo
    public static void main (String [] arg){
        coche coche1 = new coche();
        
        coche1.color = "rojo";
        coche1.marca = "nissan";
        coche1.km = 0;
        
        System.out.println("El color del coche1 es: "+coche1.color);
        System.out.println("La marca del coche1 es: "+coche1.marca);
        System.out.println("El kilometraje del coche1 es: "+coche1.km);
        
        coche coche2 = new coche();
        
        coche2.color = "blanco";
        coche2.marca = "ford";
        coche2.km = 3;
        
        System.out.println("\nEl color del coche2 es: "+coche2.color);
        System.out.println("La marca del coche2 es: "+coche2.marca);
        System.out.println("El kilometraje del coche2 es: "+coche2.km);
    }
}