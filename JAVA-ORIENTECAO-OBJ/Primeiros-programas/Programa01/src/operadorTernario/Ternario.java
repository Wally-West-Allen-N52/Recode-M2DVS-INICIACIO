package operadorTernario;

import java.util.Scanner;

public class Ternario {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite a idade da pessoa: ");
		idade = entrada.nextInt();
		
		 System.out.println(idade <= 12 ? "Criança" : "Adolescente");
	}
}
