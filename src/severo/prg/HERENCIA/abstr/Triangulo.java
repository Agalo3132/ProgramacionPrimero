package severo.prg.HERENCIA.abstr;

public class Triangulo extends Forma {
    private int ancho;
    private int alto;

    public Triangulo(int numLados) {
        super(numLados);
    }

    @Override
    public int getArea() {
        return ancho*alto/2;
    }

    @Override
    public int getPerimeter() {
        return ancho+alto+alto;
    }
}
