package severo.prg.morralla;

public class Mon {
    public static void main(String[] args) {
        String str = reemplazar("hola", 3);
        System.out.println(str);

        String str1 = reemplazar("hola", 0);



    }

        public static String reemplazar(String str, int n) {

        String concatenado = " ";
        for (int i = 0; i < n; i++) {
            concatenado = concatenado.concat(str);
        }

        return concatenado;
        }

    }

