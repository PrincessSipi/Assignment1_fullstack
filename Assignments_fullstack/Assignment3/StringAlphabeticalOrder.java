import java.util.Arrays;
public class StringAlphabeticalOrder
{
	public static void sort_letters(String str)
	{
		char [] str1 = str.toCharArray();
		Arrays.sort(str1);
		System.out.println(Arrays.toString(str1));
	}

	public static void main(String [] args)
	{	
		String text = "listen";
		sort_letters(text);
		
		
	}
}