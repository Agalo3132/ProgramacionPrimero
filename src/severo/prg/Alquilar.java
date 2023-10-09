package ProgramacionPrimero.src.severo.prg;

import java.util.Scanner;

public class Alquilar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Elige el valor inicial");
        int inicial = sc.nextInt();
        System.out.println("Elige el valor limite");
        int limite = sc.nextInt();

        while (inicial <= limite) {
            System.out.println("inicial es: " + inicial);
            inicial = inicial + 1;
        }

        System.out.println("Termina el buclee");


        int clase = 7;
        int ordenador = 1;
        while (ordenador <= 24) {
            System.out.print("Este es el ordenador: " + clase + "." + ordenador);
            ordenador = ordenador + 1;
        }

        int num = 1;
        while (num <= 25) {
            System.out.println("El número es: " + num);
            num = num + 4;
        }


    }
}