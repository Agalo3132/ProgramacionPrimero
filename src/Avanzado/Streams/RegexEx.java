package ProgramacionPrimero.src.Avanzado.Streams;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx {
    public static void main(String[] args) {
        String expre = "He ido al (cine|supermercado)";
        System.out.println("He ido al cine".matches(expre));
        System.out.println("He ido al supermercado".matches(expre));

        Pattern pat = Pattern.compile(expre);
        Matcher matc = pat.matcher("He ido al cine");
        Matcher matc2 = pat.matcher("He ido al supermercado");
        System.out.println(matc2.matches());
        System.out.println(matc.matches());


        String b = "Ciclo formativo Desarrollo de aplicaciones multiplataforma.";
        System.out.println(b.replaceAll(" ", "_"));


        String cc = "aaabcccccccdddefffg";
        String rrgx = "[a]{3}[b]{1}[c]{7}[d]{3}[e]{1}[f]{3}[g]{1}";
        Pattern pat2 = Pattern.compile(rrgx);
        Matcher masds = pat2.matcher(cc);
        System.out.println(masds.matches());

        String rrgx2 = "^a.*g$";
        Pattern pat3 = Pattern.compile(rrgx2);
        Matcher masds2 = pat3.matcher(cc);
        System.out.println(masds2.matches());


        String rr = "abcdge.1234";
        String rrgx3x = "^[a-z].*[1-9]$";
        Pattern pat4 = Pattern.compile(rrgx3x);
        Matcher master = pat4.matcher(rr);
        System.out.println(master.matches());

        String rex4 = "abcde.1234jd.6tjuk.000";
        String rrgx3xCop = "(([0-9]))";

        Pattern pat5 = Pattern.compile(rrgx3xCop);
        Matcher master23 = pat5.matcher(rex4);
        master23.reset();
        while (master23.find()) {
            System.out.print(master23.group(1));
        }

        String rx5 = "abcde.1234\tjd.6\ttjuk.000\n";
        String rerer = "(?s)(([0-9]))";
        Pattern p6 = Pattern.compile(rerer);
        Matcher ma = p6.matcher(rx5);
        System.out.println(ma.matches());


        String postal = "03204";
        String codeP = "[0-9]{5}";
        Pattern pCp = Pattern.compile(codeP);
        Matcher mCp = pCp.matcher(postal);
        //System.out.println(mCp.matches());

        String masterCard = "1234 5678 9012 3456";
        String codeMm = "[0-9]{4}[ ][0-9]{4}[ ][0-9]{4}[ ][0-9]{4}";
        Pattern pMc = Pattern.compile(codeMm);
        Matcher mMc = pMc.matcher(masterCard);
        System.out.println(mMc.matches());

        String correo = "test2@gmail.com";
        String codeCorreo = "[a-z]*[@]";
        Pattern pCr = Pattern.compile(codeCorreo);
        Matcher mCc = pCr.matcher(correo);
        System.out.println(mCc.matches());

    }
}
