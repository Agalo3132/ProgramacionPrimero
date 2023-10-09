package ProgramacionPrimero.src.severo.prg.Arrays;

import java.util.Arrays;

public class Bubbbble {
    public static void bubble (int[] array) {

        boolean ordenado = false;

        while (!ordenado) {
            ordenado = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    ordenado = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] array = {24,18,90,1,0,85,34,18};
        bubble(array);
        System.out.println(Arrays.toString(array));

    }
}
