package palavraExtends;

public class ClientePJ extends Cliente { // "Extends" indica herança de tudo que for da classe "Cleinte"
	
	String cnpj; // Atributo
	String ie;  // Atributo
	
	public ClientePJ(String nome, String telefone, String cnpj, String ie) { // método construtor da classe ClientePJ,
		super(nome, telefone); // recebendo seus prórprios atributos por parâmetros
		this.cnpj = cnpj;
		this.ie = ie;
	}
}
