package severo.prg.EJRecursivo;

public class Ej4 {
    public static int Entero(String str){
        char c = 'a';
        int num = c;

        if (str.length() == 1) {
            num = str.codePointAt(1);
            return num;
        } else {
            num = (str.codePointAt(1) + (str.codePointAt(1)-1));
            return num;
        }
    }


    public static void main(String[] args) {
        System.out.println(Entero("ahj"));
    }
}
