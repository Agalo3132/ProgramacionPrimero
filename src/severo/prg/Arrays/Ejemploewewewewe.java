package severo.prg.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejemploewewewewe {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        /**
        int[] array = new int[10];
        for (int i = 0; i < array.length -1; i++){
            System.out.println("Escribe un número");
            array[i] = str.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Escribe un número");
        int num = str.nextInt();
        System.out.println("Escribe su posición");
        int pos = str.nextInt();
        for (int i = args.length -1; i > pos; i--) {
            array[i] = array[i-1];
        }
        array[pos] = num;
        System.out.println(Arrays.toString(array));
         **/

        int[] array2 = new int[10];
        for (int i = 0; i < 5; i++){
            System.out.println("Escribe un número");
            array2[i] = str.nextInt();
        }
        for (int i = 6; i <= array2.length; i++){
            System.out.println("Esctibe un número");
            int num2 = str.nextInt();
            array2[i] = num2;
            Arrays.sort(array2);
        }



    }
}
