package kata4;

public class Animal {
    protected String nombre;
    protected String tipo;
    
    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
    public void describirAnimal() {
        System.out.println(nombre + " es un " + tipo);
    }
    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }
}