package Colecciones.ClasAnid;

//Dentro tendré una clase interna llamada Nodo,
//la clase Nodo tendrá un atributo int llamado dato, otro atributo de tipo Nodo llamado next
//Tendra un constructor que se le pasa solo el dato
public class ListaEnlazada {

    private Nodo head = null;
    private Nodo tail = null;

    class Nodo{
        private int dato;
        private Nodo next;

        public Nodo(int dato) {
            this.dato = dato;
            this.next = null;
        }
    }

    public int size(){
        int cont = 0;
        Nodo current = head;
        while (current != null) {
            cont++;
            current = current.next;
        }
        return 0;
    }

    public void addNodoMejorado(int dato){
        Nodo nodo = new Nodo(dato);
        if (head == null) {
            head = nodo;
            tail = nodo;
        } else {
            tail.next = nodo;
            tail = nodo;
        }
    }

    public void addNodo(int dato){
        Nodo nodo = new Nodo(dato);

        if (head == null) {
            head = nodo;
        } else {
            Nodo last = head;
            while (last.next != null) {
                last=last.next;
            }
            last.next = nodo;
        }
    }

    public void deleteCabeza(){
        head = null;
        head.next = head;
    }

    public Nodo get(int i){
        if (i >= 0 && i < size()) {
            Nodo actual = head;
            for (int j = 1; j <= i; j++) {
                actual = actual.next;
            }
            return actual;
        }
        return null;
    }

    public void add(int i, int dato){
        Nodo nodoNuevo = new Nodo(dato);
        if (i == 0) {
            addStart(dato);
        } else {
            Nodo temp = head;
            //devuelve el nodo de una posicion anterior
            for (int j = 1; j < i; j++) {
                if (temp != null){
                    temp = temp.next;
                }
            }

            nodoNuevo.next = temp.next;
            temp.next = nodoNuevo;
        }
    }

    public void addStart(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.next = head;
        head = nuevoNodo;
    }

    public void printList(){
        Nodo current = head;
        while (current != null) {
            System.out.println(current.dato);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ListaEnlazada l = new ListaEnlazada();
        //l.addNodo(2);
        l.addNodoMejorado(5);
        System.out.println(l.size());
        l.addNodoMejorado(6);
        l.addNodoMejorado(8);
        l.addNodoMejorado(9);
        l.add(2, 10);
        l.printList();
    }


}
