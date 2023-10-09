package ProgramacionPrimero.src.severo.prg.HERENCIA.inetrfaces.Dd;

public class Cuadrado implements ShapeOperable{
    private double lado;
    @Override
    public double calcularPerimetro() {
        return lado+lado+lado+lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
}
