package ProgramacionPrimero.src.Json;


import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Temperatura {
    public static String downloadJson(String url) {
        try (InputStream input = new URL(url).openStream()){
            InputStreamReader isr = new InputStreamReader(input);
            BufferedReader bf = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = bf.read()) != -1) {
                sb.append((char)c);
            }
            return sb.toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args) {

         if (args.length != 5) {
             System.out.println("Error");
             return;
         }

    }
}
