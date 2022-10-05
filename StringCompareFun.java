public class StringCompareFun
{
	public static void main (String [] args)
	{

		// How the compareTo() method works

		String s1 = "Sehwag"; // ASCII values 83 101 104... subtract bottom values from top values if answer is 0 
		String s2 = "Sehwag"; // ASCII values 83 101 104... they are equal
		String s4 = "Savarau"; //  ASCII values 97..

		int a = s1.compareTo(s2);
		int b = s1.compareTo(s4);

		System.out.println(a);
		System.out.println(b);
		

	
	}
}