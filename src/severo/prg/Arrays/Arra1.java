package ProgramacionPrimero.src.severo.prg.Arrays;

import ProgramacionPrimero.src.severo.prg.Coche;

import java.util.Arrays;
import java.util.Collections;

public class Arra1 {
    public void printArray(int[] array){
        array[0] = 7;
    }

    public void calcularMedia(int[] array){
        int media, suma = 0;
        for (int i = 0; i < array.length; i++){
            suma += array[i];
        }
        System.out.println(suma/ array.length);
    }

    public void calcularMedia(int[] array, int sexo){
        int media, suma = 0;
        for (int i = 0; i < array.length; i++){
            suma += array[i];
        }
        System.out.println(suma/ array.length);
    }


    public static void main(String[] args) {
        int [] array = new int[9];
        array [1] = 38;
        array [5] = 14;
        array[6]++;
        int [] array3 = new int[6];
        array3 [1] = 9;
        int i1 = array[1] + array[5];
        System.out.println(i1);
        System.out.println(array[6]);
        char[] array2 = new char[23];
        String[] aS = new String[3];
        Coche[] coches = new Coche[3];
        int [][] bidi = new int[3][3];
        char [] aarraay = {'p','a','t','r','i','c','i','a'};

        int [] aarraay1 = {10,20,30,40,50,60,70,80,90,100};
        int [] aarraay2 = new int[8];


        Collections.reverse(Arrays.asList(aarraay));
        System.out.println(aarraay);

        for (int i = aarraay.length -1; i >= 0; i--){
            System.out.println(aarraay[i]);
        }
        System.out.println(" ");
        System.out.println(aarraay2);
        System.out.println(" ");



        int suma = 0;
        for (int i = 0; i < array.length; i++){
            suma = suma + array[i];
        }

        for (int elemento: array) {
            System.out.println(elemento);
        }


        if (Arrays.equals(array, array3)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No");
        }

        for (int i = 0; i < array.length; i++){
            System.out.println("Elemento " + i + " valor " + array[i]);
        }




    }
}
