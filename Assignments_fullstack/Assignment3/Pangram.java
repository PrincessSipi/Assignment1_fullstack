import java.util.Arrays;
public class Pangram
{

	public static String pangram(String str)
	{
		String str1 = "abcdefghijklmnopqrstuvwxyz";
		char [] c = str.toCharArray();
		char [] c1 = str1.toCharArray();
		Arrays.sort(c);
		//System.out.println(Arrays.toString(c));
		//System.out.println(Arrays.toString(c1));

		// convert the sorted arrays back to string
		String sorted1 = new String(c);
		String sorted2 = new String(c1);
		
		//compareTo(sorted2) != 0

		if(sorted1.equalsIgnoreCase(sorted2) != true)
			{
				return "Not Pangram";
				
			}
			
		return "Pangram";
			
		
	}

	
	public static void main(String [] args)
	{	
		String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(pangram(text));
		//ABCDEFGHIJKLMNOPQRSTUVWXYZ
	}
}