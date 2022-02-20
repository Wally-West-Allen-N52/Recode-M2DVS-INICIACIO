package sobrecarga;

public class Funcionario {

	protected String noome;
	protected String cpf;
	protected double salario;

	public double calculaBonus() { // Método
		return salario * 0.10;
	}

	public class Gerente extends Funcionario {

		String setor;

		@Override
		public double calculaBonus() {
			return this.salario * 0.20;
		}
	}
}