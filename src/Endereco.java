/**
 * Classe para guardar o endereço do contato
 * @author Pedro Henrique
 * @version 1.0 - 04/10/2016
 * 
 */
public class Endereco {
	/**
	 * definição da rua
	 */
	private String rua;
	/**
	 * numero do endereço
	 */
	private int numero;
	
	/**
	 * 
	 * @return retorna rua do contato
	 */
	public String getRua() {
		return rua;
	}
	/**
	 * Define a rua do contato
	 * @param rua
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}
	/**
	 * 
	 * @return retorna o numero do endereço
	 */
	public int getNumero() {
		return numero;
	}
	
	/**
	 * Define o numero do endereço 
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}
