package ProgramacionPrimero.src.AInOut;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile("filero.txt", "rw");
            System.out.println("En que posición está el fichero: ");
            Scanner sc = new Scanner(System.in);
            int nt = sc.nextInt();
            file.seek(nt);
            int r = file.read();
            System.out.println(r);
            System.out.println("Escribe el nuevo valor: ");
            int nt2 = sc.nextInt();
            file.writeInt(nt2);
            int r2 = file.read();
            System.out.println(r2);
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
