class Fan
{
	private int cost;
	private String brand;

	public void setCost(int cost)
	{
		if(cost > 0)
		{
		this.cost = cost;
		}
		else
		{
			System.out.println("Invalid value to my property");
		}
	}

	public int getCost()
	{
		return cost;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;	
	}
	
	public String getBrand()
	{
		return brand;
	}

}

public class EncapsulationExample3
{
	public static void main(String [] args)
	{
		Fan f = new Fan();
		f.setCost(100);
		f.setBrand("Dyson");
		System.out.println(f.getCost());
		System.out.println(f.getBrand());
	}
}