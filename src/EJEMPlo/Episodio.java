package ProgramacionPrimero.src.EJEMPlo;

public class Episodio {
    private String titulo;
    private int duracion;

    public Episodio(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return titulo + ": " + duracion + " minutos";
    }
}

