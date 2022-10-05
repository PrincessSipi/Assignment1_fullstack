class Room implements Runnable
{
	synchronized public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getName()+ " has entered the room");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+ " is still in the room");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+ " has left the room");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

public class MlthrdExample7
{
	public static void main(String [] args)
	{
		Room r = new Room();
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);

		t1.setName("LILY");
		t2.setName("DAISY");
		t3.setName("ROSE");

		t1.start();
		t2.start();
		t3.start();
	}

}