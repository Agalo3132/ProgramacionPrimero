package ProgramacionPrimero.src.Avanzado;

import java.util.function.Supplier;

interface caracteresPares{
    public String texto(String texto);
}
public class Av {

    public static void main(String[] args) {
        caracteresPares cp = (String texto) -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < texto.length(); i++) {
                if (i % 2 == 0) {
                    sb.append(texto.charAt(i));
                }
            }
            return sb.toString();
        };

        Supplier<String> prg = () -> "Estoy en clase de programación";
        String textoPrg = prg.get();
        System.out.println(textoPrg);

    }
}
