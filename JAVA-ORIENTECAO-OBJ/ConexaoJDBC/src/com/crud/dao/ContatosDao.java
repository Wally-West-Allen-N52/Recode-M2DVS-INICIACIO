package com.crud.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.crud.factory.ConnectionFactory;
import com.crud.model.Contatos;

public class ContatosDao {

	// M�TODO SALVAR
	public void save(Contatos contatos) {
		// COMANDOS SQL BASICOS
		// OS "?" S�O PAR�METROS/VALORES ADDs AOS ATRIBUTOS NA TABELA DO DB
		String sql = "INSERT INTO " + "Contatos(nome, idade, dataCadastro)" + " VALUES(?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// CRIA CONEX�O COM O DB
			conn = ConnectionFactory.createConnectionSQLServer();
			// CRIA A CLASSE USADA PARA EXECUTAR A "QUERY/CONSULTA NO DB"
			pstm = conn.prepareStatement(sql);

			// ADD O VALOR DO PRIMEIRO PAR�METRO
			pstm.setString(1, contatos.getNome());
			// ADD O VALOR DO SEGUNDO PAR�METRO
			pstm.setInt(2, contatos.getIdade());
			// ADD O VALOR DO TERCEIRO PAR�METRO
			pstm.setDate(3, new Date(contatos.getDataCadastro().getTime()));

			// EXECUTA A SQL PARA INSER��O DOS DADOS
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// FECHAR AS CONEX�ES
			try {
				if (conn != null) {
					conn.close();
				}
				if (pstm != null) {
					pstm.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// M�TODO REMOVER POR ID
	public void removeById(int id) {
		String sql = "DELETE FROM Contatos WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (pstm != null) {
					pstm.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// M�TODO UPDATE
	public void update(Contatos contatos) {
		String sql = "UPDATE Contatos SET nome = ?, idade = ?, dataCadastro = ? WHERE id =?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// CONEX�OO COM DB
			conn = ConnectionFactory.createConnectionSQLServer();

			// CRIA A CLASSE USADA PARA EXECUTAR A "QUERY/CONSULTA NO DB"
			pstm = conn.prepareStatement(sql);

			// ADD O VALOR DO PRIMEIRO PAR�METRO
			pstm.setString(1, contatos.getNome());
			// ADD O VALOR DO SEGUNDO PAR�METRO
			pstm.setInt(2, contatos.getIdade());
			// ADD O VALOR DO TERCEIRO PAR�METRO
			pstm.setDate(3, new Date(contatos.getDataCadastro().getTime()));
			// ADD O VALOR DO QUARTO PAR�METRO INDICANDO O "ID"
			pstm.setInt(4, contatos.getId());

			// EXECUTA A SQL PARA INSER��O DOS DADOS
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(pstm != null) {
					pstm.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// M�TODO LISTAR ELEMENTOS
	public List<Contatos> getContatos() {
       		String sql = "SELECT * FROM	Contatos";
		
		List<Contatos> contatos = new ArrayList<Contatos>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		// CLASSE QUE  RECUPERA OS DADOS DO DB
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionSQLServer();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			// ENQUANTO EXISTIR DADOS NO DB, FA�A
			while (rset.next()) {
				
				Contatos novoContato = new Contatos();
				
				// RECUPERA "ID" DO DB E ATRIBUI ELE AO OBJETO
				novoContato.setId(rset.getInt("id"));
				// RECUPERA "NOME" DO DB E ATRIBUI ELE AO OBJETO
				novoContato.setNome(rset.getString("nome"));
				// RECUPERA "IDADE" DO DB E ATRIBUI ELE AO OBJETO
				novoContato.setIdade(rset.getInt("idade"));
				// RECUPERA "DATACADASTRO" DO DB E ATRIBUI ELE AO OBJETO
				novoContato.setDataCadastro(rset.getDate("dataCadastro"));
				
				// ADD CONTATO RECUPERADO NA LISTA DE CONTATOS
				contatos.add(novoContato);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(rset != null) {
					rset.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return contatos;
	}
}
