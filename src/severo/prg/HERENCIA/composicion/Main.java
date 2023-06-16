package severo.prg.HERENCIA.composicion;

import severo.prg.HERENCIA.Exception.ErrorCode;
import severo.prg.HERENCIA.Exception.SeveroException;

public class Main {

    public static void main(String[] args) throws SeveroException {
        //Ni caso al try catch
        try {
            calcularHoras(1);
        } catch (SeveroException e) {

        }

    }



    public static void calcularHoras(int horas) throws SeveroException {
            try{
                Procesador procesador = new Procesador("Intel", 2,3);
                Monitor monitor = new Monitor("HP","2000x1000",24);
                Teclado teclado = new Teclado("negro", 90);


                Ordenador ordenador= new Ordenador(monitor, procesador, teclado);

                ordenador.mostrarLogo();
                ordenador.encender();
                ordenador.getTeclado().pushKey('c');
            } catch (ArithmeticException e) {
                if (horas < 0) {
                    throw new SeveroException(ErrorCode.PROFESOR_BAJA, e.getMessage(), e);
                }
            }
        }

    }


