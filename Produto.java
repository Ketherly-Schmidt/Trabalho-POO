package br.edu.imed;

public class Produto {
	
	private Integer codProduto;
	private String nomeProduto;
	private String descricao;
	private Double precoUnidade;
	private String categoriaProduto;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPrecoUnidade() {
		return precoUnidade;
	}
	public void setPrecoUnidade(Double precoUnidade) {
		this.precoUnidade = precoUnidade;
	}
	public String getCategoriaProduto() {
		return categoriaProduto;
	}
	public void setCategoriaProduto(String categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}
	public Double getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}

}
