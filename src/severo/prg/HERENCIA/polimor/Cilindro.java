package severo.prg.HERENCIA.polimor;

public class Cilindro extends Forma{
    private double radio;
    private int altura;

    public Cilindro(String nombre, double radio, int altura) {
        super(nombre);
        this.radio=radio;
        this.altura=altura;
    }

    @Override
    public double area() {
        return Math.PI*radio*radio*altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" + "radio=" + radio + ", altura=" + altura + '}';
    }
}
