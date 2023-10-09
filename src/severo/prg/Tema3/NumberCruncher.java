package ProgramacionPrimero.src.severo.prg.Tema3;

public class NumberCruncher {
    private int ent;

    public NumberCruncher(int ejemplo) {
        this.ent = ejemplo;
        System.out.println("int: " + getEnt() + " doble: " + doble() + " triple: " + triple() + " cuadrado: " + cuadrado() + " cubo: " + cubo());
    }

    public int getEnt() {
        return ent;
    }

    public int doble (){
        return ent*2;
    }

    public int triple(){
        return ent*3;
    }

    public int cuadrado(){
        return ent*ent;
    }

    public int cubo(){
        return ent*ent*ent;
    }



    public static void main(String[] args) {
        NumberCruncher num = new NumberCruncher(2);
    }

}
