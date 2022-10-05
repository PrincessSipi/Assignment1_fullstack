class WrExample
{
	public static void main(String [] args)
	{
		//Character c1 = new Character(97); compilation error at this line
		//Character c1 = new Character("a"); this will also cause an error because of the double quotes
		Character c1 = new Character('a');
		System.out.println(c1);
	}
}