class Alien
{
	private int age;
	private String name;

	public void setAge(int x)
	{
		if(x > 0)
		{
		age = x;
		}
		else
		{
			System.out.println("Invalid value to my property");
		}
	}

	public int getAge()
	{
		return age;
	}

	public void setName(String x)
	{
		name = x;	
	}
	
	public String getName()
	{
		return name;
	}

}

public class EncapsulationExample1
{
	public static void main(String [] args)
	{
		Alien a = new Alien();
		a.setAge(100);
		System.out.println(a.getAge());
	}
}