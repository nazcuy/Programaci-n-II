import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
            System.out.println("REGISTRO DE LA PRIMER GALLINA");
            System.out.println("Ingrese el código de la gallina: ");
            int idGallina1 = entrada.nextInt();
            System.out.println("Ingrese la edad de la gallina: ");
            int edad1 = entrada.nextInt();
            Gallina gallina1 = new Gallina(idGallina1, edad1);
            
            System.out.println("REGISTRO DE LA SEGUNDA GALLINA");
            System.out.println("Ingrese el código de la gallina: ");
            int idGallina2 = entrada.nextInt();
            System.out.println("Ingrese la edad de la gallina: ");
            int edad2 = entrada.nextInt();
            Gallina gallina2 = new Gallina(idGallina2, edad2);
            
            System.out.println("");
            System.out.println("----Estado inicial----");
            gallina1.mostrarEstado();
            gallina2.mostrarEstado();
            
            System.out.println("Las gallinas ponen huevos 1 vez por día, a partir del año de vida.");
            System.out.println("\n¿Cuántos años vamos a simular de envejecimiento de las gallinas?: ");
            int añosEnvejecimiento = entrada.nextInt();
            
            gallina1.envejecer(añosEnvejecimiento);
            gallina2.envejecer(añosEnvejecimiento);
            
            gallina1.ponerHuevo();
            gallina2.ponerHuevo();

            System.out.println("\nEstado final después de " + añosEnvejecimiento + " años:");
            gallina1.mostrarEstado();
            gallina2.mostrarEstado(); 
    }
}