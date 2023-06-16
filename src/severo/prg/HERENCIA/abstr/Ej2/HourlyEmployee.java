package severo.prg.HERENCIA.abstr.Ej2;

public class HourlyEmployee extends Employee {
    private double tasaPago;
    private int horasTrabajadas;

    @Override
    public double calculateWeeklyPay() {

        return tasaPago*horasTrabajadas;
    }
}
