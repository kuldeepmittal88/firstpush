package FirstAutomation;

import java.util.Scanner;

public class Login1 {


	public boolean compareUser(String username) {

			
		return username.equals("kuldeepmittal88");

	}

	public boolean comparePass(String b)
	{
		String password= "Neeti@1234";
		boolean z = b.equals(password);		
		return z;

	}

	public static void main(String[] args)
	{


		Scanner input=new Scanner(System.in);
		Login1 login=new Login1();

		System.out.println("Enter Username");
		String username=input.nextLine();
		boolean a=login.compareUser(username);
		if(a)
		{System.out.println("Username is correct");
		System.out.println("Enter Password");
		String password=input.nextLine();
		boolean b=login.comparePass(password);
		if(b)
			System.out.println("You are sucessfully logged in");
		else
			System.out.println("Incorrect Password");
		}
		else 
			System.out.println("Incorrect Username");
	}

}



