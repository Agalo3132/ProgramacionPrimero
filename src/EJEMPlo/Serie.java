package EJEMPlo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Serie {
    private String titulo;
    private String director;
    private ArrayList<Episodio> episodios;


    public Serie(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
        this.episodios = new ArrayList<>();
    }

    public boolean agregarEpisodio(String titulo, int duracion) {
        if (encontrarEpisodio(titulo) == null) {
            episodios.add(new Episodio(titulo, duracion));
            return true;
        }
        return false;
    }


    private Episodio encontrarEpisodio(String titulo) {
        for (int i = 0; i < episodios.size(); i++) {
            if (episodios.get(i).getTitulo().equals(titulo)) {
                return episodios.get(i);
            }
        }
        return null;
    }

    public boolean agregarAListaReproduccion(int numEp, LinkedList<Episodio> listaReproduccion) {
        numEp--;
        for (int i = 0; i < episodios.size(); i++) {
            if (numEp > 0 && numEp <= listaReproduccion.size()) {
                listaReproduccion.add(numEp, episodios.get(i));
                return true;
            }
        }
        return false;
    }

    public boolean agregarAListaReproduccion(String titulo, LinkedList<Episodio> listaReproduccion) {
        for (int i = 0; i < episodios.size(); i++) {
            if (encontrarEpisodio(titulo) != null) {
                listaReproduccion.add(encontrarEpisodio(titulo));
                return true;
            }
        }
        return false;
    }

}