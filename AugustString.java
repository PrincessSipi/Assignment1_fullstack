public class AugustString
{
	public static void main (String [] args)
	{
		String s1 = "Alien";
		String s2 = "Alien";
		String s3 = new String("Alien");
		String s4 = "alien";

		System.out.println(s1==s2);
		System.out.println(s1==s4);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));

	
	}
}