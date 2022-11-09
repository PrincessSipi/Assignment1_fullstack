class Adder
{  
	static int add(int a, int b)
	{
		return a+b;
	}  // 2 arguments of int data type

	static double add(double a, double b)
	{
		return a+b;
	}  // 2 arguments of double data type 
}
  
class TestOverloading2
{  
	public static void main(String[] args)
	{  
		System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(12.3,12.6));  
	}
} 