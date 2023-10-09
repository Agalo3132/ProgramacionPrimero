package ProgramacionPrimero.src.severo.prg.EJRecursivo;

public class Ej2 {
    public static int contarCaracter(String str, char ch) {
        if (str.length() == 1) {
            return 1;
        } else {
            return str.indexOf(ch)+1;
        }

    }

    public static void main(String[] args) {
        System.out.println(contarCaracter("java", 'a'));
    }
}
