package ProgramacionPrimero.src.severo.prg.HERENCIA.inetrfaces;

public class Ej3 implements java.lang.CharSequence {
    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    public static void main(String[] args) {
        String h = "hola";

        CharSequence cs = h;
    }
}
