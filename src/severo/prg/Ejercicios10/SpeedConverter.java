package severo.prg.Ejercicios10;

public class SpeedConverter {
    public static void main(String[] args) {

        toMilesPerHour(-1);
        printConversion(323123);

    }


    public static double toMilesPerHour(double KilometersPerHour) {

        if (KilometersPerHour < 0) {
            System.out.println("Valor inválido");
        } else {
            Math.round(KilometersPerHour);
        }
        return KilometersPerHour;
    }

    public static void printConversion(double KilometersPerHour) {

        double millas = KilometersPerHour/1.609;
        System.out.println(millas);


    }

}


