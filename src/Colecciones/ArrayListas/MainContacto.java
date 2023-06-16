package Colecciones.ArrayListas;

import java.util.ArrayList;
import java.util.Scanner;

public class MainContacto {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Contacto> myContact;

    public static void imprimirMenu() {
        System.out.println("0 - Salir");
        System.out.println("1 - Imprimir contactos");
        System.out.println("2 - Añadir contacto");
        System.out.println("3 - Actualizar contacto");
        System.out.println("4 - Eliminar contacto");
        System.out.println("5 - Buscar contacto");
        System.out.println("6 - Imprimir opciones");
    }

    public static void añadirContacto() {
        System.out.println("Escribe el contacto: ");
    }

    public static void main(String[] args) {


    }
}
