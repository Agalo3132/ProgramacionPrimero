package severo.prg.HERENCIA;

//Heredo atributos y metodos, menos constructores
public class Programador extends Empleado{

    private String equipo;
    private String role;
    private double bonus;

    public Programador() {
        super("");
        System.out.println("");
    }

    public Programador(String dni) {
        super(dni);
        this.dni=dni;
    }

    public static void main(String[] args) {
        Programador p = new Programador("");
    }

    @Override
    public double calculateSalaryAnual() {
        double resultado = super.calculateSalaryAnual();
        resultado += bonus;
        return resultado;
    }
}
