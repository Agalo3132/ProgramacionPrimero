package Colecciones.Ampliada;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
    protected String nombre;
    protected int hitPoints;
    protected int fuerza;

    public Personaje(String nombre, int hitPoints, int fuerza) {
        this.nombre = nombre;
        this.hitPoints = hitPoints;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getFuerza() {
        return fuerza;
    }

    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(nombre);
        list.add("" + hitPoints);
        list.add(String.valueOf(fuerza));
        return list;
    }

    public void read(List<String> list) {
        if (list != null && list.size() > 0) {
            nombre = list.get(0);
            hitPoints = Integer.parseInt(list.get(2));
            fuerza = Integer.parseInt(list.get(3));
        }
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", hitPoints=" + hitPoints +
                ", fuerza=" + fuerza +
                '}';
    }
}
