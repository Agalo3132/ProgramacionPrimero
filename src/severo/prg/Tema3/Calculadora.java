package ProgramacionPrimero.src.severo.prg.Tema3;

public class Calculadora {

    private double primerNumero;
    private double segundoNumero;


    public double getPrimerNumero() {
        return primerNumero;
    }

    public double getSegundoNumero() {
        return segundoNumero;
    }

    public void setPrimerNumero(double primerNumero) {
        this.primerNumero = primerNumero;
    }

    public void setSegundoNumero(double segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public double getResultadoSuma() {
        return primerNumero + segundoNumero;
    }

    public double getResultadoResta() {
        return segundoNumero - primerNumero;
    }

    public double getMultiplicationResult() {
        return primerNumero * segundoNumero;
    }

    public double getDivisionResult(double divisionResult) {
        if (segundoNumero == 0) {
            System.out.println(0);
        } else {
            divisionResult = primerNumero / segundoNumero;
        }
        return divisionResult;
    }

    public static void main(String[] args) {
        Calculadora calculator = new Calculadora ();
        calculator.setPrimerNumero(5);
        calculator.setSegundoNumero(4);
        System.out.println("suma= " + calculator.getResultadoSuma());
        System.out.println("resta= " + calculator. getResultadoResta ());
        calculator.setPrimerNumero(5.25);
        calculator.setSegundoNumero(10);
        System.out.println("multiplicación= " + calculator.getMultiplicationResult());
        System.out.println("división= " + calculator.getDivisionResult(10));
    }
}
