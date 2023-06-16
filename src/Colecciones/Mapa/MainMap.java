package Colecciones.Mapa;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {




        Map<String, String> idiomas = new HashMap<>();
        idiomas.put("es", "Español");
        idiomas.put("en", "Inglés");
        idiomas.put("ca", "Inglés Canadiense");
        idiomas.put("de", "Alemán");
        System.out.println(idiomas.put("jp", "Japones"));
        System.out.println(idiomas.put("jp", "Japanese"));
        System.out.println(idiomas.put("jp", "Jp"));

        System.out.println(idiomas.get("jp"));

        if (idiomas.containsValue("es")) {
            System.out.println("La clave ya existe");
        }

        if (idiomas.containsValue("Español")) {
            System.out.println("El idioma español ya existe");
        }

        idiomas.remove("jp", "Jp");

        idiomas.replace("en", "Inglés", "English");

        for (String key: idiomas.keySet()) {
            System.out.println(key);
        }

        for (String value: idiomas.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, String> par: idiomas.entrySet()) {
            System.out.println(par.getKey());
        }
    }
}
