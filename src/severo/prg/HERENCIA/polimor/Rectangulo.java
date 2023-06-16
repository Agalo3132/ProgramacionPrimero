package severo.prg.HERENCIA.polimor;

public class Rectangulo extends Forma{
    private int ancho;
    private int largo;

    public Rectangulo(String nombre, int ancho, int largo) {
        super(nombre);
        this.largo=largo;
        this.ancho=ancho;
    }

    @Override
    public double area() {
        return ancho*largo;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "ancho=" + ancho + ", largo=" + largo + '}';
    }
}
