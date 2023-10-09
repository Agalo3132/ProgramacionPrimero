package ProgramacionPrimero.src.severo.prg;

import java.util.Scanner;

public class tarea {

    public static void main (String[] args) {


        Scanner sc = new Scanner(System.in);
        boolean isOwner = true;
        System.out.println("¿Eres el propietario de la máquina?(Introduce true o false)");
        isOwner = sc.nextBoolean();

        if (isOwner == true) {
            System.out.println("Hola, bienvenido al sistema");
            Scanner sc11 = new Scanner(System.in);

        } else {
            System.out.println("No eres el propietario");
        }
    }
}
