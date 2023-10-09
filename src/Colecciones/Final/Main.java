package ProgramacionPrimero.src.Colecciones.Final;

public class Main {
    public static void main(String[] args) {
        int miContraseña = 44320;
        Password password = new Password(44320);
        password.guardarContraseña();
        password.encriptarDesencriptar(miContraseña);
        password.iniciarSesion(miContraseña);
        PasswordAmpliada passwordAmpliada = new PasswordAmpliada(44320);
        passwordAmpliada.guardarContraseña();
    }
}
