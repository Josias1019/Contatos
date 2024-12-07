package manager;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		
		ContactManager contactManager = new ContactManager();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao Gerenciador de Contatos!");
		
		
		boolean running = true;
		
		while(running)
		{
			
			System.out.println("\n==========Menu==========\n");
			System.out.println("1 Adicionar novo contato");
			System.out.println("2 Remover contato");
			System.out.println("3 Procurar contato");
			System.out.println("4 Listar contatos");
			System.out.println("5 Sair");
			System.out.println("\nEscolha uma opção:");
			
			int choice = input.nextInt();
			input.nextLine();
			
			switch (choice)
			{
			case 1:
				
				System.out.print("Digite o nome do contato: ");
				String name = input.nextLine();
				System.out.print("Digite o telefone: ");
				String phoneNumber = input.nextLine();
				System.out.print("Digite o e-mail: ");
				String email = input.nextLine();
				
				Contact newContact = new Contact(name, phoneNumber, email);
				contactManager.addContact(newContact);
				System.out.println("Contato adcionado com sucesso!");
				break;
				
			case 2:
				
				System.out.print("Digite o nome do contato a ser removido: ");
				String nameToRemove = input.nextLine();
				contactManager.removeContact(nameToRemove);
				break;
				
			case 3: 
				
				System.out.print("Digite o nome do contato a ser procurado: ");
				String nameToSearch = input.nextLine();
				Contact foundContact = contactManager.searchContact(nameToSearch);
				if(foundContact != null)
				{
					System.out.println("Contato encontrado." + foundContact);
				} else 
				{
					System.out.println("Contato não encontrado");
				}
				break;
			
			case 4:
				
				contactManager.listContact();
				break;
				
			case 5:
				
				System.out.println("Saindo do programa...");
				running = false;
				break;
				
			default: 
				
				System.out.println("Opção inválida. Tente novamente.");
				break;
				
			}
			
			
		}
		
		
		input.close();
		
	}
	
}
