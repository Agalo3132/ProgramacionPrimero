package severo.prg.morralla;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NewEjemplo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = 0;
        try {
            numero = sc.nextInt();
            System.out.println("Se ejecuta");
            System.out.println(numero/0);
            int div = sc.nextInt();
            if (div == 0) {
                throw new ArithmeticException("Estas dividiendo entre cero");
            } else {
                System.out.println(numero / div);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Se ha introducido texto que no es un número");
        } catch (ArithmeticException exception) {
            System.out.println("Se ha dividido entre 0");
        } catch (Exception exception) {

        } finally {
            //Siempre se ejecuta
            System.out.println("Finally");
            sc.close();
        }
        System.out.println("El numero introducido es: " + numero);

        try {
            double d = Math.random();
            if (d > 0.95)
                throw new ArithmeticException(d + " está fuera de rango") ;
            System.out.println("El número es " + d);
            double j = Math.random();
            if (j > 0.5)
                throw new ArithmeticException(j + " está fuera de rango") ;
            System.out.println("El número es " + j);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
