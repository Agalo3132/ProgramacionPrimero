package Avanzado;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

interface LambdaInterfaz {
    void metodo1();
}

interface Saludo{
    public String say(String nombre);
}


public class LambdaClass {

    public static void main(String[] args) {

        LambdaInterfaz l = new LambdaInterfaz() {
            @Override
            public void metodo1() {
                System.out.println("Java");
            }
        };
        l.metodo1();

        LambdaInterfaz l2 = () -> {
            System.out.println("Alvaro");
        };
        l2.metodo1();

        LambdaInterfaz l3 = () -> System.out.println("Alvaro");
        l3.metodo1();

        LambdaInterfaz l4 = () -> System.out.println("Alvaro");
        l3.metodo1();

        Saludo s = n -> "Alvaro";
        Saludo s2 = (String n) -> {
            return "Alvaro";
        };


        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("Lambda");
        list.add("test");

        list.forEach(n -> System.out.println(n));


        Consumer<String> mostrarElemento = n -> System.out.println(n);

        mostrarElemento.accept("Programa");




        Function<String, Integer> calcularSumCa = cadena -> {
            int total = 0;
            for (int i = 0; i < cadena.length(); i++) {
                total+=cadena.charAt(i);
            }
            return total;
        };

        int total = calcularSumCa.apply("java");

    }
}
