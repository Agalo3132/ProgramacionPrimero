package severo.prg.HERENCIA.abstr.Ej2;

public class SalaryEmployee extends Employee {
    private double salarioSemanal;

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double calculateWeeklyPay() {
        return salarioSemanal;
    }
}
