package estruturasDrRepeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor = 0, soma = 0;
		System.out.print("Entre com um valor: ");
		valor = entrada.nextInt();
		
		while (valor != 0) {
			System.out.print("Entre com um valor: ");
			soma =  soma + valor;
			valor = entrada.nextInt();
		}
		System.out.println("A soma dos valores = " + soma);
		entrada.close();
	}

}
