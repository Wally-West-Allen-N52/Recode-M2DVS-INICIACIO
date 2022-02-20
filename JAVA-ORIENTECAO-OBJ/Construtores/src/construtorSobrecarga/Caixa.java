package construtorSobrecarga;

// Qunado existe mais de um cosntrutor na mesma classse
public class Caixa {

	public double saldo = 0;
	
	public Caixa(double saldo) { // Método construtor inicializado com atributo "saldo",
		this.saldo =  saldo;	// constrói um oobjeto com o valor "saldo" setado
	}
	
	public Caixa() { // Método construtor padrão,
					// constrói um objeto vazio
	}
	
	void sacar(double valor) {
		this.saldo =  saldo - valor;
	}
	
	void depositar(double valor) {
		this.saldo = saldo + valor;
	}
	
	double exibirSaldo() {
		return this.saldo;
	}
}
