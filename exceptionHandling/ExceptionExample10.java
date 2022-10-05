import java.util.Scanner;
// custom made exceptions
// must be a child class of Throwable

class InvalidUserInputException extends Exception
{
	InvalidUserInputException(String msg)
	{
		super(msg);
	}	
}


class ATM
{
	private int accountNum = 111;
	private int password = 2222;
	private int accN;
	private int pw;

	public void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the account number");
		accN = scan.nextInt();
		System.out.println("Enter the password");
		pw = scan.nextInt();

	}

	public void verify()throws InvalidUserInputException
	{
		if(accountNum == accN && password == pw)
		{
			System.out.println("Collect your cash");
		}
		else
		{
			/*InvalidUserInputException iue = new InvalidUserInputException();
			 *System.out.println("Invalid credentials");throw iue;
			 */

			throw new InvalidUserInputException("Invalid credentials!");
		}
	}
}

class Bank
{
	// program gives user three chances to enter correct password
	public void initiate()
	{
		ATM a = new ATM();
		try
		{
			a.input();
			a.verify(); 
		}
		catch(InvalidUserInputException e)
		{
			try
			{
				System.out.println(e.getMessage());
				a.input();
				a.verify();
			}
			catch(InvalidUserInputException f)
			{
				try
				{
					System.out.println(f.getMessage());
					a.input();
					a.verify();
				}
				catch(InvalidUserInputException g)
				{
					System.out.println("Card is blocked");
				 	System.exit(0);
				}		
			}		
		}

	}
}


public class ExceptionExample10
{
	public static void main(String [] args)
	{
		Bank b = new Bank();
		b.initiate();
	}

}