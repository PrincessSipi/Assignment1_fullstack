public class SpecialCharsCount {
	
	public static void special_chars_count(String s)
	{
		
		String characters = "";
		String charSpecial = "";
		int count = 0;
		
		

		for(int i = 0; i < s.length(); i++)
		{
			
			char ch = s.charAt(i);
			int ascii = ch; // returns the character code of ch
			if(ascii >= 9 && ascii <= 13 ||ascii >= 32 && ascii <= 64 ||ascii >= 91 && ascii <= 96 ||ascii  >= 123 && ascii <= 126 )
			{
				String current = Character.toString(s.charAt(i));
				charSpecial += current + " ";
				count++;
			}
			else
			{
				String current = Character.toString(s.charAt(i));
				characters += current;
				//System.out.println(characters);	
			}
		}
		System.out.println("Special characters in text");
		System.out.println("=======================================");
		System.out.println(count);
		System.out.println(charSpecial);
		
	}
	public static void main(String [] args)
	{
		String str = "$£^&*?@~ Hello";
		special_chars_count(str);
	}

}