import java.util.Scanner;

class Alpha1
{
	public void division()
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
	public void disp()
	{
		Alpha1 a = new Alpha1();
		a.division();
	}
}

public class ExceptionExample3
{
	public static void main(String [] args)
	{
		try
		{
			Beta1 b = new Beta1();
			b.disp();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handling in main method");
			System.out.println("Please enter a non-zero denominator");
		}
	}
}