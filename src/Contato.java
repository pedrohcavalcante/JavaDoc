
public class Contato {
	
	private String nome;
	
	private String email;
	
	private Endereco endereco;

	
	public Contato(String nome, String email) {

		this.nome = nome;
		this.email = email;

	}


	public void definirEndereco(String rua, int numero) {
		endereco.setRua(rua);
		endereco.setNumero(numero);

	}

	
	public String getNome() {
		return nome;
	}

	
	public String getEmail() {
		return email;

	}

}
