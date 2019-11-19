
	// CLASSE DE CADASTRO DE USUARIOS...

	import java.util.List;
	import java.util.Scanner;
	import java.util.ArrayList;

	public class Main {

		private Scanner l;
		private boolean execute;
		private List<Cliente> listaCliente;

		public static void main(String[] args) {
			new Main();
		}

		public Main() {
			l = new Scanner(System.in);
			execute = true;
			listaCliente = new ArrayList<Cliente>();

			System.out.println("BEM VINDO AO CADASTRO DE CLIENTE");

			while (execute) {
				String opcao = menu();

				if (opcao.equalsIgnoreCase("1")) {
					cadastrar();
				} else if (opcao.equalsIgnoreCase("2")) {
					listarCadastros();
				} else if (opcao.equalsIgnoreCase("3")) {
					System.out.println("OPÇÃO INVÁLIDA. TENTE NOVAMENTE. ");
					//System.exit(0);
					break;
					
				} else {
					System.out.println("OPÇÃO INVÁLIDA. TENTE NOVAMENTE. ");
				}
			}
		}

		public String menu() {
			System.out.println("Selecione a opção:");
			System.out.println("1 - Cadastro");
			System.out.println("2 - Mostrar Clientes Cadastros");
			System.out.println("3 - Sair");
			return l.nextLine(); 
		}

		private void cadastrar() {
			boolean cadastrando = true;

			while (cadastrando) {
				System.out.println("Cadastro de Usuário");
				Cliente novoCliente = new Cliente();

				// validar o email 
				boolean emailValido = false;
				while ( emailValido == false) {
					novoCliente.setEmail(textInput("Email: "));

					boolean emailIgual = false;

					for (int i = 0; i < listaCliente.size(); i++) {

						Cliente clienteDoFor	=  listaCliente.get(i);

						if(clienteDoFor.getEmail().equals(novoCliente.getEmail())) { 
							emailIgual = true;
						}
					}
					if (emailIgual == true ) {
						System.out.println("Email já existe, Tente novamente");	
					}else {
						emailValido = true;
					}
				}
				

				novoCliente.setNome(textInput("Nome:"));
				novoCliente.setEndereco(textInput("Endereço: "));

				// Vereficando se o Telefone é inteiro.Fazer isso enquanto o while for verdadeiro 
				boolean telefoneValido = false;
				while (telefoneValido == false){ //== comparação  {
					try {
						novoCliente.setTelefone(Long.parseLong(textInput("Telefone: (Formato: 55996142062) ")));
						telefoneValido = true;
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Numero de Telefone Inválido");
					}
				}

				/// tratamento Senha //
				boolean SenhaValido = false; 
				while (SenhaValido == false){ // Enquanto ele for false continua dentro do while.
					try {
						novoCliente.setSenha(Long.parseLong(textInput("Senha (Somente números, entre 6 a 8 digitos ): ")));
						SenhaValido = true; //Se ele for verdadeiro , ele sai do while, e continua o codigo .
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Senha Inválido");
					}
				}

				// 
				boolean cpfValido = false;
				while (cpfValido == false){ //== comparação  {
					try {
						novoCliente.setCPF(textInput("CPF: (somente números) "));
						cpfValido = true;
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("CPF Inválido");
					}
				}

				boolean ccValido = false;
				while (ccValido == false){ //== comparação  {
					try {
						novoCliente.setCartaoCredito(Long.parseLong(textInput("Cartão de crédito: (somente números) ")));
						ccValido = true;
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Cartão de crédito Inválido");
					}
				}

				String cadastrar = textInput("Confirmar cadastro (S/N) ?");
				if (cadastrar.equalsIgnoreCase("s")) {
					System.out.println("Cadastro adicionado !!!");
					listaCliente.add(novoCliente);
				} else if (cadastrar.equalsIgnoreCase("n")){
					System.out.println("Cadastro ignorado !!!");
				} else {
					System.out.println("\nOpção inválida seu noob, vou ignorar o cadastro só pra você ter que digitar denovo !!! \n");
				}

				String continua = textInput("Continuar cadastrando (S/N) ?");
				if (continua.equalsIgnoreCase("1")) {
					cadastrando = false;
				} else if (continua.equalsIgnoreCase("s")){
					// se for s sai do if e volta para o inicio do while
				} else {
					System.out.println("\nOpção inválida seu noob, eu vou sair só porque você não colabora !!! \n");
					cadastrando = false;
				}
			}
		}

		private void listarCadastros() {
			if (listaCliente.size() == 0) {
				System.out.println("\nNão existem cadastros !!!\n");
			} else {
				System.out.println("\nLista de Cadastros\n");
				for (int i = 0; i <listaCliente.size(); i++) {
					Cliente d = listaCliente.get(i);
					System.out.println("Cadastro número: " + i);
					System.out.println("\tNome: " + d.getNome());
					System.out.println("\tEmail: " + d.getEmail());
					System.out.println("\tSenha: " + d.getSenha());
					System.out.println("\tTelefone: " + d.getTelefone());
					System.out.println("\tEndereco: " + d.getEndereco());
					System.out.println("\tCPF: " + d.getCPF());
					System.out.println("\tCartão de Crédito: " + d.getCartaoCredito() + "\n");
				}
				System.out.println("\nFim da lista\n");
			}
		}

		private String textInput(String label) {
			System.out.println(label);
			return l.nextLine();
		}
	}

