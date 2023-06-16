package Colecciones.Mapa;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    private static TreeMap<String, String> colores = new TreeMap<>(new SortMyTreeMap());

    public static void printNumbers() {
        for (Map.Entry<String, String> entradaMapa : colores.entrySet()) {
            System.out.println(entradaMapa.getKey() + "-->" + entradaMapa.getValue());
        }
    }

    public static void copyMap(TreeMap mapa) {
        for (Map.Entry<String, String> entradaMapa : colores.entrySet()) {
            mapa.putAll(colores);
        }
    }

    public static boolean findKey(String clave) {
        return colores.containsKey(clave);
    }

    public static boolean findValue(String valor) {
        return colores.containsValue(valor);
    }

    public static void inversePrintNumbers() {
        System.out.println(colores.descendingKeySet());
    }

    public static String lowKey() {
        return colores.firstKey();
    }

    public static void highKey() {
        System.out.println(colores.lastKey());
    }

    public static Map.Entry<String,String> parClaveMayor () {
        return colores.firstEntry();
    }

    public static Map.Entry<String,String> parClaveMenor () {
        return colores.lastEntry();
    }

    public static String imprimirClaveGrandeMenorIgual(TreeMap<String,String> map, String key) {
        String clave = map.floorKey(key);
        if (clave != null) {
            return clave+ " -> " + map.get(clave);
        } else {
            return "No se encontró ninguna clave menor o igual a " + key;
        }
    }


    public static void main(String[] args) {
        colores.put("C1", "Rojo");
        colores.put("C2", "Azul");
        colores.put("C3", "Verde");
        colores.put("C4", "Blanco");
        colores.put("C5", "Negro");

        printNumbers();
        findKey("C1");
        findValue("Rojo");
        findValue("amarillo");
        inversePrintNumbers();
    }

    public static class SortMyTreeMap implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    }
}
