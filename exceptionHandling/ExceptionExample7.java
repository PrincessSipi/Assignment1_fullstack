class Demo
{	// try.....finally

	int disp()
	{	try
		{
			System.out.println("Display");
			return 10;
		}
		finally
		{
			System.out.println("Display last line");
		}
	}
}

public class ExceptionExample7
{
	public static void main(String [] args)
	{
		Demo d = new Demo();
		System.out.println(d.disp());
		
	}
}