package ProgramacionPrimero.src.Json;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class JsonTest {

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
        //System.out.println(fact0.getInt("length"));

        //System.out.println(jsonObject.getString("first_page_url"));

        //System.out.println(jsonObject.getJSONArray("links").getJSONObject(14).getString("label"));


    }
}
