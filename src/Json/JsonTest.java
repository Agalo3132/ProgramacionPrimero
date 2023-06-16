package Json;

import org.json.JSONArray;
import org.json.JSONObject;

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
        JSONObject json1 = new JSONObject();
        json1.put("world", "exam");
        JSONArray results = new JSONArray();
        JSONObject result = new JSONObject();
        result.put("definition", "a set of questions or exercises evaluating skill or knowledge");
        results.put(result);
        JSONObject result2 = new JSONObject();
        result2.put("partOfSpeech", "noun");
        results.put(result2);
        JSONArray synonyms = new JSONArray();
        synonyms.put("examination");
        synonyms.put("test");
        JSONObject json3 = new JSONObject();
        json3.put("synonyms", synonyms);
        results.put(json3);
        json1.put("results", results);
        JSONObject syllables = new JSONObject();
        syllables.put("count", 2);
        JSONArray list = new JSONArray();
        list.put("ex");
        list.put("am");
        syllables.put("list", list);
        json1.put("syllables", syllables);

        System.out.println(json1);


        String urlTemp = "https://api.tutiempo.net/json/?lan=es&apid=45EaXXaaaX4ggap&ll=38.267211910,-0.695218980";
        String temp = downloadJson(urlTemp);





        String url = "https://catfact.ninja/facts";
        String json = downloadJson(url);

        JSONObject jsonObject = new JSONObject(json);
        JSONArray array = jsonObject.getJSONArray("data");
        for (int i = 0; i < array.length(); i++) {
            JSONObject o = array.getJSONObject(i);
            System.out.println(o.getString("fact"));
            System.out.println(o.getInt("length"));
        }

        JSONObject fact0 = array.getJSONObject(1);
        //System.out.println(fact0.getString("fact"));
        //System.out.println(fact0.getInt("length"));

        //System.out.println(jsonObject.getString("first_page_url"));

        //System.out.println(jsonObject.getJSONArray("links").getJSONObject(14).getString("label"));


    }
}
