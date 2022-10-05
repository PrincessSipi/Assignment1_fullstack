class Alpha1 extends Thread
{
	// Multithreading using a single run method
	
	public void run()
	{
		String t = Thread.currentThread().getName();
		if(t.equals("BANK"))
		{
			banking();
		}
		else if(t.equals("PRINT"))
		{
			printing();
		}
		else
		{
			calculation();
		}
	}

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
		System.out.println("-----------------------------------------");
		System.out.println();
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
		System.out.println("-----------------------------------------");
		System.out.println();
	}
}


public class MlthrdExample5
{
	public static void main(String [] args)
	{
		Alpha1 d1 = new Alpha1();
		Alpha1 d2 = new Alpha1();
		Alpha1 d3 = new Alpha1();

		d1.setName("BANK");
		d2.setName("PRINT");
		d3.setName("CALCULATE");

		d1.start();
		d2.start();
		d3.start();
	}
}