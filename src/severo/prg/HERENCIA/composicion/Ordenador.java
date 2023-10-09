package ProgramacionPrimero.src.severo.prg.HERENCIA.composicion;

public class Ordenador {

    private Monitor monitor;
    private Procesador procesador;
    private Teclado teclado;

    public Ordenador(Monitor monitor, Procesador procesador, Teclado teclado) {
        this.monitor = monitor;
        this.procesador = procesador;
        this.teclado = teclado;
    }


    public void encender(){
        this.getProcesador().presionarBotonEncendido();
        mostrarLogo();
    }

    public void mostrarLogo() {
        getMonitor().dibujaPixek(1,2);
    }


    private Monitor getMonitor() {
        return monitor;
    }

    private void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    private Procesador getProcesador() {
        return procesador;
    }

    private void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }
}
