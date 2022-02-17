package estruturasDrRepeticao;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor = 0, soma = 0, i;
		for (i = 1; i <= 10; i++) {
			System.out.println("Digite valores à serem somados: ");
			valor = entrada.nextInt();
			soma = soma + valor;
		}
		System.out.println("A soma dos valores = " + soma);
		entrada.close();
	}

}
