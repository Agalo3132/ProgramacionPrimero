package severo.prg.Entornos;

import java.util.ArrayList;

public class Agenda {
	public static void main(String[] args){
		ArrayList<Usuario> ListaUsuarios;
		ArrayList<Mensaje> Mensajes=new ArrayList<Mensaje>();
		Usuario persona;
		Mensaje m;
		ListaUsuarios=new ArrayList<Usuario>();
		persona=new Usuario("Ana","anac","ana@pp.com",23);
		ListaUsuarios.add(persona);
		persona=new Usuario("Bea","beee","bea@pp.com",34);
		ListaUsuarios.add(persona);
		persona=new Usuario("Clara","clarita","cl@pp.com",15);
		ListaUsuarios.add(persona);
		persona=new Usuario("Delia","dddd","delia@pp.com",28);
		ListaUsuarios.add(persona);
		
		System.out.println("LISTADO:\n");


		for(Usuario u:ListaUsuarios){
			System.out.println(u);
		}
		
		m=new Mensaje(ListaUsuarios.get(0),ListaUsuarios.get(1),"Primer Mensaje");
		Mensajes.add(m);
		m=new Mensaje(ListaUsuarios.get(1),ListaUsuarios.get(2),"Otro Mensaje");
		Mensajes.add(m);
		m=new Mensaje(ListaUsuarios.get(1),ListaUsuarios.get(0),"Respuesta al primer Mensaje");
		Mensajes.add(m);
		m=new Mensaje(ListaUsuarios.get(1),ListaUsuarios.get(3),"�ltimo Mensaje");
		Mensajes.add(m);
		
		
		System.out.println("LISTADO:\n");
		
		

		for(Mensaje actual:Mensajes){
			System.out.println(actual);
		}

		
		
	}



}
