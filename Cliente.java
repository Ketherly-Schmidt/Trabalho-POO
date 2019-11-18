// CLASSE QUE GUARDA AS VARIAVEIS DOS OBJETOS...
public class Cliente {

	private String nome;

	private Long senha ;

	private String email;

	private String endereco;

	private Long telefone;
	
	private String CPF;
	
	private Long CartaoCredito;


	public Cliente() {

	}

	public String getNome() {

		return nome;
	}

	public void setNome(String name) {

		this.nome = name;
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

		this.endereco = Endereco;

	}

	public Long getTelefone() {

		return telefone;
	}

	public void setTelefone(Long telefone) {
		if (String.valueOf(telefone).length() == 11) {
			this.telefone = telefone;
		}
		else {
			throw new ArithmeticException("criar erro"); //criar um erro 
		}

	}

	public double getSenha() {

		return this.senha;

	}

	public void setSenha(Long novaSenha) {
		if (novaSenha.toString().length() >= 6 && novaSenha.toString().length() <= 8 ) {
			this.senha = novaSenha;	
		}else {
			throw new ArithmeticException("criar erro"); //criar um erro 
		}
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		if (ValidaCPF.isCPF(cPF) == true) {
			this.CPF = cPF;
		}else {
			throw new ArithmeticException("criar erro"); //criar um erro 
		}
	}

	public Long getCartaoCredito() {
		return CartaoCredito;
	}

	public void setCartaoCredito(Long cartaoCredito) {
		CartaoCredito = cartaoCredito;
	}

}
