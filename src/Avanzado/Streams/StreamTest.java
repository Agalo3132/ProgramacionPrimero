package ProgramacionPrimero.src.Avanzado.Streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Set<Integer> set =  lista.stream()
                .peek(n -> System.out.println(n))
                .collect(Collectors.toSet());

        List<String> cadenas = Arrays.asList("Texto", "Texto 2", "Texto 3");
        System.out.println(cadenas.stream()
                        .peek(System.out::println)
                .filter(s -> s.length() == 5)
                        .peek(System.out::println)
                .collect(Collectors.toList()));


        List<String> bingoNum = Arrays.asList(
                "A40",
                "B12", "B65",
                "C34", "C71",
                "D55", "D20", "D36", "d99",
                "E89"
        );

        //bingoNum.forEach(s -> System.out.println(s));
        //bingoNum.forEach(System.out::println);
        //System.out.println(bingoNum);

        //bingoNum.stream().forEach(System.out::println);

        List<String> bingo2 = new ArrayList<>();


        System.out.println(bingoNum.stream().anyMatch(s -> s.contains("X")));

        for (String s: bingoNum) {
            if (s.toUpperCase().startsWith("D")) {
                System.out.println(s);
            }
        }

        bingoNum.forEach(s -> {
            if (s.toUpperCase().startsWith("D")) {
                bingo2.add(s);
            }
        });

        Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);
        bingo2.sort(comparator);
        System.out.println(bingo2);



        bingoNum.stream().filter(s -> s.toUpperCase().startsWith("D")).sorted().forEach(System.out::println);

        bingoNum.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("D"))
                .sorted()
                .forEach(System.out::println);

        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Integer> l2 = Arrays.asList(4,5,6);
        List<Integer> l3 = Arrays.asList(7,8,9);

        List<List<Integer>> list23 = Arrays.asList(l1,l2,l3);

        list23.stream().flatMap(s -> s.stream()).forEach(System.out::println);

        list23.stream()
                .flatMap(s -> s.stream())
                .filter(s -> s >= 5)
                .forEach(System.out::println);

        Emp e1 = new Emp("Álvaro", 18, 2000);
        Emp e2 = new Emp("Pepe", 33, 2900);
        Emp e3 = new Emp("Patri", 45, 1500);
        Emp e4 = new Emp("Adrian", 26, 1600);
        Emp e5 = new Emp("Jaime", 38, 2700);

        Dpto dInf = new Dpto("Informatica");
        dInf.addEMps(e3);
        dInf.addEMps(e1);

        Dpto rrhh = new Dpto("Recursos humanos");
        rrhh.addEMps(e2);
        rrhh.addEMps(e4);
        rrhh.addEMps(e5);

        List<Dpto> empresa = new ArrayList<>();
        empresa.add(dInf);
        empresa.add(rrhh);

        empresa.stream().map(d -> d.getEmps().get(0)).map(e -> e.getNombre()).forEach(System.out::println);

        empresa.stream().map(e -> e.getEmps()).flatMap(e -> e.stream()).forEach(System.out::println);

        /**
        empresa.stream().filter(dpto -> dpto.getNombre().equals("Informatica"))
                .flatMap(dpto -> dpto.getEmps()
                        .stream()).map(emp -> emp.getNombre())
                .forEach(System.out::println);
        **/


        List<Integer> enteros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        enteros.stream().collect(Collectors.toSet());

        List<String> cad1 = Arrays.asList("cen1", "cadena2", "cden3", "cadena4");
        List<String> cad2 = new ArrayList<>();

        for (String st1: cad1) {
            cad2.add(st1.toUpperCase());
        }

        cad1.forEach(System.out::println);
        cad2.forEach(System.out::println);

        cad1.stream().anyMatch(e -> e.contains("x"));
        System.out.println(cad1.stream().anyMatch(e -> e.contains("x")));

        cad1.stream().filter(e -> e.contains("a")).count();
        System.out.println(cad1.stream().filter(e -> e.contains("a")).count());

        cad1.stream().filter(e -> e.contains("c")).map(e -> e.toUpperCase()).sorted().forEach(System.out::println);

        List<Emp> empleantes = new ArrayList<>();
        empleantes.add(e1);
        empleantes.add(e2);
        empleantes.add(e3);
        empleantes.add(e4);

        empleantes.forEach(System.out::println);

        empleantes.stream().filter(e -> e.getEdad() > 30).count();
        System.out.println(empleantes.stream().filter(e -> e.getEdad() > 30).count());

        empleantes.stream().filter(e -> e.getEdad() > 30).map(e -> e.getNombre()).forEach(System.out::println);

        //empleantes.stream().filter(e -> e.getDptm().equals("sistemas")).sorted().forEach(System.out::println);

        List<Integer> numer = Arrays.asList(1,2,3,4,5,6);

        numer.stream().reduce(3, (ac, el) -> ac + el);
        System.out.println(numer.stream().reduce(3, (ac, el) -> ac + el));

        Predicate<Emp> filtrado = emp -> emp.getsalario() >= 1500 && emp.getsalario() <= 2000;
        Comparator<Emp> comparato1 = (o1, o2) -> (int) (o1.getsalario() - o2.getsalario());

        empresa.stream()
                .flatMap(dpto -> dpto.getEmps().stream())
                .filter(filtrado)
                .sorted(Comparator.comparing(Emp::getsalario, (o1, o2) -> (int) (o2 - o1)))
                .forEach(System.out::println);



        List<String> listatata = Arrays.asList("A", "B");
        listatata.stream();

        Stream.of("A", "B");

        Stream.of(new Emp("Pepeep", 2, 2));

        Stream.of(new int[]{1,2});

        Arrays.stream(new Object[]{new Emp("Sara", 13, 1345), new Dpto("RRHH")});

        Stream.generate(() -> Arrays.asList(1,2,3));

        IntStream.range(0, 11).sum();
        System.out.println(IntStream.range(0, 11).sum());

        Stream.iterate(0, i -> i+1).limit(10).forEach(System.out::println);
        Stream.iterate(0, i -> i < 10, i -> i+1).forEach(System.out::println);


        Stream.iterate(0, i -> i <= 20, i -> i + 2).filter(i -> i > 10).forEach(System.out::println);

        Stream.iterate(0, i -> i+1)
                .filter(i -> i % 2 == 0)
                .skip(6)
                .limit(5)
                .forEach(System.out::println);


        List<String> ciudades = Arrays.asList(
                "elche",
                "alicante",
                "elda",
                "petrer",
                "aspe",
                "crevillente",
                "alcoy",
                "ibi",
                "benidorm",
                "matola"
        );

        List<List<String>> array = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e", "f")
        );
        for (List<String> sublist : array) {
            for (String element : sublist) {
                if (!element.equals("a")) {
                    System.out.println(element);
                }
            }
        }

        String puntos = "{0, 2}, {1, 5}, {2, 3}, {3, 4}";
        Pattern pattern = Pattern.compile("\\{(.*?)\\}");
        Matcher matcher = pattern.matcher(puntos);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }

        String correo = "test2@gmail.com";
        String codeCorreo = "^.+@[a-z]+\\.[a-z]+";
        Pattern pCr = Pattern.compile(codeCorreo);
        Matcher mCc = pCr.matcher(correo);
        System.out.println(mCc.matches());
    }
}
