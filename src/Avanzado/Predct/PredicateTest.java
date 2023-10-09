package ProgramacionPrimero.src.Avanzado.Predct;

import java.time.LocalDate;
import java.util.*;
import java.util.function.*;

public class PredicateTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alvaro Serrano", 18);
        Employee e2 = new Employee("Miguel", 99);
        Employee e3 = new Employee("Messi Ronaldo", 23);
        Employee e4 = new Employee("Ruben", 33);
        Employee e5 = new Employee("Chanel Playa", 42);
        Employee e6 = new Employee("Jose Juan", 69);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);

        Function<Employee,String> convertMayusName = employee -> employee.getName().toUpperCase();

        Function<String, String> onlyName = name -> name.substring(0, name.indexOf(' '));

        Function unity = convertMayusName.andThen(onlyName);

        System.out.println(unity.apply(employees.get(4)));

        BiFunction<Employee, Double, String> concatAttribute = (e, salary) -> e.getName() + e.getAge() + salary;

        String resu = concatAttribute.apply(employees.get(4), 1200.0);

        BiFunction<Integer, Integer, Integer> sum = (num1, num2) -> num1 + num2;
        System.out.println(sum.apply(1,2));

        Function<Integer, Integer> mult = x -> x * x;

        BiFunction inter = sum.andThen(mult);
        System.out.println(inter.apply(2,3));

        UnaryOperator<Integer> doble = x -> x * 2;


        Predicate<Employee> menoresDeEdad = e -> e.getAge() < 18;
        Predicate<Scrapper> mayor20 = s -> s.getAge() >= 20;

        System.out.println(mayor20.or(menoresDeEdad).test(new Scrapper("Alvaro", 18)));

        Predicate<String> eq = Predicate.isEqual("java");
        eq.test("yaba");

        printEmployeeByAge(employees, (e) -> e.getAge() > 18);
        printEmployeeByAge(employees, (e) -> e.getAge() > 65);

        Predicate<Integer> masQue100 = n -> n > 100;

        Predicate<Integer> masQue100NoQue300 = n -> n > 100 && n < 300;

        Predicate<Integer> masQue100MenorQue50 = n -> n > 100 || n < 50;

        Predicate<Integer> distintoA100 = n -> n != 100;

        BiFunction<String, String, Boolean> iguales2 = (str1, str2) -> str1.equals(str2);

        BiPredicate<String, String> iguales = (str1, str2) -> str1.equals(str2);

        List<Integer> num10 = new ArrayList<>();
        num10.add(1);
        num10.add(2);
        num10.add(3);
        num10.add(4);
        num10.add(5);
        num10.add(6);
        num10.add(7);
        num10.add(8);
        num10.add(9);
        num10.add(10);


        Predicate<Integer> pr1 = n -> n <= 25;
        Predicate<Integer> pr2 = n -> n >= 30;


        Supplier<Integer> supNumero = () -> 6 + 2;
        IntSupplier supInt = () -> 2;
        System.out.println(supNumero.get());

        Supplier<ArrayList> li = () -> new ArrayList();
        List l = li.get();

        Supplier<Double> ran = () -> Math.random()*100;
        for (int i = 0; i < 10; i++) {
            System.out.println(ran.get());
        }

        Consumer<Employee> nombreEmpleado = employee -> System.out.println(employee.getName());
        nombreEmpleado.accept(employees.get(1));

        employees.forEach((e) -> System.out.println(e.getName()));

        employees.forEach( e -> {
            if (e.getAge() > 30) {
                System.out.println(e);
            }
        });

        Consumer<String> stringConsumer = str -> System.out.println("Estoy en clase de programación");
        stringConsumer.accept("Estoy en clase de programación");

        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(6);
        numList.add(7);
        numList.add(8);
        numList.add(9);
        numList.add(10);

        Consumer<Integer> numero = n -> System.out.println(n);
        numList.forEach(numero);

        List<String> listaString = new ArrayList<>();
        listaString.add("Hola");
        listaString.add("Lol");
        listaString.add("Hey");
        listaString.add("Patri apruebame");
        listaString.add("Adios");
        listaString.add("Subeme el 0,2 al examen");
        listaString.add("ABCDE");
        listaString.add("HeyY");
        listaString.add("Sample text");
        listaString.add("Texto inferior");

        Consumer<String> lastLetra = ltr -> System.out.println(ltr.substring(ltr.length()-1));
        listaString.forEach(lastLetra);


        Supplier<String> init = () -> "Java es un lenguaje de programación";
        String hola = init.get();
        System.out.println(hola);

        Supplier<Double> random = () -> Math.random()*100;
        System.out.println(random.get());

        Supplier<HashMap<String, String>> crearMapa = () -> new HashMap<>();

        BiConsumer<Integer, Integer> multi = (num1, num2) -> System.out.println(num1 * num2);
        multi.accept(-9, 7);
        BiConsumer<Integer, Integer> suma = (num1, num2) -> System.out.println(num1 + num2);
        suma.accept(-9, 7);
        BiConsumer<Integer, Integer> resta = (num1, num2) -> System.out.println(num1 - num2);
        resta.accept(-9, 7);
        BiConsumer<Integer, Integer> division = (num1, num2) -> System.out.println(num1 / num2);
        division.accept(-9, 7);

        calculator(-9, 7, multi);

        Map<Integer, String> mapa = new LinkedHashMap<>();
        mapa.put(1, "Primero");
        mapa.put(2, "Segundo");
        mapa.put(3, "Tercero");
        mapa.put(4, "Cuarto");
        mapa.put(5, "Quinto");

        BiConsumer<Integer, String> mm = (m1, m2) -> System.out.println(m1 + " " + m2);
        mapa.forEach(mm);


        Supplier<LocalDate> fecha = () -> LocalDate.now();
        System.out.println(fecha.get());

        Function<String, Integer> str = cadena -> cadena.length();
        System.out.println(str.apply("hola"));

        Function<Integer, Integer> pot = num -> num*num;
        System.out.println(pot.apply(4));

        System.out.println(pot.apply(str.apply("Programación")));

        List<String> listalista = Arrays.asList("hola", "adios", "buenas", "malas");

        Function<String, Integer> longitud = st -> st.length();
        System.out.println(convertirListaEnMap(listalista, longitud));

        BiFunction<Integer, Integer, Integer> sumasuma = (n1, n2) -> n1+n2;
        System.out.println(sumasuma.apply(8,7));

        BiFunction<Integer, Integer, Double> pow = (n1, n2) -> Math.pow(n1, n2);
        System.out.println(pow.apply(2, 3));

        Function<Double, String> mostrarNum = num -> "Resultado: " + num;
        System.out.println(mostrarNum.apply(23.0));

        System.out.println(mostrarNum.apply(pow.apply(2,4)));


        List<String> lista11 = Arrays.asList("Patri", "subeme", "la nota", "del examen");
        BiFunction<String,Integer,String> cond = (carac, longi) -> {
            if (carac.length() > longi) {
                return carac;
            } else {
                return null;
            }
        };

        for (String st: lista11) {
            System.out.println(cond.apply(st, 5));
        }

    }

    public static String tarea8 (BiFunction<Integer, Integer, Double> n1, Function<Double, String> n2, int i1, int i2) {
        return n2.apply(n1.apply(i1, i2));
    }

    public static <T, R> Object tarea10 (BiFunction<T, T, R> funcion, Function<R, Object> funcion2, T n1, T n2) {
        return funcion2.apply(funcion.apply(n1, n2));
    }


    public static Map<String, Integer> convertirListaEnMap(List<String> lista, Function<String, Integer> funcion) {
        HashMap<String, Integer> mapa = new HashMap<>();
        for (String str: lista) {
            mapa.put(str, funcion.apply(str));
        }
        return mapa;
    }

    public static void printEmployeeByAge(List<Employee> employees, Predicate<Employee> ageCondition) {
        for (Employee e: employees) {
            if (ageCondition.test(e)) {
                System.out.println(e.getName());
            }
        }

    }

    public static void calculator(Integer num1, Integer num2, BiConsumer consumer) {
        consumer.accept(num1, num2);
    }


}
