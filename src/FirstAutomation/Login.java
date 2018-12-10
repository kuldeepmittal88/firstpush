package FirstAutomation;

import java.util.Scanner;

public class Login {

	
	public static void main(String[] args)
	{
		
	String password="Neeti@1234";
	Scanner input= new Scanner(System.in);
	
	System.out.println("Enter Username");
	String username=input.nextLine();
	
	System.out.println("Enter password");
	String password1=input.nextLine();
	
	//boolean a= password==password1;
	//password.contentEquals(password1)
	if (password.equalsIgnoreCase(password1))
		System.out.println("Yor are successfully logged in");
	else
		System.out.println("Incorrect password");
			
		
	}
	
	
	
}
