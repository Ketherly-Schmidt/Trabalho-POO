package br.edu.imed;
import javax.print.DocFlavor.CHAR_ARRAY;

//CLASSE QUE GUARDA AS VARIAVEIS DOS OBJETOS...
public class Cliente {

	private String nome;

	private Double  senha ;

	private String email;

	private String endereco;

	private Integer  telefone  ;
	
	
	public Cliente() {

	}

	public String getNome() {

		return nome;
	}

	public void setNome(String name) {

		nome = name;
	}

	public String getEmail() {

		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {

		return endereco;
	}

	public void setEndereco(String Endereco) {

		endereco = Endereco;

	}

	public Integer getTelefone() {

		return telefone;
	}

	public void setTelefone(Integer telefone) {

		if (String.valueOf(telefone).length() == 11) {
			//....
		}
		
		this.telefone = telefone;

	}

	public double getSenha() {

		return senha;
	}

	public void setSenha(double senha) {

		senha = senha;
	}

}
