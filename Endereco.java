package br.edu.imed;

import java.util.Scanner;

public class Endereco {
	private String cidade;
	private String estado;
	private String rua;
	private String bairro;
	private String complemento;
	private Double numero;
	private String cep;
	
	Scanner input = new Scanner (System.in);
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Double getNumero() {
		return numero;
	}
	public void setNumero(Double numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public void cadastroEnderecoCliente() {
		System.out.print("Informe sua rua: ");
		this.setRua(input.next());
		System.out.print("Bairro: ");
		this.setBairro(input.next());
		System.out.print("Numero da casa/predio: ");
		this.setNumero(input.nextDouble());
		System.out.print("Complemento: ");
		this.setComplemento(input.next());
		System.out.print("Cidade: ");
		this.setCidade(input.next());
		System.out.print("Estado: ");
		this.setEstado(input.next());
		System.out.print("CEP: ");
		this.setCep(input.next());
		
	}
	
	public void cadastroEnderecoEmpresa(){
		
		this.setRua("Av. Brasil Leste");
		this.setBairro("Petropolis");
		this.setNumero(2195d);
		this.setCidade("Passo Fundo");
		this.setEstado("RS");
		this.setCep("99040-110");
		
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Endereço da Empresa");
		System.out.println("Rua: " + this.rua);
		System.out.println("Bairo: " + this.bairro);
		System.out.println("Numero: " + this.numero);
		System.out.println("Cidade: " + this.cidade);
		System.out.println("Estado: " + this.estado);
		System.out.println("CEP: " + this.cep);
		System.out.println("----------------------------------------------------------");
	}
}
