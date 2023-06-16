package severo.prg.Ejercicio11;

public class Ejercicio2 {
    public static void main(String[] args) {

        System.out.println(sumarImpares(-1, 100));
    }

    public static boolean esImpar (int numero) {
        return (numero % 2 != 0);
    }

    public static int sumarImpares (int inicio, int fin) {
        int suma;
        if (inicio < 0 || fin < 0) {
            return -1;
        }
        if (esImpar(inicio)) {
            for (suma = 0; inicio <= fin; inicio += 2) {
                suma = suma + inicio;
            }
            return suma;
        } else {
            inicio++;
            for (suma = 0; inicio <= fin; inicio += 2) {
                suma = suma + inicio;
            }
            return suma;
        }
    }
}
