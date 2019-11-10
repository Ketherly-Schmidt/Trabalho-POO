package br.edu.imed;

public class Bebida extends Produto  {
	
	public void refrigerante1() {
		this.setCodProduto(1348d);
		this.setNomeProduto("Coca-Cola");
		this.setDescricao("Refrigerante de cola, 600ml");
		this.setPrecoUnidade(7.0);
		
		System.out.println("");
		System.out.println("******Refrigerante******");
		System.out.println("Cod. do produto: " + this.getCodProduto());
		System.out.println("Produto: " + this.getNomeProduto());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Preço: " + this.getPrecoUnidade());
		System.out.println("");
		
	}

	public void refrigerante2() {
		this.setCodProduto(1364d);
		this.setNomeProduto("Guaraná Antarctica");
		this.setDescricao("Refrigerante guarana, 600ml");
		this.setPrecoUnidade(7.0);
		
		System.out.println("");
		System.out.println("******Refrigerante******");
		System.out.println("Cod. do produto: " + this.getCodProduto());
		System.out.println("Produto: " + this.getNomeProduto());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Preço: " + this.getPrecoUnidade());
		System.out.println("");
	}
	
	public void sucoLaranja() {
		this.setCodProduto(33497d);
		this.setNomeProduto("Suco de Laranja");
		this.setDescricao("Suco de laranja natural, 300ml");
		this.setPrecoUnidade(5.0);
		
		System.out.println("");
		System.out.println("******Suco******");
		System.out.println("Cod. do produto: " + this.getCodProduto());
		System.out.println("Produto: " + this.getNomeProduto());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Preço: " + this.getPrecoUnidade());
		System.out.println("");
	}
	
	public void sucoMorango() {
		this.setCodProduto(9647d);
		this.setNomeProduto("Suco de Morango");
		this.setDescricao("Suco de morango natural, 300ml");
		this.setPrecoUnidade(5.0);
		
		System.out.println("");
		System.out.println("******Suco******");
		System.out.println("Cod. do produto: " + this.getCodProduto());
		System.out.println("Produto: " + this.getNomeProduto());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Preço: " + this.getPrecoUnidade());
		System.out.println("");
	}
	
	public void cerveja() {
		this.setCodProduto(3364d);
		this.setNomeProduto("Cerveja");
		this.setDescricao("Cerveja, 300ml");
		this.setPrecoUnidade(6.0);
		
		System.out.println("");
		System.out.println("******Cerveja******");
		System.out.println("Cod. do produto: " + this.getCodProduto());
		System.out.println("Produto: " + this.getNomeProduto());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Preço: " + this.getPrecoUnidade());
		System.out.println("");
	}
	
	public void aguasemgas() {
		this.setCodProduto(2474d);
		this.setNomeProduto("Agua mineral S/ gás");
		this.setDescricao("Agua mineral sem gás, 500ml");
		this.setPrecoUnidade(3.0);
		
		System.out.println("");
		System.out.println("******Agua******");
		System.out.println("Cod. do produto: " + this.getCodProduto());
		System.out.println("Produto: " + this.getNomeProduto());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Preço: " + this.getPrecoUnidade());
		System.out.println("");
		
	}
	
	public void aguacomgas() {
		this.setCodProduto(2647d);
		this.setNomeProduto("Agua mineral C/ gás");
		this.setDescricao("Agua mineral com gás, 500ml");
		this.setPrecoUnidade(3.5);
		
		System.out.println("");
		System.out.println("******Agua******");
		System.out.println("Cod. do produto: " + this.getCodProduto());
		System.out.println("Produto: " + this.getNomeProduto());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Preço: " + this.getPrecoUnidade());
		System.out.println("");
	}
}
