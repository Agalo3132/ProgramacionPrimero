package ProgramacionPrimero.src.severo.prg.HERENCIA.encapsulamiento;

public class Habitacion {
    private String nombre;
    private Pared pared1;
    private Pared pared2;
    private Pared pared3;
    private Pared pared4;
    private Techo techo;
    private Lampara lampara;

    public Habitacion(String nombre, Pared pared1, Pared pared2, Pared pared3, Pared pared4, Techo techo, Lampara lampara) {
        this.nombre = nombre;
        this.pared1 = pared1;
        this.pared2 = pared2;
        this.pared3 = pared3;
        this.pared4 = pared4;
        this.techo = techo;
        this.lampara = lampara;
    }

    public Lampara getLampara() {

        return lampara;
    }


    public static void hacerLaCama() {
        System.out.println("Se esta haciendo la cama");
        Cama.hacer();
    }

    public static void apagarLampara() {
        System.out.println("Se está encendiendo la lampara");
        Lampara.encender();
    }
}
