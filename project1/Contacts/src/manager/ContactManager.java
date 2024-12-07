package manager;

import java.util.ArrayList;

public class ContactManager {

	private ArrayList<Contact> contacts;
	
	public ContactManager()
	{
		contacts = new ArrayList<>();
	}
	
	public void addContact(Contact contact)
	{
		contacts.add(contact);
	}
	 
	public void removeContact(String name)
	{
		boolean removed = contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
		
		if(removed)
		{
			System.out.println("Contato " + name + " removido com sucesso.");
		} else
		{
			System.out.println("Contato com o nome " + name + " não encontrado");
		}
	}
	
	public Contact searchContact(String name)
	{
		for(Contact contact : contacts)
		{
			if(contact.getName().equalsIgnoreCase(name));
			return contact;
		}
		return null;
	}
	
	public void listContact()
	{
		if(contacts.isEmpty())
		{
			System.out.println("Não há contatos cadastrados.");
		} else
		{
			for(Contact contact : contacts)
			{
				System.out.println(contact);
			}
		}
	}

}
