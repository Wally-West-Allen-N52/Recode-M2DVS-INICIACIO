package entradaDeDados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.print("Digite um número: ");
		a = teclado.nextInt();
		
		System.out.println("Digite mais um numero: ");
		b = teclado.nextInt();
		soma = a + b;
		
		System.out.println("SOMA entre " + a + " e " + b + " é = " + soma);
		teclado.close();
	}

}
