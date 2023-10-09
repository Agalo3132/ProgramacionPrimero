package ProgramacionPrimero.src.EJEMPlo;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Serie> series = new ArrayList<>();

        series.add(new Serie("Padre de familia", "Alvaro Serrano"));
        series.add(new Serie("Evangelion", "La profesora que me va a aprobar"));


        LinkedList<Episodio> episodios = new LinkedList<>();

        episodios.add(0, new Episodio("Piloto", 20));
        episodios.add(1, new Episodio("Subeme un punto Patri", 4));
        episodios.add(new Episodio("Vamos a por el 10", 10));
        episodios.add(new Episodio("DAW", 20));


        play(episodios);

    }

    public static void imprimirMenu() {
        System.out.println("0 - Salir de la lista de reproducción");
        System.out.println("1 - Reproducir el siguiente episodio de la lista");
        System.out.println("2 - Reproducir el episodio anterior de la lista");
        System.out.println("3 - Repetir el episodio actual");
        System.out.println("4 - Imprimir la lista de episodios en la lista de reproducción");
        System.out.println("5 - Volver a imprimir el menú");
        System.out.println("6 - Eliminar el episodio actual");
    }

    public static void play (LinkedList<Episodio> listaReproduccion) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Reproduciendo el episodio -> " + listaReproduccion.get(0));

        ListIterator<Episodio> it = listaReproduccion.listIterator();

        try {
            while (continuar) {
                System.out.println("Elige una opción: ");
                imprimirMenu();
                int opcion = sc.nextInt();
                sc.nextLine();
                boolean siguiente = false;
                switch (opcion) {
                    case 0:
                        continuar = false;
                        break;
                    case 1:
                        if (it.hasNext()) {
                            siguiente = true;
                        }
                        if (it.hasPrevious()) {
                            it.previous();
                            it.next();
                        } else {
                            it.next();
                        }
                        if (siguiente) {
                            System.out.println("Reproduciendo el episodio -> " + it.next());
                        } else {
                            System.out.println("Has llegado al último episodio");
                        }
                        siguiente = false;
                        break;
                    case 2:
                        if (it.hasPrevious()) {
                            siguiente = true;
                        }
                        if (it.hasNext()) {
                            it.next();
                            it.previous();
                        } else {
                            it.previous();
                        }
                        if (siguiente) {
                            System.out.println("Reproduciendo el episodio -> " + it.previous());
                        } else {
                            System.out.println("Este es el primer episodio");
                        }
                        break;
                    case 3:
                        if (it.hasPrevious()) {
                            it.previous();
                            System.out.println("Reproduciendo el episodio -> " + it.next());
                        } else if (it.hasNext()) {
                            it.next();
                            System.out.println("Reproduciendo el episodio -> " + it.previous());
                        }
                        break;
                    case 4:
                        System.out.println(listaReproduccion);
                        break;
                    case 5:
                        imprimirMenu();
                        break;
                    case 6:
                        listaReproduccion.remove();
                        break;
                    default:
                        System.out.println("Opción invalida");
                        break;
                }

            }

        } catch (InputMismatchException e) {
            System.out.println("Solo se permite escribir números");
        }

    }

}
