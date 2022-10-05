class Demo2
{
	void disp()
	{
		System.out.println("Parent class overridden method");
	}

}

class Demo3 extends Demo2
{
	void disp()throws ArithmeticException // can throw unchecked exception in the child class, ignore also
	{
		System.out.println("Child class overriding method");
	}

}


public class ExceptionExample9
{
	public static void main(String [] args)
	{
		Demo3 d = new Demo3();
		d.disp();
	}
}

