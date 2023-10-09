package ProgramacionPrimero.src;

import java.util.Scanner;

public class Idea {
    public static void main(String[] args) {
        /**
        Scanner scan = new Scanner(System.in);
        int limite;
        int sumaTotal = 0;
        int sumaPar = 0;

        System.out.println("Introduce el valor limite");
        limite = scan.nextInt();

        int count = 1;

        while (count <= limite) {
            sumaTotal = sumaTotal + count;
            if (count % 2 == 0) {
                sumaPar = sumaPar + count;
            }

            count++;
        }

        System.out.println("Suma total: " + sumaTotal);
        System.out.println("\tSuma de valores pares: " + sumaPar);
        **/




        Scanner scan2 = new Scanner(System.in);
        System.out.println("Declara un número objetivo");
        int obj = scan2.nextInt();
        System.out.println("Inserta un número (0 para salir)");
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int num = scan.nextInt();
        int count = 1;
        int contador = 1;
        int contImpar = 0;
        int contObj = 0;
        int max = 0;

        while (count != 0) {
            System.out.println("Inserta un número (0 para salir)");
            total = total + num;
            num = scan.nextInt();
            contador++;
            if (num > max) {
                max = num;
            }

            if (num == obj) {
                contObj++;
            }

            if (num % 2 != 0) {
                contImpar = contImpar + 1;
            }

            if (num == 0) {
                contador--;
                count = 0;
            }
        }

        System.out.println("“La suma de los valores es " + total);
        System.out.println("Total de números insertados " + contador);
        System.out.println("Se han insertado " + contImpar + " números impares");
        System.out.println("El valor " + obj + " se insertó " + contObj + " veces");
        System.out.println("El máximo valor insertado es " + max);


        System.out.println("Introduce un numero");
        int num1 = scan.nextInt();
        System.out.println("Introduce otro numero");
        int num2 = scan.nextInt();
        System.out.println("Introduce el limite");
        int limite = scan.nextInt();
        int total2 = 0;
        int contador2 = 0;

        while (contador2 < limite) {
            int resultado = num1 + num2;
            num2 = num1;
            num1 = resultado;
            contador2++;
            System.out.println(resultado);
        }




    }
}