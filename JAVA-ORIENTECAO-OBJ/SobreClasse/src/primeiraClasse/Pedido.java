package primeiraClasse;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class Pedido {

	private Date data;
	private String status;
	private Cliente cliente;
	
	private List<ItensPedido> items = new ArrayList<>();
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
