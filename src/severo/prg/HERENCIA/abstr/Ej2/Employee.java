package ProgramacionPrimero.src.severo.prg.HERENCIA.abstr.Ej2;

public abstract class Employee  {
    private String nomber;
    private String cargo;

    public String getNomber() {
        return nomber;
    }

    public void setNomber(String nomber) {
        this.nomber = nomber;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public abstract double calculateWeeklyPay();

    public static void main(String[] args) {

    }
}
