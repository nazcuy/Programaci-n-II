package ejercicio14;

public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        System.out.println("Formato: " + render.getFormato());
        System.out.println("Proyecto: " + render.getProyecto().getNombre());
        System.out.println("Duración: " + render.getProyecto().getDuracionMin());
    }
}
