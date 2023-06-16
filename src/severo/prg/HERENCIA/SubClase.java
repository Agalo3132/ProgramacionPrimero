package severo.prg.HERENCIA;

import severo.prg.HERENCIA.abstr.Absabs;

public class SubClase extends Absabs {


    @Override
    public void abstractMethod() {
        System.out.println("Este es un metodo abstracto implementado en una clase no abstracta");
    }

}
