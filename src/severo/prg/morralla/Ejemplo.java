package severo.prg.morralla;

public class Ejemplo {
    public static void main(String[] args) {

        /**
        for (int i = 0; i < 10; i++) {
            if (i == 3)
                break;
            System.out.print(i + " ");
        }

        System.out.println("Fuera del bucle for");
         **/




        for (int i=0; i<4; i++) {
            for (int j=i; j>=0; j--)
                System.out.print(j);
            System.out.println(); }



        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                if(i == 4)
                    break;
                System.out.print(j);
            }
            System.out.println( );
        }

    }
}
