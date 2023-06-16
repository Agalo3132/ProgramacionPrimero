package Json;

public class Day {
    private String dia;
    private int temperature_max;
    private int temperature_min;
    private String text;

    public Day(String dia, int temperature_max, int temperature_min, String text) {
        this.dia = dia;
        this.temperature_max = temperature_max;
        this.temperature_min = temperature_min;
        this.text = text;
    }

    public String getDia() {
        return dia;
    }

    public int getTemperature_max() {
        return temperature_max;
    }

    public int getTemperature_min() {
        return temperature_min;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return  "dia: " + dia + " " + text + " Temperatura max: " + temperature_max + " Temperatura min: " + temperature_min;
    }
}
