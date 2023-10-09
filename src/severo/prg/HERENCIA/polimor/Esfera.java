package ProgramacionPrimero.src.severo.prg.HERENCIA.polimor;

public class Esfera extends Forma{
    private double radio;

    public Esfera(String nombre, double radio) {
        super(nombre);
        this.radio=radio;
    }

    @Override
    public double area() {
        return 4*Math.PI*radio*radio;
    }
}
