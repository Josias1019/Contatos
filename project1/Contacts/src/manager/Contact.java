package manager;

public class Contact {
	
	private String name;
	private String phoneNumber;
	private String email;
	
	
	
	public Contact(String name, String phoneNumber, String email) {
		if(name == null || name.isEmpty())
		{
			throw new IllegalArgumentException("Nome não pode ser vazio.");
		}
		
		this.name = name;
		setPhoneNumber(phoneNumber);
		setEmail(email);
	}


	 public void setName(String name)
	 {
		 this.name = name;
	 }
	
	public String getName()
	{
		return name;
 	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		if(phoneNumber != null && phoneNumber.trim().matches("\\d+"))
		{
			this.phoneNumber = phoneNumber.trim();
		} else
		{
			throw new IllegalArgumentException("O número de telefone deve conter apenas dígitos numericos!");
		}
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
 	}
	
	public void setEmail(String email)
	{
		if(email != null && email.contains("@" + "gmail.com" + "hotmail.com"))
		{
			this.email = email;
		} else 
		{
			throw new IllegalArgumentException("O e-mail deve conter o caractere '@' e 'gmail.com' ou 'hotmail.com'.");
		}
	}
	
	public String getEmail()
	{
		return email;
 	}
	
	@Override
	public String toString()
	{
		return "Nome: " + name + "\nTelefone: " + phoneNumber + "\nE-mail: " + email;
	}

}
