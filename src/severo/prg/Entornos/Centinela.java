/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package severo.prg.Entornos;

/**
 *
 * @author ad
 */
public class Centinela {

 final static int TAMANYO=50;
    final static int LIMITE_INF=1;
    final static int LIMITE_SUP=100;
    public static int getAleatorio(int limInferior,int limSuperior){
        int salida;
        int aux;
        int rango;
        if(limSuperior<limInferior){
            aux=limInferior;
            limInferior=limSuperior;
            limSuperior=aux;
        }
        rango=limSuperior-limInferior;
        salida=(int) (Math.random()*(rango+1))+limInferior;        
        return salida;
    }
    
    public static String muestraVector(int[] vector){
        String cadena="";
        
        for(int i=0;i<vector.length;i++){
            cadena+=vector[i]+" ";
        }
        return cadena;
    }
    
    /** Rellena un vector entero con números enteros entre limINF y limSUP
     *  en caso de ser limINF menor que limSUP, se intercambian los valores
     *
     * @param vector Array de enteros
     * @param limINF límite inferior de los números aleatorios a generar.
     *               <strong>También puede aparecer limINF</strong>
     * @param limSUP límite superior de los números aleatorios a generar.
     *               <strong>También puede aparecer limSUP</strong>
     */
    public static void RellenarAleatorio(int[] vector,int limINF,int limSUP){
        int valor; 
        for (int i = 0; i < vector.length; i++) {
        	do {
            valor = getAleatorio(limINF, limSUP);
        	} while (Encuentra(vector,valor));
        	vector[i] = valor;
        }
        
    }
    public static int[] OrdenaBurbuja(int[] vector){
        int[] salida;
        boolean hayCambio;
        salida=vector.clone();
        int i=vector.length;

        do{
            hayCambio=false;
            for(int j=0;j<i-1;j++){
                int aux;
                if(salida[j]>salida[j+1]){
                    aux=salida[j+1];
                    salida[j+1]=salida[j];
                    salida[j]=aux;
                    hayCambio=true;
                }
            }
            i--;

        }while(i>0 && hayCambio);

        return salida;
    }
    public static boolean Encuentra(int[] vector,int aBuscar){
        boolean resultado;
        resultado=false;
        int i=0;
        while(i<vector.length && !resultado){
            if(vector[i]==aBuscar){
                resultado=true;
            }
            i++;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        //Crear array
        int[] vectorDesordenado=new int[TAMANYO];
        int[] ordenado;

        RellenarAleatorio(vectorDesordenado,LIMITE_INF,LIMITE_SUP);
        System.out.println(muestraVector(vectorDesordenado));
        //Ordenar array

        ordenado=OrdenaBurbuja(vectorDesordenado);

        System.out.println(muestraVector(ordenado));
        //Buscar los que no están
        System.out.print("Números que no están ");
        for(int i=LIMITE_INF;i<=LIMITE_SUP;i++){
            if(!Encuentra(ordenado,i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        
        //Buscar los que no están:
        boolean[] estan;
        estan=new boolean[LIMITE_SUP-LIMITE_INF+1];
        for(int i=0;i<ordenado.length;i++){
            estan[ordenado[i]-LIMITE_INF]=true;
        }
        System.out.print("Números que no están ");
        for(int i=0;i<estan.length;i++){
            if(!estan[i]){
                System.out.print(i+LIMITE_INF+" ");
            }
        }
        System.out.println();
        
        //Buscar los que no están
        int buscando=0;

        int indice;
        System.out.print("Números que no están ");
        for(indice=LIMITE_INF;indice<=LIMITE_SUP;indice++){
            if(buscando<ordenado.length && ordenado[buscando]==indice){
                while(buscando<ordenado.length && ordenado[buscando]==indice){
                    buscando++;
                }
            }
            else{
                System.out.print(indice+" ");
            }
        }
        System.out.println();
    }

}
