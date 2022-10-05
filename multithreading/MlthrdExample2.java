class Demo1
{
	public void banking()
	{
		System.out.println("Banking task started");

		for(int i = 0; i < 3; i++)
		{
			try
			{
				Thread.sleep(3000);
				System.out.println("Banking..........");
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Banking completed...");
	}
}

class Demo2
{
	public void printing()
	{
		System.out.println("Printing task started");

		for(int i = 0; i < 3; i++)
		{
			try
			{
				Thread.sleep(3000);
				System.out.println("Printing..........");
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Printing completed...");
	}
}

class Demo3
{
	public void calculation()
	{
		System.out.println("Calculation task started");

		for(int i = 0; i < 3; i++)
		{
			try
			{
				Thread.sleep(3000);
				System.out.println("Calculating..........");
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Calculation completed...");
	}
}


public class MlthrdExample2
{
	public static void main(String [] args) throws Exception
	{
		System.out.println("Banking task started");

		for(int i = 0; i < 3; i++)
		{
			Thread.sleep(3000);
			System.out.println("Banking..........");
		}
		System.out.println("Banking completed...");
		System.out.println("---------------------------------------");
		
		System.out.println("Printing activity");

		for(int i = 0; i < 3; i++)
		{
			Thread.sleep(3000);
			System.out.println("Printing..........");
		}
		System.out.println("Printing completed...");
		System.out.println("---------------------------------------");

		System.out.println("Calculation started");

		for(int i = 0; i < 3; i++)
		{
			Thread.sleep(3000);
			System.out.println("Calculating..........");
		}
		System.out.println("Calculation completed...");
		System.out.println("---------------------------------------");
	}
}