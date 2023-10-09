package ProgramacionPrimero.src.severo.prg.HERENCIA.inetrfaces;

public class SpiderCerdo extends Persona implements SuperHeroe {
    public SpiderCerdo(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void activarSuperpoder() {
        System.out.println("Se ha activado el superpoder");
    }

    @Override
    public void desactivarSuperpoder() {
        System.out.println("Se ha desactivado el superpoder");
    }
}
