package br.edu.imed;

// CLASSE DE CADASTRO DE USUARIOS...

	import java.util.List;
	import java.util.Scanner;
	import java.util.ArrayList;

	public class Main {

		private Scanner l;
		private boolean execute;
		private List<Cliente> listaCliente;

		public Main() {
			l = new Scanner(System.in);
			execute = true;
			listaCliente = new ArrayList<Cliente>();

			System.out.println("BEM VINDO AO CADASTRO DE CLIENTE");

			while (execute) {
				String opcao = menu();

				if (opcao.equalsIgnoreCase("n")) {
					cadastrar();
				} else if (opcao.equalsIgnoreCase("l")) {
					listarCadastros();
				} else if (opcao.equalsIgnoreCase("x")) {
					execute = false;
				} else {
					System.out.println("\nOpção Inválida  !!! \n");
				}
			}
		}

		public String menu() {
			System.out.println("Selecione a opção:");
			System.out.println("N - Cadastro");
			System.out.println("L - Editar Cadastro");
			System.out.println("X - Sair");
			return l.nextLine(); 
		}

		public void cadastrar() {
			boolean cadastrando = true;

			while (cadastrando) {
				System.out.println("Cadastro de Usuário");
				Cliente novoCliente = new Cliente();
				
				
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
				novoCliente.setSenha(Integer.parseInt(textInput("Senha: ")));
				novoCliente.setEndereco(textInput("Endereço: "));
				
				// Fazer isso enquanto o while for verdadeiro 
				boolean telefoneValido = false;
				while (telefoneValido == false){ //== comparação  {
					try {
						novoCliente.setTelefone(Integer.parseInt(textInput("Telefone: ")));
						telefoneValido = true;
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Numero de Telefone Inválido");
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
				if (continua.equalsIgnoreCase("N")) {
					cadastrando = false;
				} else if (continua.equalsIgnoreCase("s")){
					// se for s sai do if e volta para o inicio do while
				} else {
					System.out.println("\nOpção inválida seu noob, eu vou sair só porque você não colabora !!! \n");
					cadastrando = false;
				}
			}
		}

		public void listarCadastros() {
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
					System.out.println("\tEndereco: " + d.getEndereco() + "\n");
				}
				System.out.println("\nFim da lista\n");
			}
		}

		public String textInput(String label) {
			System.out.println(label);
			return l.nextLine();
		}
	}

