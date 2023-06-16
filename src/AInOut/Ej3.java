package AInOut;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej3 {
    public static void main(String[] args) {
        try(BufferedReader b = new BufferedReader(new FileReader("ex3.txt"))){
            while (b.ready()){
                System.out.println(b.readLine().replaceAll(" ", ""));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
