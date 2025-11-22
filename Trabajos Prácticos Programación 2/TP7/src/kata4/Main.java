package kata4;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro("Pichicho", "Labrador"));
        animales.add(new Perro("Juanete", "Pastor Alemán"));
        animales.add(new Gato("Mishi", "Negro"));
        animales.add(new Gato("Mimi", "Blanco"));
        animales.add(new Vaca("Lola", "Jereford"));
        animales.add(new Vaca("Rosita", "Averdinangus"));
        
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
        
        System.out.println("");
        for (Animal animal : animales) {
            animal.describirAnimal();
            System.out.println("-----------------------------");
        }
    }
}