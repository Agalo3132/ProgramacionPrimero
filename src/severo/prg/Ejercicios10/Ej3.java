package severo.prg.Ejercicios10;

public class Ej3 {
    public static void main(String[] args) {

        System.out.println(hayQueDespertarse(true, 1));
        System.out.println(hayQueDespertarse(false, 2));
        System.out.println(hayQueDespertarse(true, 8));
        System.out.println(hayQueDespertarse(true, -1));

    }

    public static boolean hayQueDespertarse (boolean ladrido, int horaDelDia) {

        if (horaDelDia >= 0 && horaDelDia <= 23) {
            if (ladrido == true && horaDelDia < 8 || horaDelDia > 22) {
                return true;
            }
        }
        return false;
    }
}
