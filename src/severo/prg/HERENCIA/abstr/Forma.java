package severo.prg.HERENCIA.abstr;

public abstract class Forma {

    private int numLados;

    public Forma(int numLados) {
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }

    public abstract int getArea();

    public abstract int getPerimeter();
}
