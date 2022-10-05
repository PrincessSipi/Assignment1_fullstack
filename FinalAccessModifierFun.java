public class FinalAccessModifierFun
{
	public static void main(String [] args)
	{
		final int a = 10;
		int b = 20;
		b++;
		//a++; causes compile time error
		System.out.println(a); 
		System.out.println(b);

		System.out.println("******************************");

		final StringBuilder sb = new StringBuilder("sachin");
		sb.append("IND");
		System.out.println(sb);
		
		//sb =  new StringBuilder("tendulkar"); causes CompileTimeError
		

	}

} 