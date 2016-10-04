/**
 * Classe para guardar contatos
 * @author Pedro Henrique
 * @version 1.0 - 04/10/2016
 * 
 */
public class Contato {
	/**
	 * nome do contato
	 */
	private String nome;
	/**
	 * email do contato
	 */
	private String email;
	/**
	 * endereço do contato
	 */
	private Endereco endereco;

	/**
	 * Método construtor
	 * @param nome
	 * @param email
	 */
	public Contato(String nome, String email) {

		this.nome = nome;
		this.email = email;

	}

	/**
	 * Método para definir o endereço
	 * @param rua
	 * @param numero
	 */
	public void definirEndereco(String rua, int numero) {
		endereco.setRua(rua);
		endereco.setNumero(numero);

	}

	/**
	 * 
	 * @return retorna o nome do contato
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @return retorna o email do contato
	 */
	public String getEmail() {
		return email;

	}

}
