public class StringComparisonFun
{
	public static void main (String [] args)
	{

		// How Memory allocation affects String comparison results
		// Remember  == compares references

		String s1 = "Telusko";  
		String s2 = "iNeuron";
		String s3 = "Telusko" + "iNeuron";
		String s4 = s1 + s2;
		String s5 = s1 + "iNeuron";

		System.out.println(s3 == s4);
	
		

	
	}
}