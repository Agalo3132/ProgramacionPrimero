package ProgramacionPrimero.src.AInOut;

import java.io.IOException;
import java.io.RandomAccessFile;

public class AccesoRnadom {
    public static void main(String[] args) {
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile("fileF.txt", "rw");
            file.seek(file.length());
            file.writeChar('H');
            file.writeInt(23);
            file.writeDouble(2.3);
            file.seek(0);
            char ff = file.readChar();
            int fff = file.readInt();
            double ffff = file.readDouble();
            System.out.println(ff+ " " + fff+ " " + ffff);

            file.seek(1);
            int str = file.read();
            System.out.println(str);

            file.seek(file.length());
            file.write(str);
            file.writeBoolean(true);

            file.seek(3);
            int ss = file.read();
            System.out.println(ss);

            file.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
