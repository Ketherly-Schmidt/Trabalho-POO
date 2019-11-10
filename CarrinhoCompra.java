package br.edu.imed;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
	private Integer id_Carrinho;
	private Integer quantidadeItens;
	private Double subtotal = 0d; 
	private Double frete;
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	public Integer getId_Carrinho() {
		return id_Carrinho;
	}
	public void setId_Carrinho(Integer id_Carrinho) {
		this.id_Carrinho = id_Carrinho;
	}
	
	public Integer getQuantidadeItens() {
		return quantidadeItens;
	}
	public void setQuantidadeItens(Integer quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	
	}
	
	public Double getFrete() {
		return frete;
	}
	public void setFrete(Double frete) {
		this.frete = frete;
		
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public void addListaProduto(Produto p) {
		this.listaProdutos.add(p);
	}
	public Double calculaSubTotal() {
		 Double soma = 0d ; 
		for (Produto produto : listaProdutos) {
			soma += produto.getPrecoUnidade();
		}
		return soma;
	}
	
	public void listaCarrinho(){           
        for(int i=0; i < listaProdutos.size(); i++){   
            System.out.println("Produto: " + listaProdutos.get(i).getNomeProduto() + "\nCódigo:  " + listaProdutos.get(i).getCodProduto() + "\nDescrição: " + listaProdutos.get(i).getDescricao() + "\nPreço: R$" + listaProdutos.get(i).getPrecoUnidade() + "\n");   
        }   
    }   	
}   