package ProgramacionPrimero.src.severo.prg;

public class Age {




    public static void main(String[] args) {

        int a = 7;
        int b = 42;


        int smaller = minimum(a, b);
        if (smaller == a) {
            System.out.println("a is the smallest");
        }

    }


    public static int minimum(int a, int b) {
        int smaller;

        a = 7; b = 42;
        minimum(a, b);


        if (a < b) {
            smaller = a;
        } else {
            smaller = b;
        }
        return smaller;
    }

}

