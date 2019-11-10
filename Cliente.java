package br.edu.imed;

import java.util.Scanner;

public class Cliente {
	private String nomeCliente; 
	private CupomDesconto id_Cupom;
	private String cpf;
	private String telefone;
	private String email;
	private Endereco endereco;
	private Double cartaoCredito;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getCartaoCredito() {
		return cartaoCredito;
	}
	public void setCartaoCredito(Double cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public CupomDesconto getId_Cupom() {
		return id_Cupom;
	}
	public void setId_Cupom(CupomDesconto id_Cupom) {
		this.id_Cupom = id_Cupom;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	Scanner input = new Scanner (System.in);
	
	public void cadastroCliente() {
		System.out.print("Informe seu nome: ");
		this.setNomeCliente(input.next());
		System.out.print("Informe seu CPF: ");
		this.setCpf(input.next());
		System.out.print("Informe seu telefone: ");
		this.setTelefone(input.next());
		System.out.print("Informe seu e-mail: ");
		this.setEmail(input.next());
		
		System.out.println("-------------------------------------------------------------------------------- ");
		System.out.println("Endereço do Cliente ");
		Endereco end = new Endereco();
		end.cadastroEnderecoCliente();
		System.out.println("-------------------------------------------------------------------------------- ");
		
	}
}

