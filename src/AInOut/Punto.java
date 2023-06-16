package AInOut;

import java.util.ArrayList;
import java.util.List;

public class Punto {

    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        List<Punto> puntos = new ArrayList<>();
        puntos.add(new Punto(-4, -8));
        puntos.add(new Punto(-2, 9));
        puntos.add(new Punto(-1, -8));
        puntos.add(new Punto(0, -7));
        puntos.add(new Punto(1, 1));
        puntos.add(new Punto(2, 3));
        puntos.add(new Punto(2, 3));
        puntos.add(new Punto(2, -2));
        puntos.add(new Punto(4, -1));

        System.out.println(puntos.stream()
                .mapToInt(Punto::getX)
                .reduce(0, (ac, el) -> ac+ el));


        List<Punto> puntos2 = new ArrayList<>();
        puntos2.stream()
                .mapToInt(Punto::getX)
                .reduce((ac, el) -> ac+ el)
                .ifPresent(System.out::println);



    }
}
