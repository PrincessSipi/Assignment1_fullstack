interface Telusko
{
	void disp();

	static void show()
	{
		System.out.println("I'm a static method of an interface interface");
	}

	private void shock()
	{
		System.out.println("I'm private");
	}
}

public class Launch5
{
	public static void main(String [] args)
	{
		Telusko.show();
	}
}