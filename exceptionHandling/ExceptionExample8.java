class Beta
{	// try.....finally with System.exit()

	void disp()
	{	try
		{
			System.out.println("Display method");
			System.exit(0);
		}
		finally
		{
			System.out.println("Finally");
		}
	}
}

public class ExceptionExample8
{
	public static void main(String [] args)
	{
		Beta b = new Beta();
		b.disp();
		
	}
}