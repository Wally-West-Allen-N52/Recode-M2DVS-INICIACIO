package sobrecargaSeparada;

public class Funcionario {

	protected String noome;
	protected String cpf;
	protected double salario;

	public double calculaBonus() { // Método
		return salario * 0.10;
	}
}