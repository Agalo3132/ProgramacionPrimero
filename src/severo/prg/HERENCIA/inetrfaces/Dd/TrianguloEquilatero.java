package severo.prg.HERENCIA.inetrfaces.Dd;

public class TrianguloEquilatero implements ShapeOperable{
    private double altura;
    private double base;

    @Override
    public double calcularPerimetro() {
        return base * altura / 2;
    }

    @Override
    public double calcularArea() {
        return base + altura + altura;
    }
}
