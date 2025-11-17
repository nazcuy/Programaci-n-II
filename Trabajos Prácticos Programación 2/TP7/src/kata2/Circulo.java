package kata2;

public class Circulo extends Figura {
    private double radio;
    
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }
    public double getRadio() {
        return radio;
    }
}
