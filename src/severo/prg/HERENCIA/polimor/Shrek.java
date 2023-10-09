package ProgramacionPrimero.src.severo.prg.HERENCIA.polimor;

public class Shrek extends Pelicula {

    public Shrek() {
        super("Shrek");
    }

    @Override
    public void trama() {
        super.trama();
        System.out.println("Trata de la historia de un ogro...");
    }
}
