package br.edu.imed;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private List<String> produtos;
	private Integer id_Pedido;
	private Cliente cliente;
	private String statusPedido;
	private String pedidoData;
	private String pedidoHora;
	private Double valortotal;
	private List<CupomDesconto> listaCupons= new ArrayList<CupomDesconto>();
	
	public List<String> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<String> produtos) {
		this.produtos = produtos;
	}
	public Integer getId_Pedido() {
		return id_Pedido;
	}
	public void setId_Pedido(Integer id_Pedido) {
		this.id_Pedido = id_Pedido;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String getStatusPedido() {
		return statusPedido;
	}
	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}
	public String getPedidoData() {
		return pedidoData;
	}
	public void setPedidoData(String pedidoData) {
		this.pedidoData = pedidoData;
	}
	public String getPedidoHora() {
		return pedidoHora;
	}
	public void setPedidoHora(String pedidoHora) {
		this.pedidoHora = pedidoHora;
	}
	public void addCupomDesconto (CupomDesconto cupom) {
		this.listaCupons.add(cupom);	
	}
	public Double calculaDesconto() {
		 Double soma = 0d ; 
		for (CupomDesconto cupom : listaCupons) {
			soma += cupom.getValorDesconto();
		}
		return soma;
	}
	public Double getValortotal() {
		return valortotal;
	}
	public void setValortotal(Double valortotal) {
		this.valortotal = valortotal;  
	}
	public Double calculaTotal(Double subtotal, Double frete  ) 	{
		if (subtotal >= 30) {
			return subtotal + frete - this.calculaDesconto();
		}else {
			return subtotal + frete;
		}
    }
}
