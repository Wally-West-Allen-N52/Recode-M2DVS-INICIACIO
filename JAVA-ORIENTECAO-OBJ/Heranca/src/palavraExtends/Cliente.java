package palavraExtends;

public class Cliente { // Superclasse/classe base Cliente

	String nome;
	String telefone;

	public Cliente(String nome, String telefone) { // Construtor inicializado com atributos "nome, telefone"
		this.nome = nome; // "this" constrói um objeto com o valor "nome"
		this.telefone = telefone; // "this" constói um objeto com o valor "telefone"
	}
	
	public Cliente() { // Construtor "Padrão",
					// Costrói um objeto vazio
	}
}
