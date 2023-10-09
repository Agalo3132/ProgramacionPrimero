package ProgramacionPrimero.src.severo.prg;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] arg) {


        System.out.print("Introduce un número:");
        Scanner sc = new Scanner(System.in);
        byte numero = sc.nextByte();
        System.out.println("Has introducido el número: " + numero);
        System.out.print("Introduce un número:");
        Scanner sc2 = new Scanner(System.in);
        short numero2 = sc2.nextShort();
        System.out.println("Has introducido el número: " + numero2);
        System.out.print("Introduce un número:");
        Scanner sc3 = new Scanner(System.in);
        int numero3 = sc3.nextInt();
        System.out.println("Has introducido el número: " + numero3);
        System.out.print("Introduce un número:");
        Scanner sc4 = new Scanner(System.in);
        long numero4 = sc4.nextLong();
        System.out.println("Has introducido el número: " + numero4);
        System.out.print("Pon true o false:");
        Scanner sc5 = new Scanner(System.in);
        boolean numero5 = sc5.nextBoolean();
        System.out.println("Has introducido: " + numero5);
        System.out.print("Introduce un texto:");
        Scanner sc6 = new Scanner(System.in);
        String numero6 = sc6.nextLine();
        System.out.println("Has introducido este texto: " + numero6);


        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm");
        String formatted = formatter.format(ldt);
        System.out.println(formatted);


        System.out.println("Elige una opción");
        Scanner sc111 = new Scanner(System.in);
        int numeros = sc111.nextInt();
        System.out.println("Has elegido el menú: " + numeros);
        Scanner sc11 = new Scanner(System.in);
        String menu = ("""
                *****                   MENÚ DE SELECCIÓN               *****
                ***** 1. Calamares.                                     *****
                ***** 2. Paella.                                        *****
                ***** 3. Helado de chocolate.                           *****
                ***** 4. No sentarme en este restaurante porque es caro *****
                """);
        System.out.print(menu);


        LocalDateTime ldt2 = LocalDateTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE");
        String formatted2 = formatter2.format(ldt2);
        System.out.println(formatted2);

        System.out.println("La fecha dentro de 1 dia: " + LocalDate.now().plusDays(1) );


        String str = "cadena";

        Scanner scan = new Scanner( System.in );
        String respuesta;
        System.out.print("¿Está lloviendo? (Y or N): ");
        respuesta = scan.nextLine();

        if (respuesta.equals("Y")) {
            System.out.println("Activa limpiaparabrisas");
        } else {
            System.out.println("Desactiva limpiaparabrisas");
        }

        int numJugadores = 1;
        if (numJugadores == 1) {
            System.out.println("Single Player");
        } else if (numJugadores == 2) {
            System.out.println("Two Players");
        }



        /**
         *
        String text = sc.nextLine();
        String text2 = sc.next();
        System.out.println("text =" + text);
        System.out.println("text2 =" + text2);
        **/



    }
}
