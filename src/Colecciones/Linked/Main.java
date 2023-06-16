package Colecciones.Linked;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<Album>();
        Album album1 = new Album("Me comí una salchipapa", "DJ Ariel Style");
        album1.addSong("Me comi una salchipapa", 0.18);
        album1.addSong("El himno de la URSS", 2.58);
        album1.addSong("Bing chilling remix", 3.11);
        Album album2 = new Album("El juego de Amogus", "King pantera");
        album2.addSong("El juego de Amogus", 1.30);
        album2.addSong("El botsito agresivo", 0.23);
        album2.addSong("Chug jug with you", 2.59);
        Album album3 = new Album("Loonboon", "Laura shigihara");
        album3.addSong("Hay un zombie en el jardin", 1.47);
        album3.addSong("Dr. Zomboss theme", 2.47);
        album3.addSong("Loonboon", 3.42);
        LinkedList<Song> playlist = new LinkedList<Song>();
        album1.addToPlayList("Bing chilling remix", playlist);
        album2.addToPlayList("El juego de Amogus", playlist);
        album3.addToPlayList(2, playlist);
    }
    public static void menu(LinkedList<String> listaReproduccion) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        ListIterator<String> it = listaReproduccion.listIterator();
        if (listaReproduccion.isEmpty()) {
            System.out.println("No hay canciones en la lista de reproducción");
            return;
        } else {
            System.out.println("Visitando " + it.next());
            imprimirMenu();
        }
        boolean haciaAdelante = true;
        while(continuar) {
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 0:
                    System.out.println("Se acabó la playlist");
                    continuar = false;
                    break;
                case 1:
                    if (!haciaAdelante) {
                        if (it.hasNext())
                            it.next();
                        haciaAdelante = true;
                    }
                    if (it.hasNext()) {
                        System.out.println("Escuchando " + it.next());
                    } else {
                        System.out.println("Ya no hay más canciones");
                        haciaAdelante = false;
                    }
                    break;
                case 2:
                    if(haciaAdelante) {
                        if (it.hasPrevious())
                            it.previous();
                        haciaAdelante = false;
                    }
                    if (it.hasPrevious()) {
                        System.out.println("Escuchando " + it.previous());
                    }
                    break;
                case 3:
                    haciaAdelante = false;
                    System.out.println(it.previous());
                    break;
                case 4:
                    Iterator iter = listaReproduccion.iterator();
                    while (iter.hasNext()){
                        System.out.println();
                    }
                    break;
                case 5:
                    imprimirMenu();
                    break;
            }
        }
    }
    public static void imprimirMenu() {
        String s = "Hello, I'm the compiler and this is a really long string"+
        "that I am going to print on the screen";
        System.out.println("0 - Salir de la lista de reproduccion\n" +
                        "1 - Reproducir siguiente cancion\n" +
                        "2 - Reproducir cancion previa de la lista\n" +
                "3 - Repetir cancion actual\n" +
                        "4 - Imprimir la lista de canciones en la playlist\n" +
                        "5 - Volver a imprimir el menu");
    }
}
