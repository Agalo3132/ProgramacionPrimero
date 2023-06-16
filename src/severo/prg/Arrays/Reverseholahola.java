package severo.prg.Arrays;

public class Reverseholahola {
    public static void reverse(int[] array){
        int[] arrayfalso = array.clone();
        for (int valor = 0; valor < array.length; valor++){
            array[valor] = arrayfalso[array.length -1 -valor];
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4};
        System.out.println(array[0]+" "+array[1]+" "+array[2]+" "+array[3]);
        reverse(array);
        System.out.println(array[0]+" "+array[1]+" "+array[2]+" "+array[3]);
    }


}
