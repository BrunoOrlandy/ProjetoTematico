package br.com.model;

import java.time.LocalDate;

public class Conta {

	private Long id;
	private LocalDate dataCadastro;

	private LocalDate dataPagamento;

	private Double valorConta;

	private Double valorCadastro;

	private String observacao;

	private CategoriaConta CategoriaCconta;

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Double getValorConta() {
		return valorConta;
	}

	public void setValorConta(Double valorConta) {
		this.valorConta = valorConta;
	}

	public Double getValorCadastro() {
		return valorCadastro;
	}

	public void setValorCadastro(Double valorCadastro) {
		this.valorCadastro = valorCadastro;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
