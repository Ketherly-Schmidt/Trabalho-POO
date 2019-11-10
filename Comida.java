package br.edu.imed;

public class Comida extends Produto {

	private String tamanho;
	
	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public void pizzaCalabresa() {
		this.setCodProduto(8964d);
		this.setNomeProduto("Pizza Calabresa");
		this.setDescricao("Molho de tomate, queijo mussarela, calabresa, azeitona, oregano");
		this.setTamanho("Familia");
		this.setPrecoUnidade(72.0);
		
		System.out.println("");
		System.out.println("******Pizza******");
		System.out.println("Cod. do produto: " + this.getCodProduto());
		System.out.println("Produto: " + this.getNomeProduto());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Preço: " + this.getPrecoUnidade());
		System.out.println("");
		
	}
	
	public void pizzaFrangoCatupiry() {
		this.setCodProduto(8964d);
		this.setNomeProduto("Pizza Frango com Catupiry");
		this.setDescricao("Molho de tomate, frango, catupiry, oregano, queijo mussarela");
		this.setTamanho("Familia");
		this.setPrecoUnidade(75.0);
		
		System.out.println("");
		System.out.println("******Pizza******");
		System.out.println("Cod. do produto: " + this.getCodProduto());
		System.out.println("Produto: " + this.getNomeProduto());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Preço: " + this.getPrecoUnidade());
		System.out.println("");
		
	}
	
	public void hamburguerCarne() {
		this.setCodProduto(8964d);
		this.setNomeProduto("Hamburquer Americano");
		this.setDescricao("Carne moida, bacon, cebola, mussarela, presunto, champignon");
		this.setPrecoUnidade(22.0);
		
		System.out.println("");
		System.out.println("******Hamburguer******");
		System.out.println("Cod. do produto: " + this.getCodProduto());
		System.out.println("Produto: " + this.getNomeProduto());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Preço: " + this.getPrecoUnidade());
		System.out.println("");
		
	}
	
	public void hamburguerFrango() {
		this.setCodProduto(8964d);
		this.setNomeProduto("Hamburquer Americano de Frango");
		this.setDescricao("Frango, bacon, cebola, mussarela, presunto, champignon");
		this.setPrecoUnidade(25.0);
		
		System.out.println("");
		System.out.println("******Hamburguer******");
		System.out.println("Cod. do produto: " + this.getCodProduto());
		System.out.println("Produto: " + this.getNomeProduto());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Preço: " + this.getPrecoUnidade());
		System.out.println("");
		
	}
	
	public void batataFrita() {
		this.setCodProduto(8964d);
		this.setNomeProduto("Batata Frita com cheddar");
		this.setDescricao("Batata frita, cheddar");
		this.setTamanho("Grande");
		this.setPrecoUnidade(21.0);
		
		System.out.println("");
		System.out.println("******Batata Frita******");
		System.out.println("Cod. do produto: " + this.getCodProduto());
		System.out.println("Produto: " + this.getNomeProduto());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Preço: " + this.getPrecoUnidade());
		System.out.println("");
		
	}
		
	}
	

	