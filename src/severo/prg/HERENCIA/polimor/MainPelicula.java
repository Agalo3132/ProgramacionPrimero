package severo.prg.HERENCIA.polimor;

public class MainPelicula {

    public static Pelicula crearPeliculaAleatorio() {
        int numero = (int) (Math.random() * 3) + 1;
        System.out.println(numero);
        switch (numero) {
            case 1:
                return new Shrek();
            case 2:
                return new ElGatoConBotas();
            case 3:
                return new RandomPeli();
        }
        return null;
    }


    public static void main(String[] args) {
        Pelicula p = new Shrek();
        //DOWNCASTING
        Shrek s = (Shrek) p;


        for (int i = 0; i < 3; i++) {
            Pelicula pelicula = crearPeliculaAleatorio();
            pelicula.trama();
        }
    }
}
