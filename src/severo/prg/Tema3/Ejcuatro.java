package severo.prg.Tema3;

public class Ejcuatro {

    public static boolean getIndice(String text1, String text2){
        return text1.contains(text2);
    }



    public static void main(String[] args) {
        System.out.println(getIndice("Hola caracola","Hola"));
    }
}
