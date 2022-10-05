interface Calcu
{
	void add();
}

class MyCal2
{
	void sub()
	{
		int a = 30;
		int b = 20;
		int c = a - b;
		System.out.println(c);
	}
}

class MyC extends MyCal2 implements Calcu
{
	public void add()
	{
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
}

public class Launch3
{
	public static void main(String [] args)
	{
		MyC c = new MyC();
		c.sub();
		c.add();
	}
}