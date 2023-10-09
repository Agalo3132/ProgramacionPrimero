package ProgramacionPrimero.src.severo.prg;

public class Ordenador {

    int numOrdenadores;
    String marca;
    boolean broken;

    public void encender(){
        System.out.println("El ordenador se ha encendido");
    }

    public void apagar(){
        System.out.println("El ordenador se ha apagado");
    }

    public void romper(){
        System.out.println("El ordenador se ha roto");
    }

    public static void main(String[] args){
        Ordenador viejo = new Ordenador();
        viejo.broken = false;
        viejo.marca = "hp";
        viejo.numOrdenadores = 20;

        viejo.apagar();
        viejo.romper();
        viejo.encender();
    }


}
