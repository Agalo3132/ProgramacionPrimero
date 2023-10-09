package ProgramacionPrimero.src.severo.prg;

import java.util.Scanner;

public class positivo {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingresa un número");
        num = sc.nextInt();

        if (num > 0) {
            System.out.println("El número X es positivo”, siendo X el número introducido por teclado");
            System.out.println("Todos los números positivos son mayores a cero");
        } else {
            System.out.println("El número  es negativo");
        }
    }

}
