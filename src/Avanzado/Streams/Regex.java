package Avanzado.Streams;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        String texto = "Él compra patatas";
        System.out.println(texto.replaceAll("Él", "Ella"));

        String a = "abcDeeeT67uuiiiijjj83";
        System.out.println(a.replaceAll(".", "Z"));
        System.out.println(a.replaceAll("^abcDeee", "JAVA"));
        System.out.println(a.replaceAll("[abe]", "X"));
        System.out.println(a.replaceAll("[ace][TD]", "X"));


        String b = "hola texto hola";
        System.out.println(b.replaceAll("^hola", "ei"));
        System.out.println(b.replaceAll("hola$", "ei"));

        String c = "aabbccddaa";
        System.out.println(c.matches("aabbccddaa"));
        System.out.println(c.matches("aa$"));
        System.out.println(c.matches("^a.*a$"));
        System.out.println(c.matches(".*"));
        System.out.println(c.matches("[a-z]*"));

        String f = "abcDeeFG345jjj9";
        System.out.println(f.replaceAll("[abcdef345678]", "o"));
        System.out.println(f.replaceAll("[a-f3-8]", "o"));
        System.out.println(f.replaceAll("(?i)[a-f3-8]", "o"));
        System.out.println(f.replaceAll("[0-9]", "o"));
        System.out.println(f.replaceAll("\\d", "o"));
        System.out.println(f.replaceAll("\\D", "o"));

        String g = "Tenemos tabulación\t y salto de linea\n";
        System.out.println(g.replaceAll("[\t\n]", ""));
        System.out.println(g.replaceAll("\\s", ""));
        System.out.println(g.replaceAll("\\S", ""));
        System.out.println("Hola");
        System.out.println(g.replaceAll("\\w", ""));
        System.out.println(g.replaceAll("\\W", ""));

        String a2 = "abcDeeeT67uuiiiijjj83";
        System.out.println(a2.replaceAll("u{2}", "X"));
        System.out.println(a2.replaceAll("u+", "X"));
        System.out.println(a2.replaceAll("u*", "X"));
        System.out.println(a2.replaceAll("i{1,4}", "X"));
        System.out.println(a2.replaceAll("u+j*j]3", "X"));

        String num = "(96) 667-24-42";
        System.out.println(num.matches("\\(96\\)[ ]\\d{3}[-]\\d{2}[-]\\d{2}"));
        String rg = "[a-zA-Z]{5}[ ][0-9]{4}[-][0-9]{4}$";
        String rg2 = "^\\w{5}[ ][0-9]{4}[-][0-9]{4}$";

        String texto2 = "Curso 2022-2023";
        System.out.println(texto2.matches(rg));
        System.out.println(texto2.matches(rg2));

        System.out.println("----------------------------------------");
        StringBuilder html = new StringBuilder("<h1>Head</h1>");
        html.append("<h2>Etiqueta h2 de encabezado</h2>");
        html.append("<p>Esto es un párrafo</p>");
        html.append("<h2>Rsumen</h2>");
        html.append("<p>Fin del html</p>");

        Pattern pattern = Pattern.compile("(<h2>(.*)</h2>)");
        Matcher matcher = pattern.matcher(html);
        System.out.println(matcher.matches());

        int i = 0;
        matcher.reset();
        while (matcher.find()) {
            System.out.println("Coincidencia " + matcher.group(2));
        }


        String expre = "He ido al (cine|supermercado)";
        System.out.println("He ido al cine".matches(expre));
        System.out.println("pablo".matches("[Pp]ablo"));
        System.out.println("pablo".matches("(P|p)ablo"));
        System.out.println("pablo".matches("[P|p]ablo"));

        System.out.println("pablo".matches("[Pp]abc"));

        String cd = "crcdctc";
        //String expreR = "c[^d]";
        String expreR = "c(?!d)";
        String expreRR = "c(?=d)";
        System.out.println(cd.matches(expreR));
        Pattern pat = Pattern.compile(expreR);
        Matcher matc = pat.matcher(cd);
        System.out.println(matc.matches());

        /**
        int i2 = 0;
        while (matc.find()) {
            i2++;
            System.out.println("Coincidencia " + i2 + " " + matc.start() + " " + matc.end());
        }
         **/


        /**
        String regex2 = "^\\(\\+\\d{1,4})[ ](\\d{3}[-]\\d{3})$";
        String n1 = "(+4007) 741-852-965";
        String n2 = "(+) 487-584-658";
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(n1);
        **/

        String regex3 = "[aA-zZ1-9]{1,}[@][aA-zZ]{1,}[.][aA-zZ]{1,}$";
        String das = "alvarosermar38@gmail.com";
        Pattern pp = Pattern.compile(regex3);
        Matcher mm = pp.matcher(das);
        System.out.println(mm.matches());











    }
}
