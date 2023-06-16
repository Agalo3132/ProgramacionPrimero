package severo.prg.morralla;

public class Succ {
    public static void main(String[] args) {
        //-1 2 -3 4 -5 6 -7 8 .. n

        /**
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el limite");
        int limit = sc.nextInt();
        int num = -1;
        int i = 2;
        int contador;


        while (i <= num) {
            int resta = 1 - i;
            System.out.print(resta + " ");
            System.out.print(i + " ");
            i+=2;
        }


        for (i = 1; i <= limit; i+=2) {
            System.out.println((i * (-1)) + " ");
            if ((i+1) <= limit) {
                System.out.println((i+1) + " ");
            }
        }
         **/





        String str1 = "Frodo Baggins";
        String str2 = "Gandalf the Gray";


        System.out.println(str1.length());
        System.out.println(str2.charAt(0));
        System.out.println(str1.indexOf("o"));

        System.out.println(str1.substring(4));
        System.out.println(str2.substring(3, 14));
        System.out.println(str2.replace("a", "oo"));



    }
}
