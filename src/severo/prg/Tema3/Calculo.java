package severo.prg.Tema3;

public class Calculo {
    public static double obtenerSuma(double d1, double d2) {
        return d1 + d2;
    }
}
class CalculoTester {
    public static void main(String[] args) {
        Calculo cal = new Calculo();
        Calculo cal2 = new Calculo();
        Calculo cal3 = new Calculo();
        System.out.println(cal.obtenerSuma(69, 22));
        System.out.println(cal2.obtenerSuma(69, 22));
        System.out.println(cal3.obtenerSuma(69, 22));
    }
}
