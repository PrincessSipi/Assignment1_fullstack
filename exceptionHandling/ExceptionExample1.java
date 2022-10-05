import java.util.Scanner;


public class ExceptionExample1
{
	public static void main(String [] args)
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

			System.out.println("Please enter size of array");
			int size= scan.nextInt();
			int ar [] = new int[size];
			System.out.println("Please enter element to be added to array");
			int elem = scan.nextInt();
			System.out.println("Please enter the position at which the element has to be inserted in array");
			int pos = scan.nextInt();
			ar[pos] = elem;
			
		}
		catch(ArithmeticException e) // user defined exception handler
		{
			System.out.println("Please give non-zero denominator");
		}
		catch(NegativeArraySizeException e) // user defined exception handler
		{
			System.out.println("Please give positive number");
		}
		catch(ArrayIndexOutOfBoundsException e) // user defined exception handler
		{
			System.out.println("Please give a number that falls within array boundary");
		}
		catch(Exception e) // user defined exception handler
		{
			System.out.println("Please enter normal input");
		}
		System.out.println("Thank you for using our application");
	}
}

