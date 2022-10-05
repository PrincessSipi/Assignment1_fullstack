public class StringConcatenationFun
{
	public static void main (String [] args)
	{
		
		String s1 = "Telusko";
		String s2 = "iNeuron";
		//String s3 = new String("Alien");

		System.out.println(s1);   // prints Telusko
		s1.concat("iNeuron");  	  // unreferenced String
		System.out.println(s1);   // prints Telusko due to string immutability
		s1 = s1.concat("iNeuron");	// referenced String
		System.out.println(s1);   // prints concatenated String
		
		//System.out.println(s1==s3);
		//System.out.println(s1.equals(s3));
		//System.out.println(s1.equals(s4));

		//System.out.println(t1==t2);
		//System.out.println(t3==t2);
		//System.out.println(t3.equals(t2));
	}
}