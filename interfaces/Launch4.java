interface Demo1
{	
	// implementing the interface and overridding default method

 	void disp();
	default void show()
	{
		System.out.println("Hello I'm in interface");
	}
}

class Alien implements Demo1
{
	// implementing the interface and overriding
	public void disp()
	{
		System.out.println("Implementing display");	
	}

	//public void show()
	//{
	//	System.out.println("I have been overrided in child classs");
	//}
	
}


public class Launch4
{
	public static void main(String [] args)
	{
		Demo1 d = new Alien(); // loose coupling good practice
		d.disp();
		d.show();
	}
}