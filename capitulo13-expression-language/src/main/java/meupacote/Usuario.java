package meupacote;

public class Usuario {

	private String nome;
	private String email;
	
	public Usuario( ){
		setNome("Edson");
		setEmail("edson@edsongoncalves.com.br");
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome( ) {
		return nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail( ) {
		return email;
	}
}