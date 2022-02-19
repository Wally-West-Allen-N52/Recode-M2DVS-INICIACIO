package conta;

public class Caixa {
	
public double saldo = 1000; // vari�vel criada e inicializada
	
	void sacar(double valor) { // m�todo do tipo double
		this.saldo = saldo - valor; // refer�ncia � vari�vel iniciada menos valor do atributo
	}
	
	void depositar(double valor) { // m�todo do tipo double
		this.saldo = saldo + valor; // refer�ncia � vari�vel iniciada mais valor do atributo
	}
	
	double exibirSaldo() {
		return this.saldo;
	}
	
	public static void main(String[] arggs) {
		
		Caixa caixa = new Caixa(); // objeto de classe criado
		caixa.depositar(500); // m�todo depositar chamado
		System.out.println("Seu saldo � de $" + caixa.exibirSaldo());
	}
}
