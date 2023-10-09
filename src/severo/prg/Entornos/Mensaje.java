package ProgramacionPrimero.src.severo.prg.Entornos;

import java.util.Date;

public class Mensaje {
	private Usuario destinatario;
	private Usuario origen;
	private String texto;
	private Date fecha;
	
	public Mensaje(Usuario destino, Usuario origen,String texto){
		this.origen=origen;
		this.destinatario =destino;
		this.texto=texto;
		this.fecha=new Date();	
	}
	@Override
	public String toString(){
		String salida="";
		salida+="MENSAJE DE "+origen.nomDestinatario +" PARA: "+ destinatario.nomDestinatario;
		salida+="\n"+fecha.toString();
		salida+="\n-----------------";
		salida+=texto;
		salida+="-----------------";
		return salida;
	}

}
