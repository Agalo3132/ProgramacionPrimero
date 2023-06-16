package Colecciones.Ampliada;

public class Node extends ListItem{

    public Node(String valor) {
        super(valor);
    }

    @Override
    public ListItem next() {
        return enlaceDcho;
    }


    @Override
    public ListItem setNext(ListItem item) {
        enlaceDcho = item;
        return item;
    }

    @Override
    public ListItem previous() {
        return enlaceIzq;
    }

    @Override
    public ListItem setPrevious(ListItem item) {
        enlaceIzq = item;
        return item;
    }

    @Override
    public int compareTo(ListItem item) {
        return this.valor.compareTo(item.getValor());
    }

}
