package ProgramacionPrimero.src.Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class TitleCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getTittle().compareTo(o2.getTittle());
    }
}

public class Movie implements Comparable<Movie> {

    private double stars;
    private String  tittle;
    private int year;
    private String category;


    public Movie(double stars, String tittle, int year, String category) {
        this.stars = stars;
        this.tittle = tittle;
        this.year = year;
        this.category = category;
    }

    public double getStars() {
        return stars;
    }

    public String getTittle() {
        return tittle;
    }

    public int getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "stars=" + stars +
                "tittle='" + tittle + '\'' +
                "year=" + year +
                "category='" + category + '\'' +
                "}\n";
    }

    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie(4, "Z", 1978, "SCI"));
        movies.add(new Movie(3, "Spiderman 2", 2004, "Acción"));
        movies.add(new Movie(5, "El gato con botas 2", 2023, "Animación"));
        movies.add(new Movie(2, "ABC", 1990, "Terror"));

        System.out.println(movies);
        Collections.sort(movies);
        System.out.println(movies);
        Collections.sort(movies, new TitleCompare());
        System.out.println(movies);
    }

    @Override
    public int compareTo(Movie o) {
        if (this.getStars() == o.getStars()) {
            return 0;
        } else if (this.getStars() < o.getStars()) {
            return -1;
        } else {
            return -1;
        }
    }
}
