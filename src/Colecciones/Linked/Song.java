package Colecciones.Linked;

public class Song {
    private String titulo;
    private double duracion;
    public Song(String titulo, double duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }
    public String getTitulo() {
        return titulo;
    }
    @Override
    public String toString() {
        return titulo + ":" + duracion;
    }
}
