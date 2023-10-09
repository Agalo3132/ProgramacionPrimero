package ProgramacionPrimero.src.Colecciones.ArrayListas;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList();
        ArrayList<Integer> numeros = new ArrayList<>();
        l.add(2);
        l.add(3);

        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
        l.set(0,1);
        System.out.println();
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
        l.add(0,4);
        System.out.println();
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
        l.remove(0);
        System.out.println();
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
    }

}
