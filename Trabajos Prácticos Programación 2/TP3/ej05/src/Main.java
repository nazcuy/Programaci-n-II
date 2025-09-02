import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("REGISTRO DE LA NAVE");
        System.out.println("Ingrese el nombre de la nave: ");
        String nombre1 = entrada.nextLine();
        System.out.println("El cohete " + nombre1 + " necesita 60 litros de combustible para poder despegar.");
        System.out.println("Ingrese la cantidad de combustible que indica el tablero: ");
        int combustibleInicial = entrada.nextInt();
        
        NaveEspacial nave1 = new NaveEspacial(nombre1, combustibleInicial);
        System.out.println("Estado inicial de la nave");
        nave1.mostrarEstado();
        
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenú: \n 1 - Despegar\n 2 - Avanzar\n 3 - Recargar combustible\n 4 - Mostrar estado\n 5 - Salir");
            int opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    nave1.despegar();
                    break;
                case 2:
                    System.out.println("Ingrese la distancia a avanzar: ");
                    int distancia = entrada.nextInt();
                    nave1.avanzar(distancia);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de combustible para recargar: ");
                    int cantidad = entrada.nextInt();
                    nave1.recargarCombustible(cantidad);
                    break;
                case 4:
                    nave1.mostrarEstado();                    
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Error, por favor elija una opción válida");
            }
        }     
    }   
}
