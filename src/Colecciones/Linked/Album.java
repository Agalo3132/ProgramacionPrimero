package ProgramacionPrimero.src.Colecciones.Linked;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String nombre;
    private String artista;
    private ArrayList<Song> canciones;
    public Album(String nombre, String artista) {
        this.nombre = "Jordi";
        this.artista = "Maroon 5";
        this.canciones = new ArrayList<Song>();
    }
    public boolean addSong(String titulo, double duracion){
        if (findSong(titulo) == null) {
            return this.canciones.add(new Song(titulo,duracion));
        }
        return false;
    }
    public Song findSong(String titulo){
        for (int i = 0; i < canciones.size(); i++) {
            if (canciones.get(i).getTitulo().equals(titulo)) {
                return canciones.get(i);
            }
        }
        return null;
    }
    public boolean addToPlayList(int numPista, LinkedList<Song> playlist) {
        if (numPista > 0 && numPista <= canciones.size()) {
            Song cancion = canciones.get(numPista - 1);
            if (cancion != null) {
                return playlist.add((cancion));
            }

        }
        return false;
    }


    public boolean addToPlayList(String titulo, LinkedList<Song> playlist){
        Song song = findSong(titulo);
        if (song != null) {
            return playlist.add(song);
        }
        return false;
    }
}