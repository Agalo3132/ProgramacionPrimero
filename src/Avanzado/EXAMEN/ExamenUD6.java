package ProgramacionPrimero.src.Avanzado.EXAMEN;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExamenUD6 {

    public static void matchingGame(List<Integer> numbers) {
        ListIterator<Integer> it = numbers.listIterator();
        boolean cont = true;
        int n1, n2;
        System.out.println(numbers);

        while (!cont) {
            while (it.hasNext()) {
                n1 = it.next();
                if (it.hasNext()) {
                    n2 = it.next();
                    if (n1 % 10 == n2 % 10 || n1 / 10 == n2 /10 ) {
                        it.remove();
                        it.previous();
                        it.remove();
                        cont = true;
                        System.out.println(numbers);
                    } else {
                        it.previous();
                    }
                }
                if (cont) {
                    cont = false;
                    it = numbers.listIterator();
                } else {
                    break;
                }
            }

        }

        if (numbers.isEmpty()) {
            System.out.println("Win!");
        } else {
            System.out.println("Loser!");
        }
    }

    public static void matchingGame2(List<Integer> numbers) {
        ListIterator<Integer> it = numbers.listIterator();
        boolean cont = false;
        int n1, n2;
        System.out.println(numbers);

        while (it.hasNext()) {
            n1 = it.next();
            if (it.hasNext()) {
                n2 = it.next();
                if (n1 % 10 == n2 % 10 || n1 / 10 == n2 / 10) {
                    it.add(it.previous() + 11);
                } else {
                    it.previous();
                }
            }
        }
    }

    public static void matchingGame3(List<Integer> numbers) {
        ListIterator<Integer> it = numbers.listIterator();
        int n1, n2;
        boolean cambiar = false;
        System.out.println(numbers);

        while (it.hasNext()) {
            if (it.hasNext()) {
                n1 = it.next();
                if (it.hasNext()) {
                    n2 = it.next();
                    if (n1 % 10 == n2 % 10 || n1 / 10 == n2 / 10) {
                        it.remove();
                        it.previous();
                        it.remove();
                        cambiar = true;
                        System.out.println(numbers);
                    } else {
                        it.previous();
                    }
                }
            }
            if (cambiar) {
                cambiar = true;
                it = numbers.listIterator();
            } else {
                break;
            }
        }
        if (numbers.isEmpty()) {
            System.out.println("win!");
        } else {
            System.out.println("loser!");
        }
    }





    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(10);
        number.add(10);
        number.add(12);
        number.add(23);
        number.add(33);

        //matchingGame(number);
        //matchingGame2(number);
        matchingGame3(number);

    }


}
