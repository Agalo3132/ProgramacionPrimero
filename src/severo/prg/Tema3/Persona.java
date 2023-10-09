package ProgramacionPrimero.src.severo.prg.Tema3;

public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;


    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean esAdolescente() {
        if (edad > 12 && edad < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if (nombre.isEmpty()) {
            return apellidos;
        } else if (apellidos.isEmpty()) {
            return nombre;
        } else {
            return nombre + apellidos;
        }
    }

    public static void main(String[] args) {


    }

}
