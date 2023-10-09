package ProgramacionPrimero.src.severo.prg.HERENCIA.encapsulamiento;

public class main {
    public static void main(String[] args) {
        Habitacion habitacion = new Habitacion("hab12",new Pared("norte"),new Pared("este"),new Pared("oeste"), new Pared("sur"), new Techo(12,23), new Lampara("vieja", true, 2));
        Habitacion.hacerLaCama();
        Lampara.encender();
    }
}
