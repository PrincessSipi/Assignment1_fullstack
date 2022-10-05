// sort this out
import java.util.Scanner;

public class MethodOverloading 
{
	public static void main(String [] args)
	{

		Scanner scan = new Scanner(System.in);

		int num0 = System.in.read() - 48;  // get user input
		int num2 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		Calculator1 calc = new Calculator1();
		Calculator1 calc1 = new Calculator1();

		int result = calc.add(num1, num2);
		int result1 = calc1.add(num1, num2, num3);

		System.out.println(result);
		System.out.println(result1);
	}
		
}

class Calculator1
{
	public int add(int num1, int num2)
	{
		int result = num1 + num2;
		return result;
	}

	public double add(double num1, double num2)
	{
		double result = num1 + num2;
		return result;
	}

	public int add(int num1, int num2, int num3) // Method Overloading
	{
		int result = num1 + num2 + num3;
		return result;
	}
}
