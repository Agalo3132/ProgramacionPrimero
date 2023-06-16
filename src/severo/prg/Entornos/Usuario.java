package severo.prg.Entornos;

public class Usuario {
	public String nomDestinatario;
	private String correoElectronico;
	private String password;
	private int edad;
	
	public Usuario(String nom, String password, String email, int edad){
		this.nomDestinatario =nom;
		this.correoElectronico=correoElectronico;
		this.password=password;
		this.edad=edad;
	}
	
	@Override
	public String toString(){
		String salida="";
		salida+="\nNombre    : "+this.nomDestinatario;
		salida+="\nContrase�a: ";
		for(int i=0;i<this.password.length();i++) salida+="*";
		salida+="\nCorreo    : "+this.correoElectronico;
		salida+="\nEdad      : "+this.edad;
		salida+="\n-----------------------";
		return salida;
	}

}
