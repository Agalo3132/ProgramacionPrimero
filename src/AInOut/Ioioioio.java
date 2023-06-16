package AInOut;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ioioioio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try(FileWriter fw = new FileWriter("fileW.txt")) {
            System.out.println("Escribe un número: ");
            String num1 = sc.next();
            fw.write(num1);
            fw.write(" % ");
            System.out.println("Ahora escribe otro número: ");
            String num2 = sc.next();
            fw.write(num2);
            fw.write(" = ");
            int num11 = Integer.parseInt(num1);
            int num22 = Integer.parseInt(num2);
            int resp = num11 % num22;
            String r = resp+"";
            fw.write(r);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        int ch;
        try(FileReader fr = new FileReader("fileW.txt")) {
            ch = fr.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = fr.read();
            }
        } catch (IOException ee) {
            throw new RuntimeException();
        }



    }


}
