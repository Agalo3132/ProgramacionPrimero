package ProgramacionPrimero.src.Colecciones.Final;

public class Password {
    private final int clave = 67294358;
    private int encript;
    public Password(int encript) {
        this.encript = encript;
    }
    public int encriptarDesencriptar(int contraseña) {
        return contraseña^encript;
    }
    public void guardarContraseña() {
        System.out.println("La contraseña se ha guardado como " + encript);
    }
    public boolean iniciarSesion(int contraseña) {
        int passwdCripted = encriptarDesencriptar(contraseña);
        if (passwdCripted == encript) {
            System.out.println("Bienvenido");
            return true;
        } else {
            System.out.println("Error al iniciar sesion. Contraseña incorrecta");
            return false;
        }
    }
}
