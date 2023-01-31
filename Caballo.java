package Polimorfismo;

/**
 * @author Moisés Hernández Cruz
 */
public class Caballo extends Transporte {
    String raza;
    String color;

    public Caballo(String raza, String Color, int velocidad, int num_Pasajeros) {
        super(velocidad, num_Pasajeros);
        this.raza = raza;
        this.color = Color;
    }
    
    public void avanzar(){
        System.out.println("                       .......     ");
        System.out.println("                      .  .    .");
        System.out.println("                     .        .");
        System.out.println("                    . . .....");
        System.out.println("                   .         ");
        System.out.println("        ...........          ");
        System.out.println("       .          .           ");
        System.out.println("      .            .          ");
        System.out.println("     .              .         ");
        System.out.println("    .                .        ");
        System.out.println("   .                  .       ");
        System.out.println("  .                    .      ");
        System.out.println("____________________________");
    }
    
    public void frenar(){
        System.out.println("         .....             ");
        System.out.println("        .    .             ");
        System.out.println("        ......             ");
        System.out.println("         .                 ");
        System.out.println("          .                ");
        System.out.println("           ......          ");
        System.out.println("         .       .          ");
        System.out.println("       .          .         ");
        System.out.println("     .           .          ");
        System.out.println("    .          .            ");
        System.out.println("   .                        ");
        System.out.println("  .                         ");
        System.out.println("____________________________");
    }
    
    @Override
    public String toString(){
        String mensaje = super.toString();
        return "Marca: "+raza+
             "\nColor: "+color+mensaje;
    }
}
