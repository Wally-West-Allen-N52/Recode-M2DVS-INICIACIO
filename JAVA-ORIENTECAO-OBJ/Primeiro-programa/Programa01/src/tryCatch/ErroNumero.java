package tryCatch;

public class ErroNumero {

	public static void main(String[] args) {

		try {
			int[] numeros = { 01, 3, 18, 20 };
			System.out.println(numeros[10]); // 10 não existe no vetor
		} catch (Exception e) {
			System.out.println("Deu ruin parça!!"); // Imprime o erro tratado  
		} finally {
			System.out.println("O try catch terminou");
		}
	}
}
