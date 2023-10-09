package ProgramacionPrimero.src.severo.prg.Arrays.FrecuenciaEjs;

public class AnalizadorFrecuencias {
    private FrecuenciaLetra[] frecuencias;

    public AnalizadorFrecuencias() {
        frecuencias = new FrecuenciaLetra[26];
        int letter = 'A';
        for (int i = 0; i < frecuencias.length; i++) {
            char letra = (char) letter;
            FrecuenciaLetra f = new FrecuenciaLetra(letra, 0);
            frecuencias[i] =f;
            letter++;
        }
    }

    public void contarLetras() {

    }


}
