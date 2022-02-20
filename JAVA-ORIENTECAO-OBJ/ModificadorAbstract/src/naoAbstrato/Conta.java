package naoAbstrato;

class Conta { // Conta não abstrata

	String nome; // Attributes

	public Conta() {
		// Empty constructors
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) { // Methods
		this.nome = nome;
	}
}

class ContaPouoanca extends Conta {

	// Attributes
	// Constructors
	// Methods
}

class ContaCorrente extends Conta {

	// Attributes
	// Constructors
	// Methods
}
