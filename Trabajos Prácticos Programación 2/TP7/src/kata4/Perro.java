package kata4;

public class Perro extends Animal {
    private String raza;
    
    public Perro(String nombre, String raza) {
        super(nombre, "perro");
        this.raza = raza;
    }
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }
    @Override
    public void describirAnimal() {
        super.describirAnimal();
        System.out.println("Raza: " + raza);
    }
    public String getRaza() {
        return raza;
    }
}
