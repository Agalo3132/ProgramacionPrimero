package ProgramacionPrimero.src.severo.prg.Arrays;

public class Resull {
    public static int minGap(int[] array) {
        array[0] = 1;
        array[1] = 3;
        array[2] = 6;
        array[3] = 7;
        array[4] = 12;

        int min = 0;
        if (array.length > 1) {
            for (int i = 0; i <= array.length - 1; i++) {
                if ((array[i] - array[i+1]) < min) {
                    min = Math.abs(array[i] - array[i+1]);
                }
                return min;
            }


        }
        return min;
    }





    public static void main(String[] args) {

    }
}
