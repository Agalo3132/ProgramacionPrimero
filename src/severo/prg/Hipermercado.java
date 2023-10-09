package ProgramacionPrimero.src.severo.prg;

import java.util.Scanner;

public class Hipermercado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Pon el precio");
        num = sc.nextDouble();

        if (num > 300) {
            num = (num + (num * 0.05));
            System.out.println("El precio es: " +num);
        } else {
            System.out.println("El precio es:" + num);
        }
    }
}
