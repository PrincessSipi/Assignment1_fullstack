import java.util.Scanner;

class Alpha
{
	public void division()
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
		
		{
		catch(ArithmeticException e)
		{
			System.out.println("Please enter a non-zero number");
		}
		System.out.println("Thank you for using my application");
	}
}

class Beta
{
	public void disp()
	{
		Alpha a = new Alpha();
		a.division();
	}
}

public class ExceptionExample2
{
	public static void main(String [] args)
	{
		Beta b = new Beta();
		b.disp();
	}
}