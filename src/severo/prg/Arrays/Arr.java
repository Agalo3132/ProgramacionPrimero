package severo.prg.Arrays;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] array = {18,7,4,24,11};
        percenteEven(array);
        stretch(array);
    }

    public static void percenteEven(int[] array){
        double porcentaje = 0.0;
        for (int i = 0; i < array.length; i++){
            if ( array[i] % 2 == 0) {
                porcentaje++;
            }
        }
        porcentaje = porcentaje/ array.length * 100;
        System.out.println(porcentaje);
    }


    public static void stretch(int[] array){
        System.out.println(Arrays.toString(array));
        int[] array2 = new int [array.length*2];

        int n = 0;
        for (int i = 0, j = 0; i < array.length; i++, j+=2) {
            n = array[i] / 2 + array[i] % 2;
            array2[j] = n;
            array2[j+1] = array[i] - n;
        }

        System.out.println(Arrays.toString(array2));
    }

}
