package severo.prg.HERENCIA.polimor;

public class ElGatoConBotas extends Pelicula{

    public ElGatoConBotas() {
        super("El gato con botas");
    }

    @Override
    public void trama() {
        super.trama();
        System.out.println("Hay un gato con botas que es español");
    }
}
