package Colecciones.Final;

public class PasswordAmpliada extends Password {
    private int contraDesencriptada;

    public PasswordAmpliada(int encript) {
        super(encript);
        contraDesencriptada = encript;
    }

    public void guardarContraseña() {
        System.out.println("La contraseña se ha guardado como -> " + contraDesencriptada);
    }
}
