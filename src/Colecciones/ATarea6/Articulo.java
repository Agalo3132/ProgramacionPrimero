package ProgramacionPrimero.src.Colecciones.ATarea6;

import java.util.Objects;

/**
 * Vamos a alamcenar la información de los artículos. Nombre, precio y cantidad de existencias (stock)
 * Construimos el objeto con nombre y precio. El stock inicialmente es de cero
 * Generamos los 3 getters
 * Setter de precio solo almacenaré el precio si es mayor a cero, si no 0
 *
 * Método ajustarStock, añadir existencias al artículo, se le pasará una cantidad, solo lo haré si la cantidad es mayor a 0
 *
 * Sobreescribir los metodos equals y hashcode (dos articulos son iguales si tienen el mismo nombre)
 * Sobreescribir el metodo toString
 *
 * Querremos ordenar los articulos por nombre
 */

public class Articulo implements Comparable<Articulo> {
    private String nombre;
    private double precio;
    private int stock;

    public Articulo(String nombre, double precio) {
        this(nombre,precio,0);
    }

    public Articulo(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            this.precio = 0;
        }
    }

    public void ajustarStock(int cantidad) {
        if (this.stock+cantidad >= 0) {
            this.stock += cantidad;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Articulo articulo = (Articulo) o;
        return Objects.equals(nombre, articulo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre) + 31;
    }

    @Override
    public String toString() {
        return nombre+": " + precio;
    }

    @Override
    public int compareTo(Articulo o) {
        return nombre.compareTo(o.nombre);
    }
}
