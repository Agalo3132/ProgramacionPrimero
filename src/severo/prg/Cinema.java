package ProgramacionPrimero.src.severo.prg;

public class Cinema {

    public static void seeMovie(double ticket, int stars) {

        if (ticket < 5.00) {
            System.out.println("Very");
        } else if (ticket >= 12.00 || stars < 5){
            System.out.println("Not");
        } else if (ticket <= 12.00 && stars == 5) {
            System.out.println("Very");
        } else if (ticket > 5.00 && ticket < 12.00 && stars >= 2 && stars <= 4) {
            System.out.println("sort-of");
        } else {
            System.out.println("Not");
        }
    }

    public static void main(String[] args) {
        seeMovie(11.00, 5);
    }
}
