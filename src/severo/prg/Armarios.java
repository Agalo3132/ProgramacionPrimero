package ProgramacionPrimero.src.severo.prg;

public class Armarios {

    int numArmarios;
    boolean estanLlenos;
    String contenidoArmario;

    public void abrir(){
        System.out.println("El armario se ha abierto");
    }

    public void cerrar(){
        System.out.println("El armario se ha cerrado");
    }

    public void meter(){
        System.out.println("Se ha metido algo al armario");
    }

    public void sacar(){
        System.out.println("Se ha sacado algo del armario");
    }


    public static void main (String[] args){
        Armarios nuevo = new Armarios();
        nuevo.numArmarios = 2;
        nuevo.estanLlenos = true;
        nuevo.contenidoArmario = "Discos";

        nuevo.abrir();
        nuevo.cerrar();
        nuevo.meter();
        nuevo.sacar();
    }


}
