package ProgramacionPrimero.src.severo.prg.Tema3;

public class MinutosSegundos {

    public static String obtenerMensajeDuracion(int minutos, int segundos) {
        int hora = 0;

        if (minutos < 0) {
            return "Valor inválido";
        } else {
            while (minutos >= 60) {
                hora++;
                minutos = minutos - 60;
            }
        }
        return hora + " h " + obtenerMensajeDuracion(segundos) + " s " ;
    }

    public static String obtenerMensajeDuracion(int segundos) {
        int minutos = 0;
        if (segundos < 0) {
            return "Valor inválido";
        } else {
            while (segundos >= 60) {
                minutos++;
                segundos = segundos - 60;
            }
        }

        return minutos + " m " + segundos + " s ";
    }


    public static void main(String[] args) {
        System.out.println(obtenerMensajeDuracion(180, 121));
        System.out.println(obtenerMensajeDuracion(3600));

    }
}
