package br.edu.imed;

import java.util.Scanner;

public class Empresa {
	private String nomeEmpresa;
	private Cliente nomeCliente;
	private String razaoSocial;
	private String cnpj;
	private String telefone;
	private Endereco endereco;
	
	Scanner input = new Scanner (System.in);
	
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public Cliente getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(Cliente nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void cadastroEmpresa() {
		this.setNomeEmpresa("The Geeks Lanches");
		this.setRazaoSocial("The Geeks Lanches");
		this.setCnpj("46.509.476/0001-53");
		this.setTelefone("(54) 9 9699-3020");
		System.out.println("-----------------------------------------");
		System.out.println("Dados da Empresa:");
		System.out.println(" ");
		System.out.println(this.nomeEmpresa);
		System.out.println(this.cnpj);
		System.out.println(this.telefone);
		System.out.println("-----------------------------------------");
		
		Endereco endempresa = new Endereco();
		endempresa.cadastroEnderecoEmpresa();

	}
	
}


