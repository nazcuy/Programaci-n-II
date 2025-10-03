package ejercicio14;

public class Main {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Documental Peronismo", 120);
        EditorVideo editor = new EditorVideo();
        
        editor.exportar("mp3", proyecto);
    }
}
