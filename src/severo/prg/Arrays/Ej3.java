package severo.prg.Arrays;

public class Ej3 {
    public static void main(String[] args) {
        int[] array = {-35,-13,-77,-46,-82,-2,-26};
        int min = array[0];

        for (int i = 0; i < array.length -1; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
