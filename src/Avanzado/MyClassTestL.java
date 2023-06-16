package Avanzado;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

interface Finder{
    int find(String s1, String s2);
}

interface Texter{
    String test(String text);
}

public class MyClassTestL {

    public static int doFind(String s1, String s2) {
        return s1.indexOf(s2);
    }

    //REFERENCIA A METODOS ESTATICA
    public static String toUpperCase(String s1) {
        return s1.toUpperCase();
    }

    //REFERENCIA A METODOS DE INSTANCIA
    public String toLowerCase(String s1) {
        return s1.toLowerCase();
    }


    public static void main(String[] args) {
        Finder finder = (s1, s2) -> s1.indexOf(s2);
        Finder f = String::indexOf;
        Finder finder1 = MyClassTestL::doFind;
        Texter texter = MyClassTestL::toUpperCase;
        MyClassTestL myClassTestL = new MyClassTestL();
        Texter t = myClassTestL::toLowerCase;

        //System.out.println(finder.find("patri","p"));
        //System.out.println(f.find("patri","p"));

        //Supplier<MyClassTestL> mctl = () -> new MyClassTestL();
        Supplier<MyClassTestL> mctl2 = MyClassTestL::new;

        //Function<Integer, MyClassTestL> fu = MyClassTestL::new;

        List<Integer> lista = new ArrayList<>();
        lista.forEach(System.out::println);

    }
}
