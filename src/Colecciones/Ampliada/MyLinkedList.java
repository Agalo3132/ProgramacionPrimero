package ProgramacionPrimero.src.Colecciones.Ampliada;

public class MyLinkedList implements NodeList {

    private ListItem raiz;

    public MyLinkedList(ListItem raiz) {
        this.raiz = raiz;
    }

    @Override
    public ListItem getRaiz() {
        return raiz;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (raiz == null) {
            raiz = item;
            return true;
        } else {
            ListItem itemActual = raiz;
            while (itemActual != null) {
                if (itemActual.next() != null) {
                    itemActual = itemActual.next();
                } else {
                    itemActual.setNext(item);
                    item.setPrevious(itemActual);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (raiz == null) {
            return false;
        } else {
            ListItem itemActual = raiz;
            while (itemActual != null) {
                int compare = itemActual.compareTo(item);
                if (compare == 0) {
                    if (itemActual == raiz) {
                        raiz = itemActual.next();
                    } else {
                        itemActual.previous().setNext(itemActual.next());
                        if (itemActual != null) {
                            itemActual.next().setPrevious(itemActual.previous());
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void print(ListItem item) {
        if (raiz == null) {
            System.out.println("Lista vacía");
        } else {
            ListItem itemActual = raiz;
            while (itemActual != null) {
                System.out.println(itemActual.getValor());
                itemActual = itemActual.next();
            }
        }
    }
}
