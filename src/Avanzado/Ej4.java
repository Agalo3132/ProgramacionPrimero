package Avanzado;
interface Runnable{

    void run();

}

public class Ej4 {



    public static void main(String[] args) {

        LambdaInterfaz l11 = () -> {
            String texto = "Vamos a crear un array";
            String[] partes = texto.split(" ");
            for (String parte: partes) {
                System.out.println(partes);
            }
        };
        l11.metodo1();
    }
}
