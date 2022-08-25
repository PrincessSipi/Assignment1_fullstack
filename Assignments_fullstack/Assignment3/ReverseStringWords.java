public class ReverseStringWords
{
	public static void main(String [] args)
	{
 		String sentence = "Please come here";
		String [] words = sentence.split(" ");

		for(String word : words)
		{
			int i = word.length()-1;
			while(i >= 0)
			{
			System.out.print(word.charAt(i));
			i--;
			}
		System.out.print(" ");
		}
	}

}