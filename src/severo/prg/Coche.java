package ProgramacionPrimero.src.severo.prg;

public class Coche {

    //atributos (o campos) del objeto
    int numRuedas;
    String color;
    int caballos;
    String modelo;
    String marca;


    //acciones, comportamiento del objeto

    public void arrancar(){
        System.out.println("El coche ha arrancado");
    }

    public void frenar(){
        System.out.println("El coche ha frenado");
    }

    public void pitar(){
        System.out.println("piiiiiiii");
    }

    public void depositoLleno(){
        System.out.println("EL coche tiene el deposito lleno");
    }




    public static void main(String[] args) {
        //Construir objeto de la clase coche
        //instanciar

        Coche ford = new Coche();
        ford.caballos = 70;
        ford.numRuedas = 4;
        ford.color = "Rojo";
        ford.modelo = "Kuga";
        ford.marca = "Ford";

        ford.arrancar();
        ford.frenar();
        ford.pitar();
        ford.depositoLleno();



        Coche open = new Coche();

    }


}
