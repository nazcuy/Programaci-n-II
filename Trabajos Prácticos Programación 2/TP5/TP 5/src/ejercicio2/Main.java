package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Bateria bata = new Bateria("Litio",3);
        Celular celu = new Celular("321654987","Huawei","P10");
        celu.setBateria(bata);
        Usuario nazcuy = new Usuario("Nicolás","12345678");
        celu.setUsuario(nazcuy);
        
        System.out.println("Celular: " + celu.getMarca() + " " + celu.getModelo());
        System.out.println("Batería: " + celu.getBateria().getCapacidad() + "V");
        System.out.println("Usuario: " + celu.getUsuario().getNombre());
        System.out.println("Celular del usuario: " + nazcuy.getCelular().getImei());
    }
}
