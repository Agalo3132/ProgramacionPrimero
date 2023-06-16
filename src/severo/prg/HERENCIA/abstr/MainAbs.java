package severo.prg.HERENCIA.abstr;

import severo.prg.HERENCIA.SubClase;

public class MainAbs {
    public static void main(String[] args) {
        SubClase subClase = new SubClase();
        subClase.abstractMethod();
        subClase.notAbstractMethod();
    }
}
