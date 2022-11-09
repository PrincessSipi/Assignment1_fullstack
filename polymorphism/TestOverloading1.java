class Adder
{  
	static int add(int a,int b)
	{
		return a+b;
	} 
	 // 2 arguments


	static int add(int a,int b,int c)
	{
		return a+b+c;
	}  //3 arguments

} 
 
class TestOverloading1
{  
	public static void main(String[] args)
	{  
		System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(11,11,11));  
	}
} 