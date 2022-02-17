package arrayVetor;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int[] valores = new int[5];
		for (int x = 0; x < 5; x++) {
			System.out.println("Informe " + (x + 1) + " valor: ");
			valores[x] = entrada.nextInt();
		}
		System.out.println("Valores armazenados no vetor == ");
		for (int x = 0; x < 5; x++) {
			System.out.println("Valor na posição " + x + " = " + valores[x]);
		}
		entrada.close();
	}

}
