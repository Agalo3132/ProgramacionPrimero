package Avanzado.Streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.*;

public class Sucursal {
    public static void main(String[] args) {
        UnaryOperator<Integer> un = n -> 2;
        System.out.println(un.apply(3));

        Predicate<Integer> masQue10 = n -> n > 10;
        Predicate<Integer> menosQue20 = n -> n < 20;
        System.out.println(masQue10.and(menosQue20).test(12));

        Supplier<Integer> suIn = () -> 2;

        Consumer<Integer> coIn = n -> System.out.println("hola");

        Callable<Integer> s = () -> 2;

        Consumer<String> st = str -> System.out.println("Estoy en clase de programacion");

        List<Integer> nn = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Consumer<Integer> num = n -> System.out.println(n);

        nn.forEach(num);


        Supplier<String> spp = () -> "Java es un lenguaje de programación";
        System.out.println(spp.get());

        Supplier<HashMap<String, String>> crearMapa = () -> new HashMap<>();

        BiConsumer<Integer, Integer> ssd = (n, m) -> System.out.println(n*m);
        ssd.accept(-9,7);


    }

    public void Calculator(Integer i1, Integer i2, BiConsumer<Integer, Integer> bc) {
        bc.accept(i1,i2);
    }


}
