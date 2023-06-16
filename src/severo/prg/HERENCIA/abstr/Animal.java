package severo.prg.HERENCIA.abstr;

public abstract class Animal {

    private String nombreCientifico;
    private String cuerpo;


    public abstract void moverse();

    public boolean estaVivo() {
        return true;
    }


}
