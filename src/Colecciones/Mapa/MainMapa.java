package ProgramacionPrimero.src.Colecciones.Mapa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainMapa {
    private static Map<Integer, Ubicacion> ubicaciones = new HashMap<>();

    public MainMapa(Map<Integer, Ubicacion> ubicaciones) {
        Ubicacion ubicacion0 = new Ubicacion(0, "Estas sentado en clase de programacion");
        ubicaciones.put(ubicacion0.getId(), ubicacion0);
        Ubicacion ubicacion1 = new Ubicacion(1, "Estas en la cima de una montaña");
        ubicaciones.put(ubicacion1.getId(), ubicacion1);
        Ubicacion ubicacion2 = new Ubicacion(2, "Estas bañandote en la playa");
        ubicaciones.put(ubicacion2.getId(), ubicacion2);
        Ubicacion ubicacion3 = new Ubicacion(3, "Estas dentro de un edificio muy alto");
        ubicaciones.put(ubicacion3.getId(), ubicacion3);
        Ubicacion ubicacion4 = new Ubicacion(4, "Estas de pie en un puente");
        ubicaciones.put(ubicacion4.getId(), ubicacion4);
        Ubicacion ubicacion5 = new Ubicacion(5, "Estas en un bosque");
        ubicaciones.put(ubicacion5.getId(), ubicacion5);

        ubicacion1.addExit("Q", 0);
        ubicacion1.addExit("N", 5);
        ubicacion1.addExit("O", 2);
        ubicacion1.addExit("S", 4);
        ubicacion1.addExit("E", 3);

        ubicacion2.addExit("Q",0);
        ubicacion2.addExit("N",5);
        ubicacion2.addExit("E",1);
        //ubicacion2.addExit("S",4);

        ubicacion3.addExit("Q",0);
        ubicacion3.addExit("O",1);

        ubicacion4.addExit("Q",2);
        ubicacion4.addExit("O",2);
        ubicacion4.addExit("N",1);

        ubicacion5.addExit("Q",0);
        ubicacion5.addExit("O",2);
        ubicacion5.addExit("S",1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ubicacionActual = 1;

        while (ubicacionActual != 0) {
            System.out.println(ubicaciones.get(ubicacionActual).getDescripcion());
            for (String direccion:ubicaciones.get(ubicacionActual).getExits().keySet()) {
                System.out.println(direccion + " ");
            }
            System.out.println("Elige donde ir");
            String dondeQuiereIr = sc.nextLine().toUpperCase();
            if (ubicaciones.get(ubicacionActual).getExits().containsKey(dondeQuiereIr)) {
                ubicacionActual = ubicaciones.get(ubicacionActual).getExits().get(dondeQuiereIr);
            } else {
                System.out.println("No puedes ir ahí");
            }

        }

    }
}

