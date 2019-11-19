
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
					System.out.println("OP��O INV�LIDA. TENTE NOVAMENTE. ");
					//System.exit(0);
					break;
					
				} else {
					System.out.println("OP��O INV�LIDA. TENTE NOVAMENTE. ");
				}
			}
		}

		public String menu() {
			System.out.println("Selecione a op��o:");
			System.out.println("1 - Cadastro");
			System.out.println("2 - Mostrar Clientes Cadastros");
			System.out.println("3 - Sair");
			return l.nextLine(); 
		}

		private void cadastrar() {
			boolean cadastrando = true;

			while (cadastrando) {
				System.out.println("Cadastro de Usu�rio");
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
						System.out.println("Email j� existe, Tente novamente");	
					}else {
						emailValido = true;
					}
				}
				

				novoCliente.setNome(textInput("Nome:"));
				novoCliente.setEndereco(textInput("Endere�o: "));

				// Vereficando se o Telefone � inteiro.Fazer isso enquanto o while for verdadeiro 
				boolean telefoneValido = false;
				while (telefoneValido == false){ //== compara��o  {
					try {
						novoCliente.setTelefone(Long.parseLong(textInput("Telefone: (Formato: 55996142062) ")));
						telefoneValido = true;
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Numero de Telefone Inv�lido");
					}
				}

				/// tratamento Senha //
				boolean SenhaValido = false; 
				while (SenhaValido == false){ // Enquanto ele for false continua dentro do while.
					try {
						novoCliente.setSenha(Long.parseLong(textInput("Senha (Somente n�meros, entre 6 a 8 digitos ): ")));
						SenhaValido = true; //Se ele for verdadeiro , ele sai do while, e continua o codigo .
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Senha Inv�lido");
					}
				}

				// 
				boolean cpfValido = false;
				while (cpfValido == false){ //== compara��o  {
					try {
						novoCliente.setCPF(textInput("CPF: (somente n�meros) "));
						cpfValido = true;
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("CPF Inv�lido");
					}
				}

				boolean ccValido = false;
				while (ccValido == false){ //== compara��o  {
					try {
						novoCliente.setCartaoCredito(Long.parseLong(textInput("Cart�o de cr�dito: (somente n�meros) ")));
						ccValido = true;
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Cart�o de cr�dito Inv�lido");
					}
				}

				String cadastrar = textInput("Confirmar cadastro (S/N) ?");
				if (cadastrar.equalsIgnoreCase("s")) {
					System.out.println("Cadastro adicionado !!!");
					listaCliente.add(novoCliente);
				} else if (cadastrar.equalsIgnoreCase("n")){
					System.out.println("Cadastro ignorado !!!");
				} else {
					System.out.println("\nOp��o inv�lida seu noob, vou ignorar o cadastro s� pra voc� ter que digitar denovo !!! \n");
				}

				String continua = textInput("Continuar cadastrando (S/N) ?");
				if (continua.equalsIgnoreCase("1")) {
					cadastrando = false;
				} else if (continua.equalsIgnoreCase("s")){
					// se for s sai do if e volta para o inicio do while
				} else {
					System.out.println("\nOp��o inv�lida seu noob, eu vou sair s� porque voc� n�o colabora !!! \n");
					cadastrando = false;
				}
			}
		}

		private void listarCadastros() {
			if (listaCliente.size() == 0) {
				System.out.println("\nN�o existem cadastros !!!\n");
			} else {
				System.out.println("\nLista de Cadastros\n");
				for (int i = 0; i <listaCliente.size(); i++) {
					Cliente d = listaCliente.get(i);
					System.out.println("Cadastro n�mero: " + i);
					System.out.println("\tNome: " + d.getNome());
					System.out.println("\tEmail: " + d.getEmail());
					System.out.println("\tSenha: " + d.getSenha());
					System.out.println("\tTelefone: " + d.getTelefone());
					System.out.println("\tEndereco: " + d.getEndereco());
					System.out.println("\tCPF: " + d.getCPF());
					System.out.println("\tCart�o de Cr�dito: " + d.getCartaoCredito() + "\n");
				}
				System.out.println("\nFim da lista\n");
			}
		}

		private String textInput(String label) {
			System.out.println(label);
			return l.nextLine();
		}
	}

