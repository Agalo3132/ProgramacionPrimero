package Colecciones.ATarea6;

public class MainCarrito {
    private static StockList stocklist = new StockList();

    public static int sellItem(Cesta cesta, String nombreArt, int cantidad) {
        Articulo articulo = stocklist.get(nombreArt);
        if (articulo == null) {
            System.out.println("No vendemos ese articulo");
            return 0;
        } else {
            if (stocklist.sellStock(nombreArt, cantidad) != 0 ) {
                cesta.addCesta(articulo, cantidad);
                return cantidad;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("Leche", 1.0, 100);
        Articulo articulo2 = new Articulo("Natillas", 2.0, 20);
        Articulo articulo3 = new Articulo("Agua", 0.5, 50);
        Articulo articulo4 = new Articulo("Pepsi", 1.2, 10);
        Articulo articulo5 = new Articulo("Natillas de chocolate", 2.1, 5);
        stocklist.addStock(articulo1);
        stocklist.addStock(articulo2);
        stocklist.addStock(articulo3);
        stocklist.addStock(articulo4);
        stocklist.addStock(articulo5);

        Cesta cesta = new Cesta("Cesta de Álvaro");
        sellItem(cesta, "Agua", 1);
    }

}
