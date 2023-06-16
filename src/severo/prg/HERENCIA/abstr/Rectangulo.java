package severo.prg.HERENCIA.abstr;

public class Rectangulo extends Forma {
    private int ancho;
    private int alto;

    public Rectangulo(int numLados) {
        super(numLados);
    }

    @Override
    public int getArea() {
        return ancho*alto;
    }

    @Override
    public int getPerimeter() {
        return ancho+alto+alto+ancho;
    }
}
