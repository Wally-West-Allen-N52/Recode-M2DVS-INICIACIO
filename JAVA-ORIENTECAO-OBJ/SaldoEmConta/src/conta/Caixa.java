package conta;

public class Caixa {
	
public double saldo = 1000; // variável criada e inicializada
	
	void sacar(double valor) { // método do tipo double
		this.saldo = saldo - valor; // referência à variável iniciada menos valor do atributo
	}
	
	void depositar(double valor) { // método do tipo double
		this.saldo = saldo + valor; // referência à variável iniciada mais valor do atributo
	}
	
	double exibirSaldo() {
		return this.saldo;
	}
	
	public static void main(String[] arggs) {
		
		Caixa caixa = new Caixa(); // objeto de classe criado
		caixa.depositar(500); // método depositar chamado
		System.out.println("Seu saldo é de $" + caixa.exibirSaldo());
	}
}
