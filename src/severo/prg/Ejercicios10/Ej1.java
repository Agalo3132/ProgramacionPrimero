package severo.prg.Ejercicios10;

public class Ej1 {

    public static void main(String[] args) {

        int pfs = calcularPosicionRankingPuntuaciones2(true, 1000, 1, 1);
        System.out.println(pfs);

        //int pf2 = calcularPosicionRankingPuntuaciones(true, 5000, 5, 10);

    }

    public static int calcularPosicionRankingPuntuaciones2(boolean gameOver, int puntuacion, int nivelCompletado, int bonus) {
        if (gameOver) {
            int puntuacionFinal = puntuacion + (nivelCompletado * bonus);
            puntuacionFinal += 100;
            int posicion = 4;
            if (puntuacion >= 1000) {
                posicion = 1;
            } else if (puntuacion >= 500 && puntuacion <= 1000) {
                posicion = 2;
            } else if (puntuacion >= 100 && puntuacion <= 500) {
                posicion = 3;
            }

            return posicion;
        }
        return -1;
    }

    public static void mostrarPosicionRankinPuntuaciones(String jugador, int posicion) {

        System.out.println(jugador + " consiguió llegar a la posición " + posicion + "en el ranking de puntuaciones");

    }

    public static int calcularPosicionRankingPuntuaciones(boolean gameOver, int puntuacion, int nivelCompletado, int bonus) {
        if (gameOver) {
            int puntuacionFinal = puntuacion + (nivelCompletado * bonus);
            puntuacionFinal += 100;
            return puntuacionFinal;
        }
        return -1;
    }



}
