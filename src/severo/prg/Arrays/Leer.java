package severo.prg.Arrays;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Leer {
    public static void main(String[] args) {
        File arc = null;
        FileReader ForReal = null;
        BufferedReader Bu = null;

        try {
            arc = new File("/home/ALU1W/Escritorio/codigoColores");
            ForReal = new FileReader(arc);
            Bu = new BufferedReader(ForReal);

            String line;
            while ((line=Bu.readLine())!=null){
                System.out.println(line);
            }


        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
