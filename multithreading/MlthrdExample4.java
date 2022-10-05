class Demo1 implements Runnable
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

class Demo2 implements Runnable
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

class Demo3 implements Runnable
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


public class MlthrdExample4 
{
	public static void main(String [] args) 
	{
		
		System.out.println("Main Thread executes first");
		Thread t = Thread.currentThread();
		System.out.println(t.isAlive());

		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		Thread t3 = new Thread(d3);

		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());

		t1.start();
		System.out.println(t1.isAlive());
		t2.start();
		t3.start();

		try
		{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException f)
			{
				f.printStackTrace();
			}

		System.out.println("Main Thread completes execution first"); // if join is not there
	}
}