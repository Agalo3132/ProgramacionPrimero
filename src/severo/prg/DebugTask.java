package severo.prg;

public class DebugTask {

    public static void contar(int i) {
        i = i++ -++i - ++i + i++;
        if (i == -2) {
            System.out.println(i);
        } else {
            i = -1;
        }
    }

    public static void main(String[] args) {
        contar(0);


        System.out.println("sigue aqui");
    }

}
