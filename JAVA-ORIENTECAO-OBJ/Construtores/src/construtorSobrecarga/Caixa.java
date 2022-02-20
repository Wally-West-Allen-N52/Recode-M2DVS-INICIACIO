package construtorSobrecarga;

// Qunado existe mais de um cosntrutor na mesma classse
public class Caixa {

	public double saldo = 0;
	
	public Caixa(double saldo) { // M�todo construtor inicializado com atributo "saldo",
		this.saldo =  saldo;	// constr�i um oobjeto com o valor "saldo" setado
	}
	
	public Caixa() { // M�todo construtor padr�o,
					// constr�i um objeto vazio
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
