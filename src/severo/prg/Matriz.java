package ProgramacionPrimero.src.severo.prg;

public class Matriz {
    public static void main(String[] args) {


        /**
        for (int i = 0; i < 3; i++) {
            for (int j= 0; j < 4; j++) {
                System.out.print(("*") + " ");
            }
            System.out.println();
        }






        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                if (i != 0 && i != 4 && j != 0 && i != 4) {
                    System.out.print(" ");
                } else {
                    System.out.print(" "); System.out.print("*");
                }
                }
            System.out.println();
            }




        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }



        for (int i2 = 4; i2 > 0; i2--) {
            for (int j2 = 0; j2 < i2; j2++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
         **/



        for (int i = 1; i < 5; i++) {
            for (int a = 1; a <= 5; a++) {
                if (i > 1 && i < 4 && a > 1 && a < 5) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        int valor = 5;
        for (int i = 1; i <= 5; valor--, i++) {
            for (int a = 1; a <= 5; a++) {
                if (a >= valor) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j= 0; j < 4; j++) {
                System.out.print(("*") + " ");
            }
            System.out.println();
        }
        for (int i2 = 4; i2 > 0; i2--) {
            for (int j2 = 0; j2 < i2; j2++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }







    }
}
