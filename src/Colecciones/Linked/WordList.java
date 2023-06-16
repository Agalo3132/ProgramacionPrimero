package Colecciones.Linked;

//Un atributo LinkedList de Word llamamos words

//Construyo la lista vacía

//Método: void addWord(Word word) --> añade palabra a la lista

//Sobreescribir o anular --> toString();

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class WordList {
    private LinkedList<Word> words;


    public WordList() {
        this.words = new LinkedList<>();
    }

    public void addWord(Word word) {
        words.add(word);
    }


    @Override
    public String toString() {
        if (words == null || words.isEmpty()) {
            return "-------- Lista vacia ---------";
        } else {
            StringBuilder sb = new StringBuilder();
            Iterator<Word> it = words.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString()).append(' ');
            }
            return sb.toString();
        }
    }

    //Elimina palabra tipo: palabra-exit
    public void removeExtraneousWords() {
        for (Iterator<Word> it = words.iterator(); it.hasNext(); ) {
            String word = it.next().getTerm();
            if (words.contains("-")) {
                it.remove();
            }
        }
    }

    public void deleteDotWords() {
        for (ListIterator<Word> it = words.listIterator(); it.hasNext(); ) {
            String word = it.next().getTerm();
            if (word.endsWith(".")) {
                it.remove();
                if (it.hasNext()) {
                    it.hasNext();
                    it.remove();
                }
            } else if (word.endsWith(",")) {
                it.remove();
                if (it.hasPrevious()) {
                    it.hasPrevious();
                    it.remove();
                }
            }
        }
    }

    public void toUpperWord() {
        for (ListIterator<Word> it = words.listIterator(); it.hasNext(); ) {
            String word = it.next().getTerm();
            if (it.hasNext()) {
                String wordNext = it.next().getTerm();
                if (word.endsWith(".") && !Character.isUpperCase(word.charAt(0))) {
                    String nameCapitalized = wordNext.substring(0, 1).toUpperCase() + wordNext.substring(1);
                    Word capitalLetter = new Word(nameCapitalized);
                    it.set(capitalLetter);
                    /*it.previous();
                    it.add(capitalLetter);
                    it.next();
                    it.remove();
                    it.previous();
                } else {*/
                    it.previous();
                }
            }
        }

    }


    public void deleteFinalWord() {
        for (ListIterator<Word> it = words.listIterator(); it.hasNext(); ) {
            String word = it.next().getTerm();
            if (it.hasNext()) {
                String wordNext = it.next().getTerm();
                if (word.endsWith(".") && !Character.isUpperCase(word.charAt(0))) {
                    it.previous();
                    it.previous();
                    it.remove();
                    it.next();
                    it.remove();
                } else {
                    it.previous();
                }
            }
        }
    }



}
