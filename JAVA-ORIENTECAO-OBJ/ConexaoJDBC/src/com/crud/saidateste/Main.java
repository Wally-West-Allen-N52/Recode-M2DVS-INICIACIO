package com.crud.saidateste;

import java.sql.Date;

import com.crud.dao.ContatosDao;
import com.crud.model.Contatos;

public class Main {

	public static void main(String[] args) {
		
		ContatosDao contatosDao = new ContatosDao();
		
		// ================= CRIA CONTATO E SALVA NO BANCO ==============
		
//		Contatos contatos = new Contatos();
//		contatos.setNome("Felipe Camargo");
//		contatos.setIdade(30);
//		contatos.setDataCadastro(new Date(0));
//		
//		contatosDao.save(contatos);
		
		// ================== ATUALIZA O CONTATO ====================
		
//		Contatos contatos1 = new Contatos();
//		contatos1.setId(1);
//		contatos1.setNome("Wallace Oliveira");
//		contatos1.setIdade(37);
//		contatos1.setDataCadastro(new Date(0));
//		
//		contatosDao.update(contatos1);
		
		// ==================== REMOVE CONTATO POR "ID" ==================
		
//		contatosDao.removeById(1);
		
		// ==================== LISTA TODOS OS CONTATOS DO DB =============
		
		for(Contatos c : contatosDao.getContatos()) {
			System.out.println("NOME: " + c.getNome());
		}
 	}
}
