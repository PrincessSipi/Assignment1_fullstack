class Demo1 extends Thread
{
	public void run()
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
		System.out.println("-----------------------------------------");
		System.out.println();
	}
	
}

class Demo2 extends Thread
{
	public void run()
	{
		printing();
	}
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
		System.out.println("-----------------------------------------");
		System.out.println();
	}
}

class Demo3 extends Thread
{
	public void run()
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
		System.out.println("-----------------------------------------");
		System.out.println();
	}
}


public class MlthrdExample3
{
	public static void main(String [] args)
	{
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();

		d1.start();
		d2.start();
		d3.start();
	}
}