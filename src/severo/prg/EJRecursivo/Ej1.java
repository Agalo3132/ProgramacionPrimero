package severo.prg.EJRecursivo;

public class Ej1 {
    public void imprimirString(String s) {
        if (s.length() == 1)
            System.out.println(s.charAt(0));
        else {
            System.out.println(s.charAt(s.length()-1));
            imprimirString(s.substring(0,s.length()-1));
        }
    }


        public static void main(String[] args) {

    }
}
