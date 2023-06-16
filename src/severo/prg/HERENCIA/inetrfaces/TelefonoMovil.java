package severo.prg.HERENCIA.inetrfaces;

public class TelefonoMovil extends Telefono implements Impuesto, IRPF{

    private String nombre;
    private int numero;
    private boolean llamando;

    @Override
    public double calcularIva() {
        return 4.5 * VALOR_IRPF;
    }



    @Override
    public double calcularIVA() {
        return 0;
    }

    public static void main(String[] args) {
        Impuesto i = new TelefonoMovil();
        TelefonoMovil tf = new TelefonoMovil();
        tf.llamar();
        Telefono t = new TelefonoMovil();
        t.llamar();
    }
}
