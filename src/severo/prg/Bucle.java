package ProgramacionPrimero.src.severo.prg;

public class Bucle {
    /**
     * Voy a comprobar si los digitos son impares
     * Si todos los numeros son impares devuelvo true
     * Si hay al menos un par, devuelve false
    **/

    public static boolean allDigititsOdd(int numero){

        boolean resultado = true;

        int digitoMenoSig;
        while (numero >= 10) {
            digitoMenoSig = numero % 10;
            if (digitoMenoSig % 2 == 0) {
                return false;
            } else {
                numero = numero / 10;
            }
        }


        return resultado;


    }

    public static int sumaDigitos(int numero2){

        int suma = 0;
        int digitoMenosSig;
        //549 = 5 + 4 + 9 = 18
        while (numero2 > 0) {
            digitoMenosSig = numero2 % 10;
            suma = suma + digitoMenosSig;
            numero2 = numero2 / 10;


        }



        return suma;
    }

    public static void main(String[] args) {

        System.out.println(allDigititsOdd(1523));
        System.out.println(allDigititsOdd(7));

        System.out.println(sumaDigitos(234));
        System.out.println(sumaDigitos(2317841));



        /**
        int x = 123;

        int unidad = x % 10;//3
        int numero = x / 10;//12

        int dos = numero % 10;//2
        int n = numero / 10;//1
        **/


    }
}