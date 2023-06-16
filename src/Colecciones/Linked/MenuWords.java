package Colecciones.Linked;

import java.util.Scanner;

public class MenuWords {

    private static final Scanner sc = new Scanner(System.in);
    private static final WordList words = new WordList();

    public static void menu(){
        System.out.println("0 - Salir\n" +
                "1 - Imprimir lista\n" +
                "2 - Añadir palabra\n" +
                "3 - Eliminar puntos y comas\n" +
                "4 - Comprobar coma y mayus\n" +
                "5 - Pasar a mayus palabra");
    }

    public static void main(String[] args) {
        boolean continuar = true;
        do {
            menu();
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 0:
                    continuar = false;
                    break;
                case 1:
                    System.out.println(words.toString());
                    break;
                case 2:
                    words.addWord(new Word(sc.nextLine()));
                    break;
                case 3:
                    words.deleteDotWords();
                    break;
                case 4:
                    words.deleteFinalWord();
                    break;
                case 5:
                    words.toUpperWord();
                    break;
            }

        } while (continuar);
    }

}
