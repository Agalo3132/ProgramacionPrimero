package ProgramacionPrimero.src.severo.prg.HERENCIA.abstr;

public abstract class Absabs {
    public Absabs() {
        System.out.println("Este es un constructor de clase abstracta");
    }

    public abstract void abstractMethod();

    public void notAbstractMethod() {
        System.out.println("Este es un método normal de clase abstracta");
    }

}
