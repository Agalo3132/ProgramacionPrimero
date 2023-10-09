package ProgramacionPrimero.src.Colecciones.Ampliada;

import java.util.ArrayList;
import java.util.List;

public class Jugador extends Personaje implements Saveable {
    private String nombre;
    private String arma;
    private int hitPoints;
    private int fuerza;

    public Jugador(String nombre, int hitPoints, int fuerza) {
        super(nombre, hitPoints, fuerza);
        this.arma = "Espada";
    }

    public String getArma() {
        return arma;
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(nombre);
        list.add(arma);
        list.add("" + hitPoints);
        list.add(String.valueOf(fuerza));
        return list;
    }

    @Override
    public void read(List<String> list) {
        if (list != null && list.size() > 0) {
            nombre = list.get(0);
            this.arma = list.get(1);
            hitPoints = Integer.parseInt(list.get(2));
            fuerza = Integer.parseInt(list.get(3));
        }
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", arma='" + arma + '\'' +
                ", hitPoints=" + hitPoints +
                ", fuerza=" + fuerza +
                '}';
    }
}
