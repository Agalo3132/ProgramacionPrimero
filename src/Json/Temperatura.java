package Json;

import org.json.JSONObject;

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

        String lat = args[1];
        String log = args[3];
        String output = args[4];
        String url = ("https://api.tutiempo.net/json/?lan=es&apid=45EaXXaaaX4ggap&ll=" + lat + "," + log);
        String temp = downloadJson(url);
        JSONObject json = new JSONObject(temp);
        List<Day> lista = new ArrayList<>();

        for (int i = 1; i <= 7; i++) {
            Day dia = new Day("day"+i, json.getJSONObject("day"+i).getInt("temperature_max"),json.getJSONObject("day"+i).getInt("temperature_min"),json.getJSONObject("day"+i).getString("text"));
            lista.add(dia);
        }

        String str = "";

        try (FileWriter fw = new FileWriter(output)) {
            for (Day dia : lista) {
                str+= dia + "\n";
            }
            fw.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
