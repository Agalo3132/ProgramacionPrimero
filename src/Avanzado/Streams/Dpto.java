package ProgramacionPrimero.src.Avanzado.Streams;

import java.util.ArrayList;
import java.util.List;

public class Dpto {

    private String nombre;
    private List<Emp> emps;

    public Dpto(String nombre) {
        this.nombre = nombre;
        this.emps = new ArrayList<>();
    }

    public void addEMps(Emp emp) {
        this.emps.add(emp);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Emp> getEmps() {
        return emps;
    }

}
