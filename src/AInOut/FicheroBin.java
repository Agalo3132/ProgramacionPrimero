package ProgramacionPrimero.src.AInOut;

import java.io.*;

public class FicheroBin {
    public static void main(String[] args) {
        try {
            DataInputStream fos = new DataInputStream(new BufferedInputStream(new FileInputStream("datos.dat")));
            int n = 0;
            while (fos.available() > 0) {
                n = n + fos.readInt();
            }
            System.out.println(n);
        } catch (EOFException ex) {

        } catch (FileNotFoundException e) { //todas pueden derivar de IOException
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
