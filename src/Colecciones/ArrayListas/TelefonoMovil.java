package ProgramacionPrimero.src.Colecciones.ArrayListas;

import java.util.ArrayList;
import java.util.List;

public class TelefonoMovil {
    private String myNumber;
    private List<Contacto> myContacts;

    public TelefonoMovil(String myNumber, List<Contacto>  myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts = new ArrayList();
    }
    public boolean addNewContact(Contacto contacto){
        if (findContact(contacto) < 0) {
            myContacts.add(contacto);
            System.out.println("Contacto añadido");
            return true;
        }
        System.out.println("Ya existe el contacto");
        return false;
    }

    public boolean updateContact(Contacto contacto1, Contacto contacto2){
        if (findContact(contacto2) >= 0) {
            return false;
        } else {
            int index = findContact(contacto1);
            myContacts.set(index,contacto2);
            return true;
        }
    }

    public boolean removeContact(Contacto contacto){
        int index = findContact(contacto);
        if (index >= 0) {
            myContacts.remove(index);
            return true;
        }
        return false;
    }

    private int findContact(Contacto contacto){
        return findContact(contacto.getName());
    }

    private int findContact(String nombre){
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }

    public Contacto queryContact(Contacto contacto, String nombre){
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(nombre)) {
                return myContacts.get(i);
            }
        }
        return null;
    }

    public void printContacts(){
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(myContacts.get(i) + "-->" + myContacts.get(i).getPhoneNumber());
        }
    }
}

