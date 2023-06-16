/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package severo.prg.Entornos;

class OrdenaAlgoritmo {
	
	 public static void ordenar( int [] arreglo) {
	 int pasadas = 0;
	 int comparaciones = 0;
	 for (int i = 0; i < arreglo.length; i++) {
	     ++pasadas;
	     for (int j = 0; j < arreglo.length - 1; j++) {
	  ++comparaciones;
	  if (arreglo[j] > arreglo[j + 1]) {
	      intercambiar(arreglo, j, j+1);
	  }
	     }
	 }
	 estadisticas(pasadas, comparaciones);
	    }



	    private static void intercambiar(int [] arreglo, int a, int b) {
	 int tmp = arreglo[a];
	 arreglo[a] = arreglo[b];
	 arreglo[b] = tmp;
	    }

	    private static void estadisticas( int pasadas, int comparaciones) {
	 System.out.println( "Pasadas: " + pasadas );
	 System.out.println( "Comparaciones: " + comparaciones );
	    }
	}
/**
 *
 * @author ad
 */
public class BurbujaOrdenacion {
	    public static void  main (String args[]) {

	 int [] valores = {15,35,01,9,45,87};

	 OrdenaAlgoritmo.ordenar(valores);

	 // Mostrar arreglo.
	 for (int i = 0; i < valores.length ; i++)
	     System.out.println ( "valores["+i+"]: "+  valores[i]);
	 
	    }
	
}