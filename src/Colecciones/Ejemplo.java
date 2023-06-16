package Colecciones;

import java.util.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Persona {

    private String name;
    private int id;

    Persona(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id == persona.id && Objects.equals(name, persona.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}

public class Ejemplo {
    public static void main(String[] args) {

        Set<Persona> conj = new HashSet<>();
        conj.add(new Persona("alavaro",18));
        conj.add(new Persona("alvaro", 18));

        Iterator<Persona> personaIterator = conj.iterator();




        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(2);
        conjunto.add(33);
        conjunto.add(47);
        conjunto.add(2);

        Iterator<Integer> it = conjunto.iterator();


        while (it.hasNext()) {
            if (it.next() == 2) {
                it.remove();
            }
        }

        it = conjunto.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        List<String> list = new ArrayList<>();


    }
}
