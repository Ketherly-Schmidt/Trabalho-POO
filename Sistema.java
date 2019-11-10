package br.edu.imed;

import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in);
		
		Double ValorTotal = 0d;
	/*
		Cliente c1 = new Cliente();
		c1.setNomeCliente(input.next());
		c1.setCpf("037.204.870-50");
		c1.setTelefone("(54) 9 9935-5471");
		c1.setEmail("fernanda.santos@gmail.com");
		c1.setCartaoCredito(5555666677778884d);
		
		Empresa e1 = new Empresa();
		e1.setNomeEmpresa ("The Bagual Burguer");
		e1.setRazaoSocial("Hamburgueria The Bagual Ltda");
		e1.setCnpj("46.509.476/0001-53");
		e1.setTelefone("(54) 99699-3020");
		e1.setCategoria("Hamburgueria");
		
		Endereco endEmpresa = new Endereco();
		endEmpresa.setCidade("Passo Fundo");
		endEmpresa.setEstado("RS");
		endEmpresa.setRua("Av. Brasil Leste");
		endEmpresa.setBairro("Petropolis");
		endEmpresa.setNumero(2195);
		endEmpresa.setCep("99050-073");
		
		Endereco endCliente = new Endereco();
		endCliente.setCidade("Passo Fundo");
		endCliente.setEstado("RS");
		endCliente.setRua("Santo Antonio");
		endCliente.setBairro("Vera Cruz");
		endCliente.setNumero(166);
		endCliente.setCep("99040-110");
		
		Produto pro1 = new Produto();
		pro1.setCodProduto(32);
		pro1.setNomeProduto("Tropeiro");
		pro1.setDescricao("Pão da nona, hamburguer de costela(180g), queijo colonial, cheddar, cebola em aneis, molho de churraco e maionese bagual");
		pro1.setPrecoUnidade(25.9d);
		pro1.setCategoriaProduto("Lanche");
		
		Produto pro2 = new Produto();
		pro2.setCodProduto(28);
		pro2.setNomeProduto("Heineken");
		pro2.setDescricao("600 ml");
		pro2.setPrecoUnidade(13d);
		pro2.setCategoriaProduto("Bebida");
		
		CarrinhoCompra cc1 = new CarrinhoCompra();
		cc1.setId_Carrinho(254);
		cc1.setQuantidadeItens(2);
		cc1.setFrete(7.5d);
		cc1.addListaProduto(pro1);
		cc1.addListaProduto(pro2);
	
		CupomDesconto cd1 = new CupomDesconto();
		cd1.setId_Cupom(144);
		cd1.setValorDesconto(5d);
		
		CupomDesconto cd2 = new CupomDesconto();
		cd2.setId_Cupom(144);
		cd2.setValorDesconto(9.5d);
		
		Pedido p1 = new Pedido();
		p1.setId_Pedido(177);
		c1.getNomeCliente();
		p1.setStatusPedido("A Caminho");
		p1.setPedidoData("24/09/2019");
		p1.setPedidoHora("22:54:21");
		
		p1.addCupomDesconto(cd1);
		p1.addCupomDesconto(cd2);
		ValorTotal = p1.calculaTotal(cc1.calculaSubTotal(), cc1.getFrete());		
		
		System.out.println("======== DADOS DO CLIENTE  ========");
		System.out.println("Nome do Cliente: "+ c1.getNomeCliente());
		System.out.println("Telefone: "+ c1.getTelefone());
		System.out.println("Endereço : Rua: "+ endCliente.getRua()+", Bairro: "+endCliente.getBairro()+", Nº: "+endCliente.getNumero()+", Cidade: "+endCliente.getCidade());
		System.out.println("======== DESCRIÇÃO DO PEDIDO  ========");
		System.out.println("Nome da empresa: "+ e1.getNomeEmpresa());
		System.out.println("Id_Pedido: "+ p1.getId_Pedido());
		System.out.println("Codigo Carrinho: "+ cc1.getId_Carrinho());
		cc1.listaCarrinho();
		System.out.println("Valor do frete: R$"+ cc1.getFrete());
		System.out.println("Total valor produtos: R$"+  cc1.calculaSubTotal());
		System.out.println("Valor do Cupom: R$"+ p1.calculaDesconto());
		System.out.println("Valor total: R$"+  ValorTotal);
		*/
		
		Cliente c = new Cliente();
		c.cadastroCliente();
		
		
		Empresa e = new Empresa();
		e.cadastroEmpresa();
		
		Bebida b = new Bebida();
		b.aguacomgas();
		b.aguasemgas();
		b.cerveja();
		b.refrigerante2();
		b.refrigerante1();
		b.sucoLaranja();
		b.sucoMorango();
		
		Comida com = new Comida();
		com.pizzaCalabresa();
		com.pizzaFrangoCatupiry();
		com.hamburguerCarne();
		com.hamburguerFrango();
		com.batataFrita();
	}
}