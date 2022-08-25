public class ReverseStringFun
{
	public static void main(String [] args)
	{
		String str = "I love cake";
		System.out.println(str);
		System.out.println(str.length());

		System.out.println("=========================");
		for(int i = str.length()-1; i >= 0; i--)
			System.out.println(str.charAt(i));
	}
}

