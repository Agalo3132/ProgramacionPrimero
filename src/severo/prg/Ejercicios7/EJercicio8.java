package ProgramacionPrimero.src.severo.prg.Ejercicios7;

public class EJercicio8 {
    public static void main(String[] args) {

        /**
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
         **/



        /**
        try {
            for (int k = 0; k < 5; k++) {
                System.out.println(100 / k);
            }
        } catch (ArithmeticException exception) {
            System.out.println("Se está dividiendo entre 0");
        }
         **/


            /**
            throw new (ArithmeticException) {
                    System.out.println("Se ha dividido entre 0")
            }
             **/

            /**
            int m = 1000;
            try {
                System.out.println("Entrando en el try");
                if (m > 100)
                    throw new Exception(m + " es muy grande");

                System.out.println("Saliendo del bloque try");
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
             **/


            /**
        Scanner sc =new Scanner(System.in);
        System.out.println("Escribe un número");
        int x = sc.nextInt();
        try {
            if (x < 0) {
                throw new Exception("valor negativo en la coordenada " + x);
            }
        } catch (Exception ee) {
            System.out.println("ERROR: " + ee.getMessage());
        }
             **/




            /**
        Scanner sc = new Scanner(System.in);
        String h = sc.next();
        System.out.println("Escribe un numero");
        int x = sc.nextInt();

        try {
            if () {
                throw new InputMismatchException("Solo se permiten números");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
             **/



    }
}
