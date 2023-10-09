package ProgramacionPrimero.src.severo.prg.Tema3;

public class Main {

    public static int sumar(int n1, int n2) {

        return n1 + n2;
    }

    public static int sumar(int n1, int n2, int n3) {

        return n1 + n2;
    }

    public static int sumar(double n1, double n2) {

        return  (int) (n1 + n2);
    }



    public static void main(String[] args) {
        byte b = 4;
        System.out.println(sumar(1, 2));
        System.out.println(sumar(0.0, b));
        System.out.println(sumar(1, 2, 3));
    }
}
