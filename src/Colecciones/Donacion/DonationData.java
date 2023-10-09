package ProgramacionPrimero.src.Colecciones.Donacion;

import java.time.LocalDate;
import java.util.TreeMap;

public class DonationData {
    private static TreeMap<Donation, Double> donacion;

    public void donationDataInit(){
        donacion = new TreeMap<>();
    }

    public Donation donationParse(String parse) {
        String[] datos = parse.split(";");
        return new Donation(LocalDate.parse(datos[0]), datos[1], datos[2], datos[3], Double.parseDouble(datos[4]));
    }

    public void donationDataAdd(Donation d) {
        if (!donacion.containsValue(d)) {

        }
    }



}
