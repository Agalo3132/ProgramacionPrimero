package ProgramacionPrimero.src.severo.prg.HERENCIA.composicion;

public class Teclado {

    private String color;
    private int teclas;

    public Teclado(String color, int teclas) {
        this.color = color;
        this.teclas = teclas;
    }

    public void pushKey(char key) {
        System.out.println("Se ha presionado la tecla " +key);
    }

}
