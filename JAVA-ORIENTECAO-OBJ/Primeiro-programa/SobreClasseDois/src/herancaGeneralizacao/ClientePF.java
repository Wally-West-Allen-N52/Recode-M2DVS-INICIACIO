// HERANÇA/GENERALIZAÇÃO
package herancaGeneralizacao;

public class ClientePF extends Cliente {

		// "ClientePF" herda tudo que tiver de "Cliente" por "Extends"
		
		String cnpj;
		String ie;
		
		public ClientePF() {
			super();
		}
		// Método construtor da classe chamando o costrutor da classe mãe,
		// responsável por contribuir o objeto de classe na memória
		
		public ClientePF(String nome, String telefone, String cnpj, String ie) {
			super(nome, telefone);
			this.cnpj = cnpj;
			this.ie = ie;
		}
		// Método construtor da classe chamando o construtor da classe mãe,
		// e recebendo seus proprios atributos por parãmetros

		public String getCnpj() {
			return cnpj;
		}

		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}

		public String getIe() {
			return ie;
		}

		public void setIe(String ie) {
			this.ie = ie;
		}
		
}
