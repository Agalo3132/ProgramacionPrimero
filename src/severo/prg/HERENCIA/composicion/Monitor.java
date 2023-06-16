package severo.prg.HERENCIA.composicion;

public class Monitor {

    private String modelo;
    private String resolucion;
    private int tam;

    public Monitor(String modelo, String resolucion, int tam) {
        this.modelo = modelo;
        this.resolucion = resolucion;
        this.tam = tam;
    }

    public void dibujaPixek(int x, int y) {
        System.out.println("Pixel en " + x + " " + y);
    }

}
