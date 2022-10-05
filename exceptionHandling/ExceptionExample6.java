import java.util.Scanner;

class Alpha2
{
	// illustrating the concept of ducking
	public void division() throws ArithmeticException
	{
		try
		{
			System.out.println("Welcome to Exception Handling app");
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the numerator");
			int a = scan.nextInt();
			System.out.println("Please enter the denominator");
			int b = scan.nextInt();
			int res = a / b;
			System.out.println("The result is " + res);
		}
		catch(ArithmeticException e)
		{
			
			System.out.println("Exception handled in division method only");
			throw e; // rethrowing an exception
		}
		
		finally // the finally block for critical code
		{		
			System.out.println("Thank you for using my application");
		}
	}


}


public class ExceptionExample6
{
	public static void main(String [] args)
	{
		System.out.println("Main method connection established");
		try
		{
		Alpha2 a = new Alpha2();
		a.division();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled in main");
		}
	}
}