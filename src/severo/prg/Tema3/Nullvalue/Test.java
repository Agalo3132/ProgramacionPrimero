package ProgramacionPrimero.src.severo.prg.Tema3.Nullvalue;

public class Test {

    public static void main(String[] args) {
        Libro l1 = new Libro("122", "El color púrpura", "George");
        System.out.println(l1);
        Libro l2 = new Libro("456", "Fuego y tierra", "David");
        System.out.println(l2);
        Libro l3 = new Libro(l1);
        System.out.println(l3);
        Libro l4 = new Libro(l1);
        System.out.println(l4);
        Libro l5 = new Libro(l1);
        System.out.println(l5);

    }
}
