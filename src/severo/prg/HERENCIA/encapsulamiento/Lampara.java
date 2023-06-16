package severo.prg.HERENCIA.encapsulamiento;

public class Lampara {
    private String estilo;
    private boolean batería;
    private int calificacion;

    public Lampara(String estilo, boolean batería, int calificacion) {
        this.estilo = estilo;
        this.batería = batería;
        this.calificacion = calificacion;
    }

    public static void encender() {
        System.out.println("La lampara se ha encendido");
    }

    public String getEstilo() {
        return estilo;
    }

    public boolean hayBateria() {
        return batería;
    }

    public int getCalificacion() {
        return calificacion;
    }
}

