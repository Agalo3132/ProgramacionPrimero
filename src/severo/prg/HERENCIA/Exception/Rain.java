package ProgramacionPrimero.src.severo.prg.HERENCIA.Exception;

public class Rain {
    public static void main(String[] args){
        firstMethod();
        try {
            String texto = "Test";
            int divisor = Integer.parseInt(texto);

            firstMethod();
            secondMethod();
        } catch (NumberFormatException eee) {

        }

    }

    public static void firstMethod(){
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            System.out.println(0);
        }
    }

    public static void secondMethod(){
        try {
            System.out.println("Texto de ejmeplo");
        } catch (Exception ee) {

        }
    }
}

