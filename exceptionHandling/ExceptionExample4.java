import java.util.Scanner;

class Alpha1
{
	// illustrating the concept of ducking
	public void division() throws ArithmeticException
	{
	
		System.out.println("Welcome to Exception Handling app");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the numerator");
		int a = scan.nextInt();
		System.out.println("Please enter the denominator");
		int b = scan.nextInt();
		int res = a / b;
		System.out.println("The result is " + res);
		
		System.out.println("Thank you for using my application");
	}
}

class Beta1
{
	// the caller taking responsibility for handling the exception

	public void disp()
	{
		try
		{
			Alpha1 a = new Alpha1();
			a.division();
		}
		catch
		{
			System.out.println("Handled in caller disp()");
			System.out.println("Unacceptable input");
		}
	}
}

public class ExceptionExample4
{
	public static void main(String [] args)
	{
		Beta1 b = new Beta1();
		b.disp();
	}
}