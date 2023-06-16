package severo.prg;

public class Ventilador {

    int numVentiladores;
    int numHelices;
    String color;

    public void encender(){
        System.out.println("El ventilador se ha encendido");
    }

    public void apagar(){
        System.out.println("El ventilador se ha apagado");
    }

    public void subir(){
        System.out.println("Se ha subido velocidad al ventilador");
    }

    public void bajar(){
        System.out.println("Se ha bajado la velocidad del ventilador");
    }


    public static void main(String[] args){
        Ventilador techo = new Ventilador();
        techo.color = "blanco";
        techo.numHelices = 69;
        techo.numVentiladores = 23;
        techo.apagar();
        techo.bajar();
        techo.subir();
        techo.encender();
    }

}
