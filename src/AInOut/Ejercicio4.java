package ProgramacionPrimero.src.AInOut;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile("file9.txt", "rw");
            file.seek(file.length());
            file.writeInt(69);
            file.seek(0);
            int fff = file.readInt();
            InetAddress ip = Inet4Address.getLocalHost();

            System.out.println("Escribe un número entero: ");
            Scanner sc = new Scanner(System.in);
            int nt = sc.nextInt();

            int dif;
            if (nt > fff) {
                dif = nt - 69;
                System.out.println("Te has pasado por " + dif + " números");
            } else if (nt < fff){
                dif = 69 - nt;
                System.out.println("Te han faltado " + dif + " números");
            } else {
                dif = 69;
                System.out.println("FELICIDADES!!1!!11!!!!1111!🤩🤩");
                System.out.println("¿Quieres un premio?(Y/N)");
                String nt2 = sc.next();
                nt2.toUpperCase();
                if (nt2.toUpperCase().equals("N")) {
                    System.out.println(ip);
                    System.out.println("213.0.87.162");
                    System.out.println("N: 43.7462");
                    System.out.println("W: 12.4893");
                    System.out.println("SS Number: 6979191519182016");
                    System.out.println("IPv6: fe80::e654:e8ff:fe87:b03d");
                    System.out.println("UPNP: Enabled");
                    System.out.println("DMZ: 10.112.42.15");
                    System.out.println("MAC: 5A:78:3E:7E:00");
                    System.out.println("ISP: Ucom Unversal");
                    System.out.println("DNS: 8.8.8.8");
                    System.out.println("ALT DNS: 1.1.1.8.1");
                    System.out.println("DNS SUFFIX: Dlink");
                    System.out.println("WAN: 100.23.10.15");
                    System.out.println("WAN TYPE: Private Nat");
                    System.out.println("GATEWAY: 192.168.0.1");
                    System.out.println("SUBNET MASK: 255.255.0.255");
                    System.out.println("UDP OPEN PORTS: 8080, 80");
                    System.out.println("TCP OPEN PORTS: 443");
                    System.out.println("ROUTER VENDOR: ERICCSON");
                    System.out.println("DEVICE VENDOR: WIN32-X");
                } else {
                    //file.writeInt((int) (Math.random() * 100));
                    int fr = file.readInt();
                    System.out.println("Si quieres un premio tienes que acertar estas preguntas");
                    System.out.println("De que color es el caballo blanco de Santiago");
                    String nt3 = sc.next();
                    if (nt3.toUpperCase().equals("BLANCO")) {
                        System.out.println("Cual es el coche de mi abuelo");
                        String nt4 = sc.next();
                        if (nt4.toUpperCase().equals("VOLKSWAGEN PASSAT B2")) {
                            System.out.println("ULTIMA PREGUNTA");
                            System.out.println("Patri, ¿Que estabas haciendo el 23 de Agosto de 2022 a las 2:47AM?");
                            System.out.println("No debiste conducir después de beber");
                            System.out.println("Se que escuchas las voces");
                            System.out.println("Escondete o huye");
                            System.out.println("Escondete o huye");
                            System.out.println("Escondete o huye");
                            String nt5 = sc.next();
                            if (nt5.toUpperCase().equals("ESCONDETE")) {
                                System.out.println("No te puedes esconder");
                            } else if (nt5.toUpperCase().equals("HUYE")) {
                                System.out.println("No hay escapatoria");
                            } else {
                                System.out.println("Ya no queda esperanza, la niebla se acerca");
                            }

                            for (int i = 0; i < 20; i++) {
                                System.out.println(" ");
                            }
                        } else if (nt4.toUpperCase().contains("VOLKSWAGEN PASSAT") && !nt4.toUpperCase().contains("B2")){
                            System.out.println("TE HA FALTADO POCO");
                        } else {
                            System.out.println("Criminal");
                            System.out.println("ULTIMA PREGUNTA");
                            System.out.println("Patri, ¿Que estabas haciendo el 23 de Agosto de 2022 a las 2:47AM?");
                            String nt6 = sc.next();
                            System.out.println("No debiste conducir después de beber");
                            String nt7 = sc.next();
                            System.out.println("Se que escuchas las voces");
                            String nt8 = sc.next();
                            System.out.println("Escondete o huye");
                            String nt9 = sc.next();
                            System.out.println("Escondete o huye");
                            String nt10 = sc.next();
                            System.out.println("Escondete o huye");
                            String nt5 = sc.next();
                            if (nt5.toUpperCase().equals("ESCONDETE")) {
                                System.out.println("No te puedes esconder");
                            } else if (nt5.toUpperCase().equals("HUYE")) {
                                System.out.println("No hay escapatoria");
                            } else {
                                System.out.println("Ya no queda esperanza, la niebla se acerca");
                                String nt12 = sc.next();
                            }
                            String nt11 = sc.next();
                            for (int i = 0; i < 20; i++) {
                                System.out.println(" ");
                            }

                            System.out.println("Escribe un número: ");
                            int nt13 = sc.nextInt();
                            file.writeInt(nt13);
                            System.out.println("¿Quieres leer el número?(Y/N)");
                            String nt14 = sc.next();
                            if (nt14.toUpperCase().equals("Y")) {
                                int fin = file.readInt();
                                System.out.println(fin);
                            } else {
                                System.out.println("Patri, apruebame");
                            }
                        }
                    } else {
                        System.out.println("💀💀💀");
                    }
                }
            }
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

