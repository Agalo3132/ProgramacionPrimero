package ProgramacionPrimero.src.severo.prg.HERENCIA.inetrfaces.Dd;

public class Circulo implements ShapeOperable{
    private double radio;

    @Override
    public double calcularPerimetro() {
        return  2*PI*radio;
    }

    @Override
    public double calcularArea() {
        return PI*(radio*radio);
    }
}
