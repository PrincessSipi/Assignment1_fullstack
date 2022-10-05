import java.util.Scanner;

interface Calculator
{
	void add();
	void sub();
}

class MyCalculator1 implements Calculator
{
	public void add()
	{
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter the first number to add");
		int a = scan1.nextInt();

		Scanner scan2 = new Scanner(System.in);
		System.out.println("Please enter the second number to add");
		int b = scan2.nextInt();

		int c = a + b;
		System.out.println(c);
	}

	public void sub()
	{
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter the first number to subtract");
		int a = scan1.nextInt();

		Scanner scan2 = new Scanner(System.in);
		System.out.println("Please enter the second number to subtract");
		int b = scan2.nextInt();

		int c = a - b;
		System.out.println(c);
	}
}

class MyCalculator2 implements Calculator
{
	public void add()
	{
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}

	public void sub()
	{
		int a = 30;
		int b = 20;
		int c = a - b;
		System.out.println(c);
	}
}

class Cal
{
	public void permit(Calculator ref)
	{
		ref.add();
		ref.sub();
	}
}


public class Launch
{
	public static void main(String [] args)
	{
		MyCalculator1 m1 = new MyCalculator1();
		MyCalculator2 m2 = new MyCalculator2();
		Cal c = new Cal();
		
		c.permit(m1);

		System.out.println("");

		c.permit(m2);

	}
}







