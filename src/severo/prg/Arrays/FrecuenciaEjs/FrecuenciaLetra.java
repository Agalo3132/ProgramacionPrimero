package severo.prg.Arrays.FrecuenciaEjs;

public class FrecuenciaLetra {
    private char letra;
    private int frecuencia;

    public FrecuenciaLetra(char letra, int frecuencia) {
        this.letra = letra;
        this.frecuencia = frecuencia;
    }

    public char getLetra() {
        return letra;
    }

    public int getFrecuencia() {
        return frecuencia;
    }


    public int incrementar() {
        return frecuencia++;
    }
}
