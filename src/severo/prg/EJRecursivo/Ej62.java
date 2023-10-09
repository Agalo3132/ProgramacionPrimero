package ProgramacionPrimero.src.severo.prg.EJRecursivo;

public class Ej62 {
    public static boolean esPalindromo(String texto)
    {
        if(texto.length() <= 1) {
            return true;
        } else {
            if(texto.charAt(0) == texto.charAt(texto.length()-1)) {
                return esPalindromo(texto.substring(1,texto.length()-1));
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Ej6.esPalindromo("olfalo"));
    }
}

