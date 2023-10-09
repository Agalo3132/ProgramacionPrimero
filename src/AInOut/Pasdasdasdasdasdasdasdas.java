package ProgramacionPrimero.src.AInOut;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pasdasdasdasdasdasdasdas {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("output.txt");
             FileReader fr = new FileReader("data.dat")){
            fw.write("str");
            fr.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
