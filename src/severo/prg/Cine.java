package ProgramacionPrimero.src.severo.prg;

import java.util.Scanner;

public class Cine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int age = 0;
        System.out.println("Introduce tu edad");
        age = scan.nextInt();

        if (age < 18 ) {
            System.out.println("Se le aplicará la tarifa de niño");
        } else {
            System.out.println("Se le aplicará la tarifa de adulto");
        }
        System.out.println("Disfruta la pelicula");
        }

    }

