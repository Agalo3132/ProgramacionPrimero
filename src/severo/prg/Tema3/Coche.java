package severo.prg.Tema3;

public class Coche {
    private int puertas;
    private double peso;
    private double precio;
    private String motor;
    private String modelo;
    private String color;
    private String marca;

    public int getPuertas() {
        return puertas;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMotor() {
        return motor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
