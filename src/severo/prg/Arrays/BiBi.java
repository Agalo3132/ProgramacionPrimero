package ProgramacionPrimero.src.severo.prg.Arrays;

public class BiBi {
    public static int eXa (int[] array, int key) {
        int low = 0;
        int high = array.length -1;
        int mid;

        while (low <= high) {
            mid = (low + high)/2;
             if (key > array[mid]) {
                low = mid + 1;
            } else if (key < array[mid]) {
                high = mid - 1;
            } else {
                 return mid;
             }
        }
        return -1;


    }

    public static void main(String[] args) {
        int[] array = {2,4,6,8,10,12,14,16,18,20,22,24,26,28};
        System.out.println(eXa(array,21));
    }
}
