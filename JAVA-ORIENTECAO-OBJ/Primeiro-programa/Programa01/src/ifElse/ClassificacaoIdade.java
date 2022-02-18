package ifElse;

import java.util.Scanner;

public class ClassificacaoIdade {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite a idade da pessoa: ");
		idade = entrada.nextInt();
		
		if (idade <= 12) {
			System.out.println("É uma criança");
		} else if (idade >= 13 && idade < 18) {
			System.out.println("É um adolescente");
		} else if (idade < 65) {
			System.out.println("É um adulto");
		} else {
			System.out.println("É um idoso");
		}
		entrada.close();
	}

}
