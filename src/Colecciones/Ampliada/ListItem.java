package ProgramacionPrimero.src.Colecciones.Ampliada;

public abstract class ListItem {
    protected ListItem enlaceIzq;
    protected ListItem enlaceDcho;
    protected String valor;

    public ListItem(String valor) {
        this.valor = valor;
    }

    public abstract ListItem next();

    public abstract ListItem setNext(ListItem item);

    public abstract ListItem previous();
    public abstract ListItem setPrevious(ListItem item);

    public abstract int compareTo(ListItem item);

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
