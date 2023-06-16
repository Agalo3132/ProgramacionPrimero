package severo.prg.HERENCIA.polimor;

public class Pintura {
    private double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double pinturaNecesitada(Forma forma){
        return forma.area()/cobertura;
    }
}
