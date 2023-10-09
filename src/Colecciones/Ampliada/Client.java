package ProgramacionPrimero.src.Colecciones.Ampliada;

import java.util.HashMap;
import java.util.Objects;

public class Client {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Client c1 = new Client();
        c1.setName("Alvaro");
        c1.setAge(18);

        Client c2 = new Client();
        c1.setName("Miguel");
        c1.setAge(33);

        Client c3 = new Client();
        c1.setName("Alvaro");
        c1.setAge(12);

        HashMap<Client, Integer> mapa = new HashMap<>();
        System.out.println(mapa.put(c1, 1));
        System.out.println(mapa.put(c1, 2));
        System.out.println(mapa.put(c1, 3));
        System.out.println(mapa.size());
    }
}
