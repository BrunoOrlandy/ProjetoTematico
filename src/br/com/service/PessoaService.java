package br.com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.model.Pessoa;

public class PessoaService {

	private Connection conexao;

	public PessoaService() throws SQLException {
		this.conexao = conexao;
	}

	public void salvar(Pessoa pessoa) throws SQLException {
		if (pessoa != null) {

			PreparedStatement pstmt = null;

			try {
				pstmt = conexao.prepareStatement("insert into produto(codigo, nome, descricao) values (?,?,?,?)");
				pstmt.setString(1, pessoa.getLogin());
				pstmt.setString(2, pessoa.getNome());
				pstmt.setString(3, pessoa.getSobrenome());
				pstmt.setString(4, pessoa.getSexo());
				pstmt.setDate(5, new java.sql.Date(pessoa.getDataNascimento().getTime()));
				pstmt.setString(6, pessoa.getSenha());

				pstmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				this.conexao.close();
			}
		}
	}

	public Pessoa buscaLogin(Pessoa pessoa) {

		return null;
	}

}
