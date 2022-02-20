package palavraExtends;

public class ClientePF extends Cliente { // "Extends" indica herança de tudo que for da classe "Cleinte"
	
	String rg; // Atribiito da classe ClientePF
	String cpf; // Atribiito da classe ClientePF
	
	public ClientePF() { // método construtor da classe ClientePF,
		super(); // chamando o construtor da classse mãe, que constroi o objeto na memória
	}
}
