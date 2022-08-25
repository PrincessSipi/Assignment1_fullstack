import java.util.Arrays;
public class Anagram1
{

	public static String anagram1(String str, String str1)
	{
		char [] c = str.toCharArray();
		char [] c1 = str1.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		//System.out.println(Arrays.toString(c));
		//System.out.println(Arrays.toString(c1));

		// convert the sorted arrays back to string
		String sorted1 = new String(c);
		String sorted2 = new String(c1);
		
	
		if( sorted1.compareTo(sorted2) != 0)
			{
				return "Not an Anagram";
				
			}
			
		return "Anagram";
			
		
	}

	
	public static void main(String [] args)
	{	
		String text = "listening";
		String text1 = "silent";
		System.out.println(anagram1(text, text1));
	}
}

