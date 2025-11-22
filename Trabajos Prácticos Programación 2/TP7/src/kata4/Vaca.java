package kata4;

public class Vaca extends Animal {
    private String tipo;
    
    public Vaca(String nombre, String tipo) {
        super(nombre, "vaca");
        this.tipo = tipo;
    }
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Muuuuu!");
    }
    @Override
    public void describirAnimal() {
        super.describirAnimal();
        System.out.println("Tipo: " + tipo);
    }
    public String getTipo() {
        return tipo;
    }
}
