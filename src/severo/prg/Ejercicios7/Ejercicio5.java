package severo.prg.Ejercicios7;

public class Ejercicio5 {
    public static void main(String[] args) {

        /**
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
         **/

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                if (j == i) {
                    System.out.print("");
                }
                System.out.print("*");
            }
            System.out.println();
        }



        for (int i = 1; i <= 5; i++){
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        for (int i = 1; i <= 5; i++){
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 1; i <= 3; i++) {
            if (i == 1 || i == 3) {
                System.out.print("+");
                for (int j = 0; j < 5; j++) {
                    System.out.print("<>");
                }
                System.out.print("+");
            } else {
                System.out.println(" ");
                for (int j = 0; j < 12; j++) {
                    if (j == 0 || j == 11) {
                        System.out.print("|");
                    } else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}
