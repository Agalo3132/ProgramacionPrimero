package Avanzado.Predct;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Programmer {
    private String nombre;
    private double salario;
    private LocalDate fechaInicio;

    public Programmer(String nombre, double salario, LocalDate fechaInicio) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
    }

    public Programmer(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Supplier<Programmer> pr = () -> new Programmer("Álvaro", 2000, LocalDate.now());
        Supplier<Programmer> pr2 = () -> new Programmer("Álvaro");


    }

    public Programmer fabricaProgramadores(Programmer programador, Supplier sup) {
        if (programador.salario == 0) {
            programador.salario = 50000;
            programador.fechaInicio = LocalDate.now();
            return programador;
        }
        return programador;
    }
}
