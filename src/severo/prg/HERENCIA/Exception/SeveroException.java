package ProgramacionPrimero.src.severo.prg.HERENCIA.Exception;

public class SeveroException extends Exception {

    private final ErrorCode errorCode;

    public SeveroException(ErrorCode errorCode) {
        this.errorCode=errorCode;
    }

    public SeveroException(ErrorCode errorCode, String message){
        super(message);
        this.errorCode=errorCode;
    }

    public SeveroException(ErrorCode errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode=errorCode;
    }
}
