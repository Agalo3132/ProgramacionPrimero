package ProgramacionPrimero.src.severo.prg;

/**
 * Tendremos un atributo llamado "Lista" será un array de enteros
 * Un atributo maxTam de tipo int que guarda la longitud del array
 *
 * El constructor crea e inicializa el array(lista) con un tamaño de diez elementos
 *
 * Método: privado resize(), le cambio a la lista porque me he quedado sin huecos
 *
 * Método: void addItem(int item), añade un item al final de la lista,
 * Si la lista está llena, incrementa la lista con 10 elementos más y lo inserto en la posición que toca
 *
 * Método: void print(), que imprima la lista con los datos que se han insetado
 *
 * Método: int lenght(), devuelve el tamaño de la lista, es decir, los elementos que se han insertado
 *
 * Método: public int remove(), elimina el ultimo elemento insertado,y lo devuelve
 *
 * Método: void copy(int[] array), copia los elementos que tengo en lista, en el array que me pasan
 * Luego digo que lista es igual a ese array
 *
 * Refactorizar: en los sitios que hemos copiado y llamaremos al método. En el método resize y remove
 *
 * Método: int get(int index), devuelve el elemento que está en ese índice
 *
 * Método: void addItem(int item, int index) --> añade el item en esa posicion
 * Método: int remove(int index), elimina el dato contenido en este indice y devuelve el dato eliminado
 */


public class Lista {
    public static final int DEFAULT_INCREMENT_SIZE = 10;
    private int[] lista;
    private int current;


    public Lista() {
        lista = new int[DEFAULT_INCREMENT_SIZE];
    }

    public void copy(int[] array) {
        for (int i = 0; i < current; i++) {
            array[i] = lista[i];
        }
        lista = array;
    }

    private void resize() {
        int[] newLista = new int[lista.length + DEFAULT_INCREMENT_SIZE];
        copy(newLista);
    }


    public void add(int item) {
        if (current >= lista.length) {
            resize();
        }
        lista[current] = item;
        current++;
    }

    public void print() {
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i] + " ");
        }
        System.out.println();
    }

    public int length() {
        return current;
    }

    public int remove() {
        current -= 1;
        int remove = lista[current];
        lista[current] = 0;

        if (current % DEFAULT_INCREMENT_SIZE == 0) {
            int[] newLista = new int[lista.length-DEFAULT_INCREMENT_SIZE];
            copy(newLista);
        }
      return remove;
    }

    public int get(int index){
        return lista[index];
    }

    public void add(int item, int indice){
        if (indice > lista.length) {
            resize();
        } else {

        }
    }

    public int remove(int index) {
        int remove = lista[index];


        return remove;
    }




}
