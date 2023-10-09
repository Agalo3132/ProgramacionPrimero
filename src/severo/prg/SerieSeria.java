/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionPrimero.src.severo.prg;

/**
 *
 * @author J.Rodríguez.
 * Muestra la serie 2 5 7 10 12 .. 1800 por consola.
 */
public class SerieSeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 2;
        while (num <= 1800) {
            System.out.print(num + " ");
            num += 3;
            System.out.print(num + " ");
            num += 2;

        }

    }
}
