package kata2;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[2]; 
        figuras[0] = new Circulo("Círculo prueba", 5.0);
        figuras[1] = new Rectangulo("Rectángulo prueba", 4.0, 6.0);
        
        for (Figura figura : figuras) {
            figura.mostrarInfo();
            System.out.println();
        }
    }
}
