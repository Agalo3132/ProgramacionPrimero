package ProgramacionPrimero.src.severo.prg.HERENCIA.Exception;

public class RainException extends Exception{

    private final CodigoErrores codigoErrores;

    public RainException(CodigoErrores codigoErrores) {
        this.codigoErrores = codigoErrores;
    }

    public RainException(CodigoErrores codigoErrores, String message){
        super(message);
        this.codigoErrores=codigoErrores;
    }

    public RainException(CodigoErrores codigoErrores, String message, Throwable cause) {
        super(message, cause);
        this.codigoErrores=codigoErrores;
    }
}
