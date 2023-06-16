package severo.prg.Tema3.Nullvalue;

public class Libro {

    private static int ejemplares;

    private String isbn;
    private String titulo;
    private String autor;

    //constructores
    public Libro(Libro libro) {
        this(libro.getIsbn(), libro.getTitulo(), libro.getAutor());
    }

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        incrementarEjemplares();
    }

    //getters y setters

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    //toString

    @Override
    public String toString() {
        return
                " ISBN: " + isbn + '\t' +
                " Titulo: " + titulo + '\t' +
                " Autor: " + autor + '\t' +
                "nº ejemplares: " + ejemplares;
    }


    //metodos de la clase
    public static void incrementarEjemplares() {
        ejemplares++;
    }

}
