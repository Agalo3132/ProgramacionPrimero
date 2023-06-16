package Colecciones.Linked;

//tendremos un atributo cadena llamado term

//constructor se le pasa un texto, asigna a la variable term, lo que devuelve validation de ese texto

//tendré un método estático llamado validation que se le pasa un string y devuelve un string
//valida que el string que me pasan sea una palabra
//hola mundo --> hola, si el texto que me pasan esta vacio o es nulo, devuelvo ""
public class Word {
    private String term;

    public Word(String text) {
        this.term = validation(text);
    }

    public static String validation(String text) {
        if (text != null || text.isEmpty()) {
            int index = text.indexOf(" ");
            if (index == -1) {
                return text;
            } else {
                return text.substring(0, index);
            }
        }
        return "";
    }

    public String getTerm() {
        return term;
    }

    @Override
    public String toString() {
        return term;
    }
}
