package ProgramacionPrimero.src.severo.prg.Tema3;

public class Profesor {

    private String usuario;
    private String nombre;
    private int edad;
    private String email;
    private double salarioMensual;
    private String claveAcceso;




    public Profesor(String email) {
        this(email, "1234");
    }


    public Profesor(String email, String claveAcceso) {
        this.email = email;
        this.claveAcceso = claveAcceso;
        this.nombre = "XX";
    }


    /**
    public Profesor() {
        this.salarioMensual = 1000;
    }
     **/

    public Profesor(int edad, String usuario) {
        this.edad = edad;
        this.usuario = usuario;
    }

    public Profesor(int edad) {
        this(edad, "cambiar");
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }
}
