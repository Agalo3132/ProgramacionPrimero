package severo.prg;

public class Pepe {

    private int piernas;
    private int brazos;
    private boolean pene;

    public Pepe() {
        this(false);
    }

    public Pepe(Pepe objPepe){
        this(2,3);
        this.pene = false;

        System.out.println(piernas + "" + brazos + "" + pene);
    }


    public Pepe(int piernas, int brazos){
        this.piernas = piernas;
        this.brazos = brazos;

        System.out.println(piernas + "" +brazos);
    }

    public Pepe(boolean pene){
        this(2,3);
        this.pene = pene;

        System.out.println(piernas + "" +brazos+ "" + pene);
    }


    public static void main(String[] args) {
        Pepe pepe = new Pepe(2,3);
        Pepe pepe3 = new Pepe(true);
        Pepe pepe2 = pepe;
        pepe.brazos = 2;
        pepe.piernas = 3;
        pepe.pene = true;
        pepe2.pene = false;



    }


}
