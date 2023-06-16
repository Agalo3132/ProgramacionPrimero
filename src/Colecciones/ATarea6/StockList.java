package Colecciones.ATarea6;

import java.util.HashMap;
import java.util.Map;

public class StockList {
    private Map<String, Articulo> existencia;

    public StockList() {
        this.existencia = new HashMap<>();
    }

    public int addStock(Articulo articulo) {
        if (articulo != null) {
            Articulo a =existencia.get(articulo.getNombre());
            if (a != null) {
                articulo.ajustarStock(a.getStock());
            }
            existencia.put(articulo.getNombre(), articulo);
            return articulo.getStock();
        }
        return 0;
    }

    public int sellStock(String nombre, int cantidad) {
        Articulo a = existencia.get(nombre);
        if (a != null && cantidad > 0 && a.getStock() >= cantidad) {
            a.ajustarStock((-cantidad));
            return cantidad;
        }
        return 0;
    }

    public Articulo get(String nombre) {
        return existencia.get(nombre);
    }

    @Override
    public String toString() {
        String s = "Lista de articulos: \n";
        double costaTotal = 0;
        for (Articulo a: existencia.values()) {
            double costeArt = a.getStock() * a.getPrecio();
            s += a + ". Total" + costeArt + "\n";
            costaTotal+=costeArt;
        }
        s+="Valor total de existencias " + costaTotal;
        return s;
    }
}
