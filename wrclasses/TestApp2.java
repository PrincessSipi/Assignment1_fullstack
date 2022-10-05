class TestApp2 
{
	public static void main(String [] args)
	{
		// useage of utility methods
		Integer i3 = Integer.valueOf(10);     // creates a wrapper object of a given primitive or 
		Double d1 = Double.valueOf("10.5"); //without using the new keyword
		Boolean b1 = Boolean.valueOf("Nitin");
		Character c1 = Character.valueOf('a');

		System.out.println(i3);
		System.out.println(d1);
		System.out.println(b1);
		System.out.println(c1);

		
	}
}