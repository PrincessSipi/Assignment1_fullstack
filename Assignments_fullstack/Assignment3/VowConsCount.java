public class VowConsCount
{
	static void vowel_conso_count(String s)
	{
		String m = s.replaceAll(" ", ""); // removes white spaces from original String
		String vowels = "aeiou";
		String consonants = "bcdfghjklmnpqrstvwxyz";
		String vow = "";
		String cons = "";
		
		int vowelCount = 0;
		int consCount = 0;
				
		for(int i = 0; i < m.length(); i++)
		{
			String current = Character.toString(m.charAt(i));
			if(vowels.contains(current))
			{
				if(!consonants.contains(current))
				{
					vow += current + "";		
					vowelCount++;
				}
						
			}
			else
			{
				cons += current + "";
				consCount++;
			}
		}
		System.out.println(s);
		System.out.println(" =========================================");
		System.out.println("Vowel and Consonant count");
		System.out.println(vow + "  " + vowelCount );
		System.out.println(cons + "  " + consCount);
	}
	
	public static void main(String[] args) {
		String str = "Hello you";
		vowel_conso_count(str);
	}

}	
