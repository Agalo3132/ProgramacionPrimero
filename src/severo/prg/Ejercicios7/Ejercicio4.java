package severo.prg.Ejercicios7;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j= 0; j < 4; j++) {
                System.out.print(("*") + " ");
            }
            System.out.println();
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura");
        int altura = sc.nextInt();
        System.out.println("Introduce el ancho");
        int ancho = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
