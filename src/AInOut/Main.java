package AInOut;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("fileW.txt");

        if (file.exists()) {
            System.out.println("existe");
        } else {
            System.out.println("no existe");
        }
    }
}
