package br.com.controller;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.model.Pessoa;
import br.com.service.PessoaService;

public class PessoaController {

	public PessoaService service;

	public void salvar(Pessoa pessoa) throws SQLException {

		service.salvar(pessoa);
		JOptionPane.showMessageDialog(null, "Cadastro Realizado");

	}

	public boolean validarLogin(String login, String senha) {

		Pessoa pessoa = new Pessoa();
		pessoa.setLogin(login);
		pessoa.setSenha(senha);

		Pessoa usuario;
		try {
			usuario = service.buscaLogin(pessoa);

			if (usuario == null) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public Pessoa buscarUsuario(String usuarioLogado) throws SQLException {
		Pessoa pessoa = new Pessoa();
		PessoaService service = new PessoaService();

//		pessoa = (Pessoa) service.findByName(usuarioLogado);
		return pessoa;

	}

}
