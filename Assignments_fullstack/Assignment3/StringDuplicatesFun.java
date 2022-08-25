public class StringDuplicatesFun
{
	public static void main(String [] args)
	{
 		String sentence = "Pleasssse cccome here";
		System.out.println(sentence);
		System.out.println("=================================");

		String characters  = "";
		String duplicates = "";
		

		for(int i =0; i < sentence.length(); i++)
		{

			String current = Character.toString(sentence.charAt(i));

			if(characters.contains(current))
			{
				if(!duplicates.contains(current)){
					duplicates += current + " ";
				}
			}
			characters += current;
			//System.out.print(characters);
		}
		System.out.println(duplicates);
		
	}

}

