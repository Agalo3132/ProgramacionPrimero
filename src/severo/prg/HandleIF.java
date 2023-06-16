package severo.prg;

public class HandleIF {

    public static int numUnique(int a, int b, int c) {
        if (a != b && b != c && b != c){
            return 3;
        } else if (a == b && a == c) {
            return 1;
        } else {
            return 2;
        }

    }

    public static void main(String[] args) {
        int resultado = numUnique(18, 3, 4);
        System.out.println(resultado);

    }
}
