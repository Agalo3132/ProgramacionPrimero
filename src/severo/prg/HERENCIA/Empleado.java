package ProgramacionPrimero.src.severo.prg.HERENCIA;

import java.time.LocalDate;

public class Empleado {

    protected String dni;
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected double salario;
    protected int numero;
    protected String address;

    public Empleado() {

    }

    public Empleado(String dni) {
        this.dni = dni;
    }
    //getters y setters

    public double calculateSalaryAnual() {
        return 14 * salario;
    }



}
