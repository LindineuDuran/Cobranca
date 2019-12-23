package com.lduran.cobranca.model;

public enum StatusTitulo
{
	Pendente("Pendente"),
	Recebido("Recebido");

	private String descricao;

	private StatusTitulo(String descricao)
	{
		this.descricao = descricao;
	}

	public String getDescricao()
	{
		return descricao;
	}
}
