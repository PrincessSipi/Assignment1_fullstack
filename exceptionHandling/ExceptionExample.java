import java.util.Scanner;


public class ExceptionExample
{
	public static void main(String [] args)
	{
		try
		{
			System.out.println("Welcome to division app");
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the numerator");
			int a = scan.nextInt();

			System.out.println("Please enter the denominator");
			int b = scan.nextInt();
		
			int res = a / b;
			System.out.println("The result is " + res);
		}
		catch(Exception e) // user defined exception handler
		{
			System.out.println("Zero division error, please provide a non-Zero denominator");
		}
		System.out.println("Thank you for using our application");
	}
}