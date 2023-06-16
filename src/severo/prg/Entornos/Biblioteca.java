/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package severo.prg.Entornos;

public class Biblioteca {
    public static void main(String[] args) {
/*    	Una tarde de invierno un viejo estudiante de informática,
    	paseaba por un parque cercano a su casa.
    	
    	En un banco, encontró tres libros.
    	No parecían de nadie, a la vez que parecían muy usados.*/
    	
        Libro libro1,libro2;
        
  /*  	Miró la portada del primer libro y le llamó la atención
    	el año de su publicación. El título ya lo había escuchado
    	antes, pero no sabía que era una obra tan antigua.*/
    	
    	libro1=new Libro("El Lazarillo de Tormes",1554);
    	
/*    	El segundo libro era más voluminoso y pesado.
    	El nombre también le sonaba, aunque más de una película que 
    	de un libro. El autor era ruso y no era tan antiguo como el anterior.
    	*/
    	
        libro2=new Libro("Guerra y Paz","Tolstoi",1864);
        
      /*  Sin saber porqué gritó el título del primer libro y la fecha
        de publicación.
        Sin saber para qué, también repitió lo mismo con el segundo Libro*/
        
        System.out.println(libro1);
        System.out.println(libro2);
        
/*        El tercer libro también estaba cerca. La portada tenía un
        extraño dibujo que le recordaba al icono
        de cierto entorno de desarrollo.
        Lo miró con detenimiento y pasó su mano por el lomo, como 
        intentado encontrar cierta textura éspera.*/
        
        Libro libro3;
        
        /*Por un momento pensó que se trataba exactamente del mismo libro que
        el primero.*/
        
        libro3=libro1.clone();
        
      /*  Pero al mirarlo mejor, se dió cuenta de que la fecha
        era distinta.*/
        
        libro3.setAnyoPrimeraEdicion(1610);
        /*
        Ridículamente, gritó los datos del primer Libro*/
        
        System.out.println(libro1);
        
/*        Como si se hubiera agudizado su sentido para
        encontrar libros perdidos. Cuando levantó la vista,
        vió otros dos ejemplares.
        Eran identicos, aunque estaban en distinto lugar.
        */
        
        Libro libro4=new Libro("1984","George Orwell",1949);
        Libro libro5=new Libro("1984","George Orwell",1949);
        
/*        Reflexionó y volvió a reflexionar.
        Si tengo dos libros; el cuarto y el quinto ..a. y ambos son iguales
        entonces...a 
         
        Gritó incontenidamente, <<tenemos duplicados>>
        */
        
        if(libro4.equals(libro5)){
            System.out.println("Tenemos duplicados");
        }
        
        /*totalmente fuera de si, sin coordinación de auténtico programador,
        comenzó a gritar los libros que se había encontrado.*/
        
        System.out.println(libro4);
        System.out.println(libro2);
        
/*        Su arrebato era tal, que decidió alargar lo máximo posible
        el grito, otra vez, de los datos de los libros.
        */
        Libro.setFormatoLargo(false);
        System.out.println(libro4);
        System.out.println(libro2);
        
     /*   Casi sin voz, y con lágrimas en los ojos.
        Encontró un pequeño Libro, se acercó para observarlo más de cerca.
        Era como el segundo que encontró. 
        Algo extraño estaba sucediendo en aquel parque proximo a su casa.
        */
        Libro libro6=new Libro(libro2);
        
      /*  Gritó el libro sexto que acabava de encontrar.*/
        
        System.out.println(libro6);
        /*
        Y pensó si debía gritar el aquella socorrida frase sobre los duplicados. */
        if(libro2.equals(libro6)){
            System.out.println("Tenemos duplicados");
        }
   /*     
        O mejor leer un poco más allá y comprobar las fechas una vez más.*/
        
        libro6.setAnyoPrimeraEdicion(2012);
        /*Ahora debio comprobar si al cambiar las fechas debían ser considerados iguales o
        no.*/
        if(libro2.equals(libro6)){
            System.out.println("Tenemos duplicados");
        }
    }
}
