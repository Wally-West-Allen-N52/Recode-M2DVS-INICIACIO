package palavraExtends;

public class Cliente { // Superclasse/classe base Cliente

	String nome;
	String telefone;

	public Cliente(String nome, String telefone) { // Construtor inicializado com atributos "nome, telefone"
		this.nome = nome; // "this" constr�i um objeto com o valor "nome"
		this.telefone = telefone; // "this" const�i um objeto com o valor "telefone"
	}
	
	public Cliente() { // Construtor "Padr�o",
					// Costr�i um objeto vazio
	}
}
