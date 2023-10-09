/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProgramacionPrimero.src.severo.prg.Entornos;

/**
 *
 * @author Miguel-David Orrico
 */
public class Libro implements Cloneable{
    protected String autor;
    protected String titulo;
    protected int anyoPrimeraEdicion;
    private static boolean formatoLargo=true;

    /**
     * @return El nombre del autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor Nombre del autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return título del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo Título del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return Año de la primera Edición
     */
    public int getAnyoPrimeraEdicion() {
        return anyoPrimeraEdicion;
    }

    /**
     * @param anyoPrimeraEdicion Año de la primera edición
     */
    public void setAnyoPrimeraEdicion(int anyoPrimeraEdicion) {
        this.anyoPrimeraEdicion = anyoPrimeraEdicion;
    }
    
    
    /**
     * Si no se sabe el autor, se tomará como Anónimo
     * @param titulo título del libro
     * @param anyo Año de la primera edición
     */
    public Libro(String titulo,int anyo){
        this.titulo=titulo;
        this.autor="Anonimo";
        this.anyoPrimeraEdicion=anyo;
    }
    /**
     * Un nuevo libro con todos sus datos
     * @param titulo título del libro
     * @param autor Autor del libro
     * @param anyo Año de la primera edición
     */
    public Libro(String titulo,String autor,int anyo){
        this(titulo,anyo);
        this.autor=autor;
    }
    /**
     * Un nuevo libro a partir de otro (constructor copia)
     * @param l
     */
    public Libro(Libro l){
        this.anyoPrimeraEdicion=l.getAnyoPrimeraEdicion();
        this.autor=l.getAutor();
        this.titulo=l.getTitulo();
    }
    
    @Override
    public String toString() {

        String salida;
        if (formatoLargo) {
            salida = "-----------------------------\n";
            salida += "Autor:  " + this.autor;
            salida += "\nTitulo: " + this.titulo;
            salida += "\nPrimera Edicion:" + this.anyoPrimeraEdicion;
        } else {
            salida = this.titulo + " de " + this.autor;
            salida += " Editado en: " + this.anyoPrimeraEdicion;
        }
        return salida;
    }
    
    @Override
    public Libro clone(){
        Libro nuevoLibro=null;
        try{
            nuevoLibro=(Libro) super.clone();
        }
        catch (CloneNotSupportedException ex){
            System.out.println("Error al duplicar");
        }      
        return nuevoLibro; 
    }
    @Override
    public boolean equals(Object obj){
        boolean resultado;
        if(obj==null){
            resultado=false;
        }
        else{
            if(!(obj instanceof Libro)){
                resultado=false;
            }
            else{
                Libro libroTemporal=(Libro) obj;
                boolean autoresIguales,titulosIguales,anyosIguales;
                autoresIguales=this.autor.equals(libroTemporal.autor);
                titulosIguales=this.titulo.equals(libroTemporal.titulo);
                anyosIguales=this.anyoPrimeraEdicion==libroTemporal.anyoPrimeraEdicion;
                resultado=autoresIguales && titulosIguales && anyosIguales;
            }
        }
        return resultado;
    }
    /**
     * Establece el formato de la salida para los libros
     * @param largo Pone el formato largo (true) o el formato corto(false)
     */
    public static void setFormatoLargo(boolean largo){
        formatoLargo=largo;
    }
    
}
