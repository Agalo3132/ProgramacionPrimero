package ProgramacionPrimero.src.severo.prg.Arrays;

public class mult {


    public static void main(String[] args) {
        /**
        int[][] array = {{1,2,3},null,{2,3,1},{9,9,9,9},null};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                System.out.println("Fila vacia");
            } else {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print((array[i][j]));
                }
            }
        }
         **/

        int[][] int2d = new int[5][10];


        for (int i = 0; i < int2d.length; i++) {
            for (int j = 0; j < int2d[i].length; j++) {
                System.out.print(int2d[i][j]);
            }
            System.out.println();
        }

        int[][] ex = new int[52][7];

        for (int i = 0; i < ex.length; i++) {
            for (int j = 0; j < ex[i].length; j++) {
                ex[i][j] = 0;
            }
        }



    }
}
