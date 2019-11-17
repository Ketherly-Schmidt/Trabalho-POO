package br.edu.imed;

import java.util.*;

public class Sistema {
	
	
	public static void main(String[] args) { 
	
		Scanner input = new Scanner(System.in);
		
		List <Produto> comida = new ArrayList <Produto>();
		List <Produto> bebida = new ArrayList <Produto>();
		
		Double ValorTotal = 0d;
		
		Main b = new Main();
		b.menu();
		b.cadastrar();
		b.listarCadastros();
		
		
		Empresa e1 = new Empresa();
		e1.setNomeEmpresa ("The Geeks Lanches");
		e1.setRazaoSocial("The Geeks Lanches");
		e1.setCnpj("46.509.476/0001-53");
		e1.setTelefone("(54) 99699-3020");
		
		Endereco endEmpresa = new Endereco();
		endEmpresa.setCidade("Passo Fundo");
		endEmpresa.setEstado("RS");
		endEmpresa.setRua("Av. Brasil Leste");
		endEmpresa.setBairro("Petropolis");
		endEmpresa.setNumero(642);
		endEmpresa.setCep("99050-073");
		
		Comida pizzaCalabresa = new Comida();
		pizzaCalabresa.setCodProduto(8964d);
		pizzaCalabresa.setNomeProduto("Pizza Calabresa");
		pizzaCalabresa.setDescricao("Molho de tomate, queijo mussarela, calabresa, azeitona, oregano");
		pizzaCalabresa.setTamanho("Familia");
		pizzaCalabresa.setPrecoUnidade(72.0);
		
		comida.add(pizzaCalabresa);
		
		Comida pizzaFrangoCatupiry = new Comida();
		pizzaCalabresa.setCodProduto(8711d);
		pizzaCalabresa.setNomeProduto("Pizza Frango com Catupiry");
		pizzaCalabresa.setDescricao("Molho de tomate, frango, catupiry, oregano, queijo mussarela");
		pizzaCalabresa.setTamanho("Familia");
		pizzaCalabresa.setPrecoUnidade(75.0);
		
		comida.add(pizzaFrangoCatupiry);
		
		Comida hamburguerCarne = new Comida();
		hamburguerCarne.setCodProduto(8794d);
		hamburguerCarne.setNomeProduto("Hamburquer Americano");
		hamburguerCarne.setDescricao("Carne moida, bacon, cebola, mussarela, presunto, champignon");
		hamburguerCarne.setPrecoUnidade(22.0);
		
		comida.add(hamburguerCarne);
		
		Comida hamburguerFrango = new Comida();
		hamburguerFrango.setCodProduto(8784d);
		hamburguerFrango.setNomeProduto("Hamburquer Americano de Frango");
		hamburguerFrango.setDescricao("Frango, bacon, cebola, mussarela, presunto, champignon");
		hamburguerFrango.setPrecoUnidade(25.0);
		
		comida.add(hamburguerFrango);
		
		Comida batataFrita = new Comida();
		batataFrita.setCodProduto(8974d);
		batataFrita.setNomeProduto("Batata Frita com cheddar");
		batataFrita.setDescricao("Batata frita, cheddar");
		batataFrita.setTamanho("Grande");
		batataFrita.setPrecoUnidade(21.0);
		
		comida.add(batataFrita);
		
		Bebida refrigerante1 = new Bebida();
		refrigerante1.setCodProduto(1348d);
		refrigerante1.setNomeProduto("Coca-Cola");
		refrigerante1.setDescricao("Refrigerante de cola, 600ml");
		refrigerante1.setPrecoUnidade(7.0);
		
		bebida.add(refrigerante1);
		
		Bebida refrigerante2 = new Bebida();
		refrigerante2.setCodProduto(1367d);
		refrigerante2.setNomeProduto("Guaraná Antarctica");
		refrigerante2.setDescricao("Refrigerante guarana, 600ml");
		refrigerante2.setPrecoUnidade(7.0);
		
		bebida.add(refrigerante2);
		
		Bebida sucoLaranja = new Bebida();
		sucoLaranja.setCodProduto(33497d);
		sucoLaranja.setNomeProduto("Suco de Laranja");
		sucoLaranja.setDescricao("Suco de laranja natural, 300ml");
		sucoLaranja.setPrecoUnidade(5.0);
		
		bebida.add(sucoLaranja);
		
		Bebida sucoMorango = new Bebida();
		sucoMorango.setCodProduto(9647d);
		sucoMorango.setNomeProduto("Suco de Morango");
		sucoMorango.setDescricao("Suco de morango natural, 300ml");
		sucoMorango.setPrecoUnidade(5.0);
		
		bebida.add(sucoMorango);
		
		Bebida cerveja = new Bebida();
		cerveja.setCodProduto(3364d);
		cerveja.setNomeProduto("Cerveja");
		cerveja.setDescricao("Cerveja, 300ml");
		cerveja.setPrecoUnidade(6.0);
		
		bebida.add(cerveja);
		
		Bebida aguasemgas = new Bebida();
		aguasemgas.setCodProduto(2474d);
		aguasemgas.setNomeProduto("Agua mineral S/ gás");
		aguasemgas.setDescricao("Agua mineral sem gás, 500ml");
		aguasemgas.setPrecoUnidade(3.0);
		
		bebida.add(aguasemgas);
		
		Bebida aguacomgas = new Bebida();
		aguacomgas.setCodProduto(2647d);
		aguacomgas.setNomeProduto("Agua mineral C/ gás");
		aguacomgas.setDescricao("Agua mineral com gás, 500ml");
		aguacomgas.setPrecoUnidade(3.5);
		
		bebida.add(aguacomgas);
		
		CarrinhoCompra cc1 = new CarrinhoCompra();
		cc1.setId_Carrinho(254);
		cc1.setQuantidadeItens(2);
		cc1.setFrete(7.5d);
		cc1.addListaProduto(sucoMorango);
		cc1.addListaProduto(hamburguerFrango);
	
		CupomDesconto cd1 = new CupomDesconto();
		cd1.setId_Cupom(144);
		cd1.setValorDesconto(5d);
		
		CupomDesconto cd2 = new CupomDesconto();
		cd2.setId_Cupom(144);
		cd2.setValorDesconto(9.5d);
		
		Pedido p1 = new Pedido();
		p1.setId_Pedido(177);
		//c1.getNomeCliente();
		p1.setStatusPedido("A Caminho");
		p1.setPedidoData("19/11/2019");
		p1.setPedidoHora("21:12:21");
		
		p1.addCupomDesconto(cd1);
		p1.addCupomDesconto(cd2);
		ValorTotal = p1.calculaTotal(cc1.calculaSubTotal(), cc1.getFrete());		
		
		System.out.println("======== DADOS DO CLIENTE  ========");
		//System.out.println("Nome do Cliente: "+ c1.getNomeCliente());
		//System.out.println("Telefone: "+ c1.getTelefone());
		//System.out.println("Endereço : Rua: "+ endCliente.getRua()+", Bairro: "+endCliente.getBairro()+", Nº: "+endCliente.getNumero()+", Cidade: "+endCliente.getCidade());
		System.out.println("======== DESCRIÇÃO DO PEDIDO  ========");
		System.out.println("Nome da empresa: "+ e1.getNomeEmpresa());
		System.out.println("Id_Pedido: "+ p1.getId_Pedido());
		System.out.println("Codigo Carrinho: "+ cc1.getId_Carrinho());
		cc1.listaCarrinho();
		System.out.println("Valor do frete: R$"+ cc1.getFrete());
		System.out.println("Total valor produtos: R$"+  cc1.calculaSubTotal());
		System.out.println("Valor do Cupom: R$"+ p1.calculaDesconto());
		System.out.println("Valor total: R$"+  ValorTotal);
		
	}
}