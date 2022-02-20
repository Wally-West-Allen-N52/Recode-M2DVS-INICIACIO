package sobrecargaSeparada;

public class Gerente extends Funcionario {

	String setor;

	@Override
	public double calculaBonus() {
		return this.salario * 0.20;
	}
}
