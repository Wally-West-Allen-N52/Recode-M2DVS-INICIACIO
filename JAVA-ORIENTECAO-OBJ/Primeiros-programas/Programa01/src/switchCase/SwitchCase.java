package switchCase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite um números entre 1 e 4: ");
		idade = entrada.nextInt();
		
		switch(idade) {
		case 1:
			System.out.println("Criança");
			break;
		case 2:
			System.out.println("Adolescente");
			break;
		case 3:
			System.out.println("Adulto");
			break;
		case 4:
			System.out.println("Idoso");
			break;
		default:
			System.out.println("Digite apenas numeros entre 1 e 4:");
		}

	}

}
