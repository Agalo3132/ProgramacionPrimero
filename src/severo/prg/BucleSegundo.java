package severo.prg;

import java.util.Scanner;

public class BucleSegundo {











    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");

        int num = sc.nextInt();
        for (;num > 0; num = num/10) {
            int ultimoDigito = num % 10;
            System.out.println(" " + ultimoDigito);
        }


        for (int kk = 0; kk < 12 && kk > 0; kk--) {
            System.out.println(kk);
        }






        /**
        for(int i = 0; i < 100; i++) {
            if(i == 0){
            }
            System.out.println(i);
        }
        **/
        /**
        for(int i = 10; i >= 1;) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer");
            System.out.print("Take one down, pass it around, ");
            i--;
            System.out.println(i + " bottles of beer on the wall");
        }
        **/









    }
}
