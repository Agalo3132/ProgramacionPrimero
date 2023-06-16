package severo.prg;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


/**
 * Clase encargada de la entrada del programa principal
 * texto inferior
 */
public class Main {

    /**
     * Método principal
     * @param args Argumentos de entrada
     *
     */

    public static void main(String[] args) {
        System.out.println("Hello World");
        int number = 10; //declaración
        int number2 = 8;
        number = number + 2;
        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);
        System.out.println(number);
        number = number2;

        /*
        No rellena nada
         */
        PuntosCardinales pc = PuntosCardinales.OESTE;
        System.out.println(pc);

        long ele = 10L;
        long eledoble = 10;

        char c = 'A';


        int num1 = 10;
        int num2 = 8;
        int total = num1 + num2;
        System.out.println(total);

        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println(maxByteValue);

        //byte b = 128;

        double decimal = 56.67;
        char character = 'd';
        boolean isEmpty = true;

        String cadena = "texto de ejemplo";
        System.out.println(cadena.isEmpty());
        System.out.println(cadena.toUpperCase(Locale.ROOT));
        cadena = "texto inferior";



        int renta = 98988;
        int tax = 2;

        int z = 2;
        int y = 1;
        int x = 0;
        y = z;
        x = y;
        System.out.println(x);
        System.out.println(y);

        System.out.println(2 + "bc");
        System.out.println(2 + 3 + "bc");
        System.out.println((2+3) + "bc");
        System.out.println("bc" + (2+3));
        System.out.println("bc" + 2 + 3);

        System.out.println(6);
        System.out.println((6+5));
        System.out.println(-4);
        System.out.println(6 + 5);
        System.out.println((6+5) * -4);


        byte b = Byte.MAX_VALUE;
        byte bb = Byte.MIN_VALUE;
        b++;//b=b+1 y b-- es igual a b=b-1
        bb--;
        System.out.println(b);
        System.out.println(bb);

        short s = Short.MAX_VALUE;
        short ss = Short.MIN_VALUE;
        s++;
        ss--;
        System.out.println(s);
        System.out.println(ss);

        long l = Long.MAX_VALUE;
        long ll = Long.MIN_VALUE;
        l++;
        ll--;
        System.out.println(l);
        System.out.println(ll);

        long myLongNumber = 500;
        System.out.println(myLongNumber);

        long longNumber = 2_147_483_647_999L;
        System.out.println(longNumber);


        short s1 = 10;
        byte b1 = 40;
        s1 = b1;
        System.out.println(s1);
        System.out.println(b1);

        long l2 = 30;
        short s2 = 70;
        l2 = s2;
        System.out.println(l2);
        System.out.println(s2);

        short s3 = 15;
        int i3 = 90;
        i3 = s3;
        System.out.println(s3);
        System.out.println(i3);


        byte b11 = 4;
        int i11 = 5;
        short s11 = 6;
        long ss2 = s11 + i11 + b11;
        System.out.println(ss2);

        float maxFloatValue = Float.MAX_VALUE;
        System.out.println(maxFloatValue);
        float minFloatValue = Float.MIN_VALUE;
        System.out.println(minFloatValue);
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println(maxDoubleValue);
        double minDoubleValue = Double.MIN_VALUE;
        System.out.println(minDoubleValue);

        float f1 = 20;
        double d1 = 30;
        d1 = f1;
        System.out.println(d1);
        System.out.println(f1);

        float f2 = 30;
        double d2 = 20;
        d2 = f2;
        System.out.println(d2);
        System.out.println(f2);

        char a = 'P';
        char k23 = '9';
        char z2 = '\u00A2';
        boolean eso = true;
        System.out.println(a);
        System.out.println(k23);
        System.out.println(z2);
        System.out.println(eso);

        //Conversiones(casting) explicitas e implicitas
        byte bbb = 2;
        short sss = bb;
        int iii = 8;

        bbb = (byte) sss;
        bbb = (byte) iii;

        bbb = (byte) (2 + bbb);


        Date date = new Date();//java.util no NO MAL
        //date.getDate();

        LocalDate ld = LocalDate.now();//Fecha
        System.out.println(ld);

        LocalTime lt = LocalTime.now();//Hora

        LocalDateTime ldt = LocalDateTime.now();//Fecha y hora

        //number = 4 - number; //asignación


        int io = 7;
        //System.out.println(++io);//io=io+1(en este primero lo suma y luego lo muestra)
        //System.out.println(io++);//io=io+1(en este primero muestra el io(en este caso sera 7) y luego le suma el +1(aunque no salga para la siguiente vez que lo uses ya estara sumado))
        //ejemplo
        //System.out.println(io++);//mostrara 9
        //System.out.println(io);//ahora mostrara 10
        //System.out.println(io++);//mostrara 10
        //System.out.println(io);//ahora mostrar 11

        int jj = ++io + io++ + io++;//8 + 8(9) + 9(10) = 25
        int zz = --io + io--;//6 + 6(5)
        System.out.println(jj);
        System.out.println(io);//es 9

        boolean vacio = true;
        boolean novacio = !vacio;



        System.out.println((3 + 2) -1);

        float aa = 3.2f;

        float aaa = 2.1f;
        float cc = aaa;


        boolean aaaa, bbbb;
        aaaa = false;
        bbbb = true;

        int xxx;
        int r;
        xxx = 1;
        r = xxx + 1;

        String ssssss = "Esto es string";
        System.out.println(ssssss);


        String str = "abc";

        String mayu = str.toUpperCase();
        System.out.println(mayu);

        String maya = str.toLowerCase();
        System.out.println(maya);

        String maye = str.repeat(2);
        System.out.println(maye);


        System.out.println(5*5);
        System.out.println(8*4);
        System.out.println((18 * 15) / 2);
        System.out.println(3.14 * (7.5 * 7.5));
        System.out.println(2 * 3.14 * 7.5);

        char a1;
        char l1;
        char v1;
        char r1;
        char o1;

        a1 = 'a';
        l1 = 'l';
        v1 = 'V';
        r1 = 'r';
        o1 = 'o';

        String nombre = """
                        A           L       V           v        A        RRRRRRRR    OOOOOOOOO  
                       A A          L        V         v        A A       R       R   O       O
                      A   A         L         V       v        A   A      RRRRRRRR    O       O    
                     A     A        L          V     v        A     A     R R         O       O
                    AAAAAAAAA       L           V   v        AAAAAAAAA    R  R        O       O
                   A         A      L            V v        A         A   R   R       O       O
                  A           A     LLLLLLLL      v        A           A  R    R      OOOOOOOOO
                
                
                """;


        System.out.println(nombre);


        //int jk;
       // jk -=7;// jk = jk - 7
        //jk /=2;// jk = jk / 2
        //jk %=7;// jk = jk / 7

        int are = 20;
        int bre = 10;


        System.out.println(12/3); //resultado: 4, tipo de dato devuelto: int
        System.out.println(12/8); //resultado: 1 , tipo de dato devuelto: int
        System.out.println(11.0/6.0); //resultado: 1.83 , tipo de dato devuelto: float
        System.out.println(1.0/2.0); //resultado: 0.5 , tipo de dato devuelto: double
        System.out.println(12/6); //resultado: 2 , tipo de dato devuelto: int
        System.out.println(11/2); //resultado: 5 , tipo de dato devuelto: int
        System.out.println(2.0/4.0); //resultado: 5 , tipo de dato devuelto: int



        System.out.println(1/2F + 1/2F);

        System.out.println(9/10F);
        System.out.println(-9/10F);

        //Almacena el valor de PI
        final double PI = 3.14;

        int nota = 7;
        String notaFinal = (nota >= 5) ? "Aprobado" : "Suspendido";
        System.out.println(notaFinal);


        System.out.print("Programa");
        System.out.println(" Java");
        //System.err.println(1);

        System.out.print("Introduce texto:");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String text2 = sc.next();
        System.out.println("text =" + text);
        System.out.println("text2 =" + text2);



        /**
        int numnum = sc.nextInt();
        int numnum2 = sc.nextInt();
        System.out.println("numnum = " + numnum);
        System.out.println("numnum2 = " + numnum2);
        **/


    }

}
