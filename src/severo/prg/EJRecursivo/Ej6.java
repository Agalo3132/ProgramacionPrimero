package ProgramacionPrimero.src.severo.prg.EJRecursivo;

public class Ej6 {
    public static boolean esPalindromo(String str) {
        if (str.length() % 2 == 0) {
            return true;
        }
        if (str.length() % 2 == 1) {
            return false;
        }

        str = str.replace("{}", "");
        str = str.replace("[]", "");
        str = str.replace("()", "");

        return esPalindromo(str);

    }


    public static void main(String[] args) {
        System.out.println(Ej6.esPalindromo("[{()[]}]"));
    }
}
