package ProgramacionPrimero.src.severo.prg.Arrays;

import java.util.Arrays;

public class Counnnnting {
    public static void counting(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int[] recuento = new int[max+1];
        for (int i = 0; i < array.length; i++) {
            int elemento = array[i];
            recuento[elemento]++;
        }

        for (int i = 1; i < recuento.length; i++) {
            recuento[i] += recuento[i-1];
        }

        int[] sorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sorted[recuento[array[i]]-1] = array[i];
            recuento[array[i]]--;
        }


    }

    public static void main(String[] args) {
        int[] array = {4,2,2,8,3,3,1};
        counting(array);
        System.out.println(Arrays.toString(array));

    }
}
