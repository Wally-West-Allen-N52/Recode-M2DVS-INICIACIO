package interfaces;

public interface Conta {
	
	void depositar(double valor);
	void sacar(double valor);
	
}

class ContaPoupanca implements Conta {
	
	public void depositar(double valor) {
		this.saldo = this.saldo;
	}
	
	public void sacar(double valor) {
		this.saldo = this.saldo - valor;
	}
}
