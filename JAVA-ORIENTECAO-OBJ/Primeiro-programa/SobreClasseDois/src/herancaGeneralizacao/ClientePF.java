// HERAN�A/GENERALIZA��O
package herancaGeneralizacao;

public class ClientePF extends Cliente {

		// "ClientePF" herda tudo que tiver de "Cliente" por "Extends"
		
		String cnpj;
		String ie;
		
		public ClientePF() {
			super();
		}
		// M�todo construtor da classe chamando o costrutor da classe m�e,
		// respons�vel por contribuir o objeto de classe na mem�ria
		
		public ClientePF(String nome, String telefone, String cnpj, String ie) {
			super(nome, telefone);
			this.cnpj = cnpj;
			this.ie = ie;
		}
		// M�todo construtor da classe chamando o construtor da classe m�e,
		// e recebendo seus proprios atributos por par�metros

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
