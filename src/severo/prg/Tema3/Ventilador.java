package severo.prg.Tema3;

public class Ventilador {

    private String color;
    private int numAspas;
    private boolean isOn;

    public String getColor() {
        return color;
    }

    public int getNumAspas() {
        return numAspas;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumAspas(int numAspas) {
        this.numAspas = numAspas;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public static void main(String[] args) {
        Ventilador ventilador = new Ventilador();
        ventilador.setColor("blanco");
        ventilador.setNumAspas(3);
        ventilador.setOn(false);

        System.out.println(ventilador.color);
        System.out.println(ventilador.numAspas);
        System.out.println(ventilador.isOn);
    }
}
