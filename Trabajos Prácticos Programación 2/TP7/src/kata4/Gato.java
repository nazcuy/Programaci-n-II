package kata4;

public class Gato extends Animal {
    private String color;
    
    public Gato(String nombre, String color) {
        super(nombre, "gato");
        this.color = color;
    }
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau miau!");
    }
    @Override
    public void describirAnimal() {
        super.describirAnimal();
        System.out.println("Color: " + color);
    }
    public String getColor() {
        return color;
    }
}