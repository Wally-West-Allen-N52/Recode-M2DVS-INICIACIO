package palavraExtends;

public class ClientePJ extends Cliente { // "Extends" indica heran�a de tudo que for da classe "Cleinte"
	
	String cnpj; // Atributo
	String ie;  // Atributo
	
	public ClientePJ(String nome, String telefone, String cnpj, String ie) { // m�todo construtor da classe ClientePJ,
		super(nome, telefone); // recebendo seus pr�rprios atributos por par�metros
		this.cnpj = cnpj;
		this.ie = ie;
	}
}
