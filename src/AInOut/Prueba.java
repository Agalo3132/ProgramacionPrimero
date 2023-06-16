package AInOut;

import java.io.*;

public class Prueba {
    public static void test(String file, int number) throws IOException {
        try (OutputStream out = new FileOutputStream(file)) {
            out.write(number);
        }
        System.out.println(Integer.toBinaryString(number));
        try (InputStream input = new FileInputStream(file)) {
            System.out.println(input.read());
        }

    }

    public static void main(String[] args) {


    }


}
