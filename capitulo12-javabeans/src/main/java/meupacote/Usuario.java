package meupacote;

public class Usuario {

	private String nome;
	private String sobrenome;
        
	public String  getNome( ) {
		return nome;
	}
        
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}   
	
	public String getNomeCompleto() {
		return String.format("%s %s", this.nome, this.sobrenome);
	}
}